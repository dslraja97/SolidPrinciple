package in.dp.singleton;

public class SingletonPatternThreadSafe {

    public static void main(String[] args) {
	Runnable task = () -> {
	    Gamer instance = Gamer.getInstance();
	    System.out.println(Thread.currentThread().getName() + ":" + instance.hashCode());
	};

	Thread t1 = new Thread(task, "thread1");
	Thread t2 = new Thread(task, "Thread2");
	Thread t3 = new Thread(task, "Thread3");
	t3.start();
	t1.start();
	t2.start();
    }

}

class Gamer {
    private static Gamer instance;

    private Gamer() {
	System.out.println("Instance created for Gamer");
    }

    public static synchronized Gamer getInstance() {
	if (instance == null) {
	    instance = new Gamer();
	}
	return instance;
    }
}
