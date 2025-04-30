package SolidPrinciple.DependancyInvesionPrinciple;

public class GameConsole {

    public static void main(String[] args) {

	FreeFire pubg = new FreeFire();
	Game game = new Game(pubg);
	game.runGame();

    }

}
