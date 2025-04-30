package SolidPrinciple.DependancyInvesionPrinciple.solution;

public class Game {

    GameControl object;

    public Game(GameControl object) {
	this.object = object;
    }

    public void runGame() {
	object.up();
	object.down();
	object.left();
	object.right();
    }

}
