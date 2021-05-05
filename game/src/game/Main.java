package game;

public class Main {

	public static void main(String[] args) {
		Player player=new Player(123456,"Intizar","Aliyeva",2000);
Game game=new Game();
game.setId(1);
game.setGameName("warriors");
game.setPrice(3500);
Campaign campaign=new Campaign(2,"ICampaign");

PlayerManager manager=new PlayerManager(new MernisService());
manager.addPlayer(player);
	}

}
