package in.practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FactoryDp {

    public static void main(String[] args) {
	Map<String, Foodfactory> orderMap = new HashMap<>();
	orderMap.put("rice", new RiceChef());
	orderMap.put("briyani", new BriyaniChef());
	orderMap.put("pizza", new PizzaChef());
	Scanner in = new Scanner(System.in);
	System.out.println("Enter ur Order(rice,briyani & pizza): ");
	String order = in.next().toLowerCase();
	Foodfactory foodfactory = orderMap.get(order);
	if (foodfactory != null) {
	    Food createFood = foodfactory.createFood();
	    System.out.println(createFood.prepareFood());
	} else {
	    System.out.println("Please select Food from the given Menu");
	}
    }

}

class Pizza implements Food {

    @Override
    public String prepareFood() {
	// TODO Auto-generated method stub
	return "preparing Pizza";
    }

}

class Rice implements Food {

    @Override
    public String prepareFood() {
	// TODO Auto-generated method stub
	return "Preparing Rice";
    }

}

class Briyani implements Food {

    @Override
    public String prepareFood() {
	// TODO Auto-generated method stub
	return "Preparing Briyani";
    }

}

class PizzaChef implements Foodfactory {

    @Override
    public Food createFood() {
	// TODO Auto-generated method stub
	return new Pizza();
    }

}

class RiceChef implements Foodfactory {

    @Override
    public Food createFood() {
	// TODO Auto-generated method stub
	return new Rice();
    }

}

class BriyaniChef implements Foodfactory {

    @Override
    public Food createFood() {
	// TODO Auto-generated method stub
	return new Briyani();
    }

}

interface Foodfactory {
    Food createFood();
}

interface Food {
    String prepareFood();
}