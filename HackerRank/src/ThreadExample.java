

 class thread extends Thread{
	 public void run(){
		 System.out.println("child thread using Thread class");
	 }
	  public thread(int x) {
		 ++x;
		 System.out.println(x);
	 }
	 
}
 class thread1 implements Runnable {
	 public void run(){
		 System.out.println("child thread using Runnable Interface");
	 }
 }
public class ThreadExample {

	public static void main(String[] args) {
		int x = 5;
		thread threadClassObj = new thread(x);
		thread threadClassObj2 = new thread(x); //If the variable value is changed in threadClassObj,then its updated value will not be reflected for threadClassObj2.
		                                        //For that case ,Volatile keyword is used to fetch all the copies of the variable and gets the updated value for upcoming threads.
		threadClassObj.start();
		System.out.println("Is Thread Alive" + threadClassObj.isAlive());
		
		//threadClassObj.stop();
		thread1 threadRunnableObj = new thread1();
		threadRunnableObj.run();
		System.out.println("Is Thread Alive" + threadClassObj.isAlive());
	}

}
