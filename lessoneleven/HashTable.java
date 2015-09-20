package lessoneleven;
import java.io.*;
import java.util.Scanner;
public class HashTable {
	//demonstrates hash table user defined implementation with linear probing	
	private DataItem[] hashArray;    // array holds hash table
	private int arraySize;
	private DataItem nonItem;        // for deleted items
	//-------------------------------------------------------------
	public HashTable(int size)       // constructor
	   {
	   arraySize = size;
	   hashArray = new DataItem[arraySize];
	   nonItem = null;   // deleted item key is -1
	   }
	//-------------------------------------------------------------
	public void displayTable()
	   {
	   System.out.println("Table: ");
	   for(int j=0; j<arraySize; j++)
	      {
	      if(hashArray[j] != null)
	         System.out.println("Index : " + j + " " + hashArray[j].getKey() + " " + hashArray[j].getValue());
	      else
	         System.out.println("Index : " + j + " " + "**");
	      }
	   System.out.println("");
	   }
	//-------------------------------------------------------------
	public int hashFunc(String key)
	   {
	   return Math.abs(key.hashCode())% Math.abs("ambestetemke".hashCode());       // hash function
	   }
	//-------------------------------------------------------------
	public void insert(String key, String v) // insert a DataItem
	// (assumes table not full)
	   {
	        // extract key
	   int hashVal = hashFunc(key);  // hash the key
	                                 // until empty cell 
	// an index have some data and not match with existing key, it find next vacant position 
	   while(hashArray[hashVal] != null &&
	                   hashArray[hashVal].getKey() != key.hashCode()) 
	      {
	      ++hashVal;                 // go to next cell
	      hashVal %= arraySize;      // wraparound if necessary
	      }
	   DataItem obj = new DataItem(key.hashCode(),v);
	   hashArray[hashVal] = obj;    // insert item
	   }  // end insert()
	//-------------------------------------------------------------
	public DataItem delete(String key)  // delete a DataItem
	   {
	   int hashVal = hashFunc(key);  // hash the key

	   while(hashArray[hashVal] != null)  // until empty cell,
	      {                               // found the key?
	      if(hashArray[hashVal].getKey() == key.hashCode())
	         {
	         DataItem temp = hashArray[hashVal]; // save item
	         hashArray[hashVal] = nonItem;       // delete item
	         return temp;                        // return item
	         }
	      ++hashVal;                 // go to next cell
	      hashVal %= arraySize;      // wraparound if necessary
	      }
	   return null;                  // can't find item
	   }  // end delete()
	//-------------------------------------------------------------
	public boolean find(String key)    // find item with key
	   {
	   int hashVal = hashFunc(key);  // hash the key

	   while(hashArray[hashVal] != null)  // until empty cell,
	      {                               // found the key?
	      if(hashArray[hashVal].getKey() == key.hashCode())
	         return true;   // yes, return item
	      ++hashVal;                 // go to next cell
	      hashVal %= arraySize;      // wraparound if necessary
	      }
	   return false;                  // can't find item
	   }
	//-------------------------------------------------------------
	}  // end class HashTable

////////////////////////////////////////////////////////////////
class DataItem
{                                // (could have more data)
private int iData;               // data item (key)
private String value;
//--------------------------------------------------------------
public DataItem(int ii, String v)          // constructor
{ iData = ii;
value = v;
}
//--------------------------------------------------------------
public int getKey()
{ return iData; }
public String getValue()
{ return value; }
//--------------------------------------------------------------
}  // end class DataItem
////////////////////////////////////////////////////////////////
