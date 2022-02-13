
 class parent{
	 parent(){
		 System.out.println("parent constructor");
	 }
	 void check(){
		System.out.println("parent check method");
	}
}
 class child extends parent{
	 child(){
		 //super();
		 System.out.println("child constructor");
	 }
	 void check(){
		System.out.println("child check method");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		child ch = new child();
		ch.check();
	}

}
