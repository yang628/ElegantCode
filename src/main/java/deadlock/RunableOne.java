package deadlock;

/**
 * ���߳�ִ�е�����ÿ������
 * 1.ÿ��������ִ���ǲ�ͬ�ģ�����Ҫд���Runable,�����߳�֮��
 * 2.ÿ��������ִ�е�����ͬ�ģ�����Ը��á�
 */
public class RunableOne  implements Runnable {
	
	//��������
	private Task task;
	
	public RunableOne(Task task) {
		this.task =task;
	}

	@Override
	public  void run() {
		task.print1();
	}
	

	

}
