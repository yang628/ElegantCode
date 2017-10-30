package deadlock;

public class RunableTwo implements Runnable{

	//处理数据
	private Task task;
	
	public RunableTwo(Task task) {
		this.task =task;
	}

	@Override
	public  void run() {
		task.print2();
	}
	


}
