package in.dp.singleton;

public class SingletonPattern {

    public static void main(String[] args) {
	Game g1 = Game.getInstance();
	Game g2 = Game.getInstance();
	if (g1 == g2) {
	    System.out.println("both are equal");
	}

    }

}

class Game {
    private static Game instance;

    private Game() {
	System.out.println("Game Instance Created");
    }

    public static Game getInstance() {
	if (instance == null) {
	    instance = new Game();
	}
	return instance;
    }

}
