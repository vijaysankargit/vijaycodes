

class A{
	 static void a() {
		System.out.println("parent A method");
	}
}

class B extends A{
	 static void a() {
		System.out.println("child B method");
	}
}
public class StaticExample {

	public static void main(String[] args) {
		//We can Override Static Methods but it always hides one static method and calls another method based on Object Declaration's Variable Type
		//for ex:If Variable Type is A,Base class a() method will be called and vice versa
		//But if we declare Same Instance methods for Parent and Child Class,Then call will be based on Object Declaration's Object Type.
		A obj = new A();
		obj.a();

	}

}
