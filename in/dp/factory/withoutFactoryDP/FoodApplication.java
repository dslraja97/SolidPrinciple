package in.dp.factory.withoutFactoryDP;

//without Facory Design implementation tightly Coupled , Customer Side explicitly write logic for food selection!
public class FoodApplication {

    public static void main(String[] args) {
	String order = "pizza";
	Food food;

	if (order.equalsIgnoreCase("pizza")) {
	    food = new Pizza();
	} else if (order.equalsIgnoreCase("pasta")) {
	    food = new Pasta();
	} else if (order.equalsIgnoreCase("burger")) {
	    food = new Burger();
	} else {
	    throw new IllegalArgumentException("at this time we dont serve this Food!");
	}

	System.out.println(food.createFood());
    }

}

class Pizza implements Food {

    @Override
    public String createFood() {
	// TODO Auto-generated method stub
	return "Preparing Pizza";
    }

}

class Pasta implements Food {

    @Override
    public String createFood() {
	return "Preparing Pasta";
    }

}

class Burger implements Food {

    @Override
    public String createFood() {
	return "Preparing Burger";
    }

}

interface Food {
    String createFood();
}