package deadlock;

/**
 * 这是主程序，运行，演示死锁。
 */
public class DeadLockDemo {

	public static void main(String[] args) {
		Task task = new Task();
		RunableOne runable1 = new RunableOne(task);
		RunableTwo runable2 = new RunableTwo(task);
		Thread t1 = new Thread(runable1);
		Thread t2 = new Thread(runable2);
		t1.start();
		t2.start();
		System.out.println("结束");

	}

}
