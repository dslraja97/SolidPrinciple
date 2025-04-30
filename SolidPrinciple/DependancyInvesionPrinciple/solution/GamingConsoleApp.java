package SolidPrinciple.DependancyInvesionPrinciple.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GamingConsoleApp {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Map<String, GameControl> gameMap = new HashMap<>();

	gameMap.put("pubg", new Pubg());
	gameMap.put("freefire", new FreeFire());
	Scanner in = new Scanner(System.in);
	System.out.println("enter the game name to Play(Pubg or FireFire)");
	String gameName = in.next().toLowerCase();
	GameControl gameControl = gameMap.get(gameName);
	Game game = new Game(gameControl);
	game.runGame();
    }

}
