package deadlock;

public class RunableTwo implements Runnable{

	//��������
	private Task task;
	
	public RunableTwo(Task task) {
		this.task =task;
	}

	@Override
	public  void run() {
		task.print2();
	}
	


}
