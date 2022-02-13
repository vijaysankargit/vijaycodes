import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsExample {

	public static void main(String[] args) {
		// ArrayList
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(null);
		System.out.println(arrayList);
		//Linked List
		List<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(1);
		linkedList.add(null);
		System.out.println(linkedList);
		//Hash Set
		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(1);
		hashSet.add(null);
		System.out.println(hashSet);
		//Linked Hash Set
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(1);
		linkedHashSet.add(2);
		linkedHashSet.add(3);
		linkedHashSet.add(1);
		linkedHashSet.add(null);
		System.out.println(linkedHashSet);
		//Tree Set
		Set<Integer> treeHashSet = new TreeSet<Integer>();
		treeHashSet.add(1);
		treeHashSet.add(2);
		treeHashSet.add(3);
		treeHashSet.add(1);
		//treeHashSet.add(null);
		System.out.println(treeHashSet);
		
		
		
		
		
		
		
		
		
		
	}

}
