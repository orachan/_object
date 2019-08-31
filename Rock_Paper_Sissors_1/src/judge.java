
public class judge {
	public void startJanken( player player1, player player2 ) {
		System.out.println("【ジャンケン開始】\n");
		
		for (int cnt = 0; cnt < 3; cnt++) {
			System.out.println( "【"+(cnt + 1)+"回戦】" );
			
			player Winner = judgeJanken(player1,player2);
			
			if(Winner != null) {
				System.out.println("\n" + Winner.getName() + "が勝ちました。");
				Winner.notifyResult(true);
			}
			else {
				System.out.println("\n 引き分けです。");
				
			}
			
		}
		
		System.out.println("【ジャンケン終了】");
		
		player finalWinner = judgeFinalWinner(player1,player2);
		
		
		if(finalWinner != null ) {
			System.out.println("\n" + finalWinner.getName() + "が勝ちました。" );
		}
		else {
			System.out.println("\n 引き分けです。");
		}
	}
	
	private player judgeJanken(player player1,player player2) {
		
		player winner = null;
		int player1Hand = player1.show_hand();
		printHand(player1Hand);
		System.out.println("VS");
		
		int player2Hand = player2.show_hand();
		printHand(player2Hand);
		
		System.out.println("\n");
		
		//プレイヤ1が勝条件
		if((player1Hand == player.STONE && player2Hand == player.SCISSORS)
				|| (player1Hand == player.SCISSORS && player2Hand == player.PAPER)
				|| (player1Hand == player.PAPER && player2Hand == player.STONE)) {
			winner = player1;
		}
		
//プレイヤ2が勝条件
		else if((player2Hand == player.STONE && player1Hand == player.SCISSORS)
				|| (player2Hand == player.SCISSORS && player1Hand == player.PAPER)
				|| (player2Hand == player.PAPER && player1Hand == player.STONE )) {
			winner = player2;
		}
		return winner;
	}
	
	private player judgeFinalWinner(player player1,player player2) {
		player finalWinner = null;
		
		int player1Wincount = player1.getWinCount();
		int player2Wincount = player2.getWinCount();
		
		if(player1Wincount > player2Wincount) {
			finalWinner = player1;
		}
		else if(player1Wincount < player2Wincount){
			finalWinner = player2;
		}
		return finalWinner;
	}
	
	private void printHand(int hand) {
		switch(hand) {
		case player.STONE:
			System.out.println("グー");
			break;
		
		case player.SCISSORS:
			System.out.println("チョキ");
			break;
			
		case player.PAPER:
			System.out.println("パー");
			break;
		default:
			break;
		}
		
	}

}
