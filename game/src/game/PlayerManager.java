package game;



public class PlayerManager  implements PlayerService {
private PlayerCheckService playerChechService;

	public PlayerManager(PlayerCheckService playerChechService) {
	super();
	this.playerChechService = playerChechService;
}

	@Override
	public void addPlayer(Player player)  {
		if (playerChechService.chechIfRealPerson(player)) {
			System.out.println(player.getFirstName()+" added");
		} else {
			System.out.println("Error");
		}
		
	}

	@Override
	public void deletePlayer(Player player) {
		System.out.println(player.getFirstName()+" deleted");
		
	}

	@Override
	public void updatePlayer(Player player) {
		System.out.println(player.getFirstName()+" updated");
		
	}

//	@Override
//	public boolean chechIfRealPerson(Player player) {
//		System.out.println("player");
//		return false;
//	}

}
