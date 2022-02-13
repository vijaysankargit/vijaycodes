import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparablecomparatorExample {

	public static void main(String[] args) {
		
		List<Laptop> laptopList = new ArrayList<>(); 
		laptopList.add(new Laptop(10,"vijay"));
		laptopList.add(new Laptop(40,"arun"));
		laptopList.add(new Laptop(30,"param"));
		laptopList.add(new Laptop(20,"sulo"));
		//Comparable Example
		Collections.sort(laptopList);
		System.out.println("Sorting Using Comparable");
		for(Laptop l: laptopList) {
			System.out.println(l);
		}
		//Comparator Example
		Comparator<Laptop> cc = new Comparator<Laptop>() {
			@Override
			public int compare(Laptop o1, Laptop o2) {
				if(o1.getLid() > o2.getLid()) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		Collections.sort(laptopList, cc);
		System.out.println("Sorting Using Comparator");
		for(Laptop l: laptopList) {
			System.out.println(l);
		}
		
		
		
		
}}
