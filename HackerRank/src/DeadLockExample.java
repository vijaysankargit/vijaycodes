

public class DeadLockExample{
	public static void main(String args[]) {
		String s1 = "vijay";
		String s2 = "arun";
		Thread t1 = new Thread() {
			public void run() {
				synchronized (s1) {
					try {
						System.out.println(Thread.currentThread().getName() + "locked" + s1);
						sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
				synchronized (s2) {
					try {
						System.out.println(Thread.currentThread().getName() + "locked" + s2);
						sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (s2) {
						System.out.println(Thread.currentThread().getName() + "locked" + s2);
				
				synchronized (s1) {
					try {
						System.out.println(Thread.currentThread().getName() + "locked" + s1);
						sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			}
		};
		t1.start();
		t2.start();
	}
	
}