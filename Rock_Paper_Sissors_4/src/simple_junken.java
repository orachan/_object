//package Rock_Paper_Sissors_1.main;
	
public class simple_junken{

	public static void main(String[] args) {
		judge Saito = new judge();
		player Murata = new player("村田さん");
		Tactics muratatactics = new RandomTactics();
		Murata.setTactics(muratatactics);
		
		player Yamada = new player("山田さん");
		Tactics yamadatactics = new RandomTactics();
		Yamada.setTactics(yamadatactics);
		
		Saito.startJanken(Murata, Yamada);
	}
	}