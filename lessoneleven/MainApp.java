package lessoneleven;

import java.util.HashMap;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("---------------------Problem---111111111111------");
		HashMap<String,Course> course=new HashMap<String,Course>();		
		course.put("cs390",new Course("fpp",new String[]{"Renuka","Joe Lemon","Paul"}));
		course.put("sci100",new Course("sci",new String[]{"Moral","Frank"}));
		System.out.println("keys in the hashmap------->:");
		System.out.println(course.keySet());
		System.out.println("values in the hashmap------>:");
		System.out.println(course.values());
		System.out.println("elements in the hashmap------->:");
		System.out.println(course.toString());
		System.out.println("Size of the hashmap------->:");
		System.out.println(course.size());
		System.out.println("---------------------Problem---222222222222222-------");
		HashTable n=new HashTable("ambestetemkegebre@gmail.com");
		System.out.println("size of the hashtable:---> ");
		System.out.println(n.size());
		System.out.println(n.insert("ambes1@gmail.com", "ambasager"));
		System.out.println(n.insert("tesfaye@gmail.com", "ambasager"));
		System.out.println(n.insert("hailish@yahoo.com", "ambasager"));
		System.out.println(n.insert("1ambes@gmail.com", "tetemke"));
		System.out.println("display all records in the hashtable: --->");
		System.out.println(n.show());
		System.out.println("find the person with 1ambes@gmail.com:--> ");
		System.out.println(n.find("1ambes@gmail.com"));
		System.out.println("delete the person with 1ambes@gmail.com-->: ");
		System.out.println(n.delete("1ambes@gmail.com"));
		System.out.println("show the last deleted person:----> ");
		System.out.println(n.removedContect);

	}

}
