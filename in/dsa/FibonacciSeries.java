package in.dsa;

public class FibonacciSeries {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int n = 3;
	fibanocciSeries(n);
    }

    private static void fibanocciSeries(int n) {
	int a = 0, b = 1;
	System.out.println("The Fibnacci Series of " + n + " is :" + a + " " + b + " ");
	for (int i = 2; i <= n; i++) {
	    int c = a + b;
	    System.out.print(c + " ");
	    a = b;
	    b = c;
	}
    }

}
