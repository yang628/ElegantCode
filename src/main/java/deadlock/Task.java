package deadlock;

/**
 * ������ ����Ҳ���Ƕ��߳�Ӧ�ô�������飬
 * Ϊ�˲����Ŀ���ִ�У�Ӧ��ע�����
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
			System.out.println("���Ƿ���1�� ��ʼ������2");
			print2();
			System.out.println("���Ƿ���һ��ͬ��������o����˯�ߣ���ʱ���������߳����������������ķ�������Ȼ�������󷽷���");
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
			System.out.println("���Ƿ���2�� ��ʼ������2");
			print1();
			System.out.println(22222);
		}
	}


	
}
