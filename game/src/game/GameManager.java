package game;

public class GameManager implements GameService {

	@Override
	public void addGame(Game game) {
		System.out.println(game.getGameName()+" added");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getGameName()+" deleted");
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.getGameName()+" updated");
		
	}
}
