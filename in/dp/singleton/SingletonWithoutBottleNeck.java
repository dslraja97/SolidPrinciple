package in.dp.singleton;

public class SingletonWithoutBottleNeck {

    public static void main(String[] args) {
	Runnable task = () -> {
	    Gammer instance = Gammer.getInstance();
	    System.out.println(Thread.currentThread().getName() + ":" + instance.hashCode());
	};
	Thread t1 = new Thread(task, "thread1");
	Thread t2 = new Thread(task, "thread2");
	Thread t3 = new Thread(task, "thread3");
	Thread t4 = new Thread(task, "thread4");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
    }
}

class Gammer {
    private static volatile Gammer instance;

    private Gammer() {
	System.out.println("Gamer Instance created");
    }

    public static Gammer getInstance() {
	Gammer localInstance = instance;
	if (localInstance == null) {
	    synchronized (Gammer.class) {
		if (localInstance == null) {
		    localInstance = new Gammer();
		}
		instance = localInstance;
	    }
	}
	return localInstance;
    }
}
