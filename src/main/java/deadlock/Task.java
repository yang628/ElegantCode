package deadlock;

/**
 * 这里是 任务，也就是多线程应该处理的事情，
 * 为了并发的可以执行，应该注意加锁
 *
 */
public class Task {
	
	Object o= new Object();
	Object oo = new Object();
	
	public void print1()  {
		synchronized(o) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("我是方法1， 开始调方法2");
			print2();
			System.out.println("我是方法一，同步对象是o，先睡眠（留时间让其他线程先请求其他加锁的方法），然后再请求方法二");
		}
	}
	
	public void print2() {
		
		synchronized(oo) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("我是方法2， 开始调方法2");
			print1();
			System.out.println(22222);
		}
	}


	
}
