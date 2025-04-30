package in.dp.factory.FactoryDesignPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FoodApplication {

    public static void main(String[] args) {
	Map<String, FoodFactory> factryMap = new HashMap<>();
	factryMap.put("pizza", new PizzaFactory());
	factryMap.put("pasta", new PastaFactory());
	factryMap.put("burger", new BurgerFactory());
	Scanner in = new Scanner(System.in);
	System.out.println("Please Enter the Food:");
	String input = in.next().toLowerCase();

	FoodFactory foodFactory = factryMap.get(input);

	if (foodFactory != null) {
	    Food food = foodFactory.createOrder();
	    food.createFood();
	} else {
	    System.out.println("Sorry for inconvience right now we didnt servve this Food");
	}

    }

}

class Pizza implements Food {

    @Override
    public void createFood() {
	// TODO Auto-generated method stub
	System.out.println("Prepare Pizza");
    }

}

class Pasta implements Food {

    @Override
    public void createFood() {
	// TODO Auto-generated method stub
	System.out.println("Prepare Pasta");
    }

}

class Burger implements Food {

    @Override
    public void createFood() {
	// TODO Auto-generated method stub
	System.out.println("Prepare Burger");
    }

}

//Concrete Class for the Food factory instead of Waiter
abstract class FoodFactory {
    abstract Food createOrder();
}

class PizzaFactory extends FoodFactory {

    @Override
    Food createOrder() {
	// TODO Auto-generated method stub
	return new Pizza();
    }

}

class BurgerFactory extends FoodFactory {

    @Override
    Food createOrder() {
	// TODO Auto-generated method stub
	return new Burger();
    }

}

class PastaFactory extends FoodFactory {

    @Override
    Food createOrder() {
	// TODO Auto-generated method stub
	return new Pasta();
    }

}

interface Food {
    void createFood();
}