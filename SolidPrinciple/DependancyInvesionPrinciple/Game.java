package SolidPrinciple.DependancyInvesionPrinciple;

public class Game {

//    Pubg object;

    FreeFire object;

    public Game(FreeFire object) {
	this.object = object;
    }

    public void runGame() {
	object.up();
	object.down();
	object.left();
	object.right();
    }

}
