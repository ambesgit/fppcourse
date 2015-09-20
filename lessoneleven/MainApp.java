package lessoneleven;

import java.util.HashMap;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
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
//-------------------------------------------------------------------------------
		String aKey;
		   String value;		                               
		   Scanner in = new Scanner(System.in);
		   System.out.print("Enter size of hash table: ");
		   int size =Math.abs( in.next().hashCode());
		                             
		   HashTable theHashTable = new HashTable(size);
		  
		   theHashTable.insert("ambes","FPP");
		   theHashTable.insert("tetemke","Java");
		   theHashTable.insert("babe","SE");
		   theHashTable.insert("hemere","C#");
		   
		     while(true)                   // interact with user
		      {
		      System.out.print("Enter first letter of ");
		      System.out.print("show, insert, delete, or find: ");
		      char choice = in.next().charAt(0); //Read a Char from the console
		      switch(choice)
		         {
		         case 's':
		            theHashTable.displayTable();
		            break;
		         case 'i':
		         System.out.print("Enter key and value to insert: ");
		            aKey = in.next();
		            value = in.next();
		            theHashTable.insert(aKey,value);
		            break;
		         case 'd':
		            System.out.print("Enter key value to delete: ");
		            aKey = in.next();
		            theHashTable.delete(aKey);
		            break;
		         case 'f':
		            System.out.print("Enter key value to find: ");
		            aKey = in.next();
		            System.out.println("Key Found status" + theHashTable.find(aKey));
		            break;
		         default:
		            System.out.print("Invalid entry\n");
		         }
		      }
	}

}
