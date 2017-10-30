package deadlock;

/**
 * 多线程执行的任务，每个任务：
 * 1.每个任务所执行是不同的，即需要写多个Runable,放入线程之中
 * 2.每个任务所执行的是相同的，则可以复用。
 */
public class RunableOne  implements Runnable {
	
	//处理数据
	private Task task;
	
	public RunableOne(Task task) {
		this.task =task;
	}

	@Override
	public  void run() {
		task.print1();
	}
	

	

}
