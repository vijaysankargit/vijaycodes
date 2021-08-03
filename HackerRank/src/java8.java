import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface Runnable{
	public void run();
}
//Functional Interface having one Abstract Method
interface JavaInterface{
	void showInterfaceInfo();
	default void defaultMethod() {
		System.out.println("Default method in Interface");
	}
	static void staticMethod() {
		System.out.println("Static method in Interface");
	}
}

public class java8 implements JavaInterface{
	
	String normalVar;
	
	@Override
	public void showInterfaceInfo() {
		// TODO Auto-generated method stub
		
	}
	public int reflectionMethod(int a, int b) {
		return a+b;
	}
	
	static void staticMethodReference() {
		System.out.println("Static Method Reference Call");
	}
	
	public void instanceMethodReference() {
		System.out.println("Instance Method Reference Call");
	}
	
	java8(){
		System.out.println("Constructor Reference Call");
	}
	
	private static void checkTypeInference(List<Integer> arrayList, int i, int j) {
		arrayList.add(i);
		arrayList.add(j);
		System.out.println(arrayList);
	}

	public static void main(String[] args) {
		//Lambda Expression.
		Runnable a = () -> {System.out.println("I'm Running");};
		a.run();
		//Relection API => Used to Manipulate Class which includes fields,Methods and parameters at runtime.
		java8 lambda1 = new java8();
		Class<? extends java8> lambdaClass = lambda1.getClass();
		System.out.println("Name of the class" + lambdaClass.getName());
		System.out.println("Methods in the class" + lambdaClass.getDeclaredMethods());
		Method[] method = lambdaClass.getMethods();
		Stream<Method> arrStream = Arrays.stream(method);
		arrStream.forEach(action -> System.out.println("All methods in class lambda" + action));
		System.out.println("method parameter count" + method[1].getParameterCount());	
		System.out.println("method name" + method[2].getName());
		System.out.println("method return type" + method[1].getReturnType());	
		Parameter[] parameters = method[1].getParameters();
		System.out.println("method parameters" + parameters[0].getName() + parameters[1].getName());
		System.out.println("method parameter types" + parameters[0].getType() + parameters[1].getType());	
		//Encoding and Decoding Using Base64 Class
		Base64.Encoder base64encode = Base64.getEncoder();
		byte[] byteString = "Hi I am Vijay".getBytes();
		String encodedString = base64encode.encodeToString(byteString);
		System.out.println("The Encoded String " + encodedString);
		Base64.Decoder base64decode = Base64.getDecoder();
		byte[] decodedByteString = base64decode.decode(encodedString);
		String decodedString = new String(decodedByteString);
		System.out.println("The Decoded String " + decodedString);
		//Collectors is a final class that extends Object class which is used to collect elements and Manipulate the elements
		List<Integer> elementList = new ArrayList<>();
		elementList.add(10);
		elementList.add(20);
		elementList.add(30);
		Integer sumAmount = elementList.stream().collect(Collectors.summingInt(mapper -> mapper.intValue()));
		System.out.println(sumAmount);
		//Parallel Array Sorting is used to sort Array in Parallel manner rather than Old sequential mannaer.
		//Parallel Array Sorting Uses concept of Multithreading to sort the Array.
		//Parallel Array Sorting takes less time to sort than the normal Array Sorting.
		int[] arr = {10,30,60,50,20};
		System.out.println("Before Parallel Array Sorting");
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("After Parallel Array Sorting");
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		//Method Reference is used to call a Method(static method,instance method,constructor) using Scope Resolution Operator(::)
		//Its primary uses are to call the method of functional interface and use '::' operator to separate the class or object from the method name. For example, className::methodName or object::methodName.
		//Static Method Reference
		JavaInterface ji = java8::staticMethodReference;
		ji.showInterfaceInfo();
		//Instance Method Reference
		JavaInterface ja = lambda1::instanceMethodReference;
		ja.showInterfaceInfo();
		//Constructor Reference
		JavaInterface jk = java8::new;
		jk.showInterfaceInfo();
		//ForEach Method is mostly used to iterate collections like List.set etc., and also Iterate Streams.
		elementList.forEach(action -> System.out.println(action));
		//ForEach Using Method Reference.
		elementList.forEach(System.out::println);
		//ForEachOrdered With Streams API
		IntStream streamVar = Arrays.stream(arr);
		streamVar.forEachOrdered(System.out::println);
		//StringJoiner is used to separate a sequence of characters from a string using delimiter such as , or : etc.,
		StringJoiner sj = new StringJoiner(",");
		sj.add("India");
		sj.add("USA");
		sj.add("Russia");
		StringJoiner mergeString = new StringJoiner(":");
		mergeString.add("Pakistan");
		mergeString.add("China");
		System.out.println("String Joiner1: " + sj);
		System.out.println("String Joiner2: " + mergeString);
		sj.merge(mergeString);
		System.out.println("Merged StringJoiner" + sj);
		//Default and static Method in Interface is used to allow developers to add methods 
		//which are non-abstract rather than having only abstract methods in interface without affecting the classes which implements this interface
		lambda1.defaultMethod();
		JavaInterface.staticMethod();
		//Functional Interface is an interface which will be having only one abstract method
		//Functional Interface supports Lambda expression and Method reference
		JavaInterface jit = () -> System.out.println("Functional Interface Using Lambda");
		jit.showInterfaceInfo();
		JavaInterface jat = lambda1::instanceMethodReference;
		jat.showInterfaceInfo();
		//Optional Class is used to handle nullpointer exceptions.
		
		Optional<String> optionalVar = Optional.ofNullable(lambda1.normalVar);
		if(optionalVar.isPresent()) {
			char nonNullString = lambda1.normalVar.charAt(0);
			System.out.println(nonNullString);
		}else {
			System.out.println("The Value is NULL");
		}
		//Type Inference is a process in which compiler automatically detects the datatype of an expression based on the input without explicitly specifying it.
		//Type Inference reduces code Verbosity(Too many Lines)
		//Java earlier versions
		List<Integer> typeInferList = new ArrayList<Integer>();
		typeInferList.add(100);
		typeInferList.add(101);
		System.out.println(typeInferList);
		//Java 7 version
		typeInferList = new ArrayList<>();
		typeInferList.add(102);
		typeInferList.add(103);
		System.out.println(typeInferList);
		//Java 8 version:Type Inference for generic methods
		checkTypeInference(new ArrayList<>(), 10 , 20 );
		//Type Inference in Lambda Expression
		typeInferList.forEach(action -> System.out.println(action));
		//Date and Time API
		//Before java 8, we used java.util.Date but it is not thraed-safe,Poor design and difficult zone handling.
		//In Java 8 Date and Time API(java.time),All classes are immutable and thread safe
		LocalDate ld = LocalDate.parse("2020-03-24");
		LocalDateTime ldt = LocalDateTime.of(2020,03,24,12,12);
		LocalTime lt = LocalTime.of(12,12,12);
		ZonedDateTime zdt = ZonedDateTime.of(2020,03,24,12,12,12,0, ZoneId.systemDefault());
		OffsetDateTime date = OffsetDateTime.parse("2017-02-03T12:30:30+01:00");
		OffsetTime time = OffsetTime.parse("12:30:30+01:00");
		System.out.println("LocalDate"+ld+"\n"+"LocalDateTime"+ldt+"\n"+"LocalTime"+lt+"\n"+"ZonedDateTime"+zdt+"\n"+"OffsetDateTime"+date+"\n"+"OffsetTime"+time);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	}


