package in.dp.factory.partialFactoryDesignPattern;

//Partial Factory Design Patter is Achieved but still it Violating the Open & close principle so need to improve that 
//here at the FoodFactory Class still we use condition in future any increase the Food item mean that time we need to modify that code .
public class FoodApp {

    public static void main(String[] args) {
	String order = "burger";
	Food food = FoodFactory.getFood("PiZzA");
	food.createFood();
    }
}

class Burger implements Food {
    @Override
    public void createFood() {
	// TODO Auto-generated method stub
	System.out.println("preparing Burger");
    }
}

class Pizza implements Food {

    @Override
    public void createFood() {
	System.out.println("Preparing Pizza");
    }

}

class Pasta implements Food {

    @Override
    public void createFood() {
	System.out.println("Preparing Pasta");
    }

}

class FoodFactory {
    public static Food getFood(String order) {
	Food food;
	if (order.equalsIgnoreCase("pizza")) {
	    food = new Pizza();
	} else if (order.equalsIgnoreCase("burger")) {
	    food = new Burger();
	} else if (order.equalsIgnoreCase("pasta")) {
	    food = new Pasta();
	} else {
	    throw new IllegalArgumentException("we Dont serve this food!");
	}
	return food;
    }
}

//base interface 
interface Food {
    public void createFood();
}
