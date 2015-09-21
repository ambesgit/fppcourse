package lessoneight;
public class MainApp {
 
		public static void main(String[] args) {
			//problem one 
			Marketing ambes=new Marketing("temprory","you have a short life mr. string",0);
			Marketing myself=new Marketing("good","you have a long life mr. string",0);
			MarketingArrayList m=new MarketingArrayList();
		
			
			m.add(ambes);
			m.add(new Marketing("tetemke","my father is my best man in the whole world -->i hope my mom is not reading this",100));
			m.add(new Marketing("ambes","like books actually next to girls",200));
			m.add(new Marketing("mister","labtop",200));
			m.add(new Marketing("jhon","desktop",200));
			m.add(new Marketing("ambes","like books actually next to girls",2));
		
		System.out.println(m.displayAll());
		System.out.println(m.find(ambes));
		//m.remove(1);
		//m.set(ambes,myself);
		m.sort();
		System.out.println("compare"+m.EMPLOYEENAME.compare(ambes,ambes));
		System.out.println("after removing************");
		System.out.println(m.displayAll());
		System.out.print(m.toString());
		
		//problemTwo
		ProblemTwo pt=new ProblemTwo();
		for(int x=0; x<10; x++){
			pt.add((int)(Math.random()*100));
		}
		System.out.println("size before duplicate is removed "+pt.size());
		pt.removeDuplicate();
		System.out.println("after duplicate is removed "+pt.size());
		pt.remove(1);
		System.out.println("after removed "+pt.size());
		pt.minSort();
		System.out.println(pt.displayAll());
		//System.out.print("size of the sublist "+pt.getRange(3,4));		
		ProblemTwo minsort=new ProblemTwo();
		minsort.add(10);
		minsort.add(12);
		minsort.add(4);
		minsort.add(20);
		//minsort.minSort(minsort);
		//------------------------------------------------------------------------
		ProblemFourDirectory dr=new ProblemFourDirectory ();
		dr.insertFirst("ambes", 7039450620L);
		dr.insertFirst("tetemke", 7039450620L);
		dr.insertFirst("gebremeskel", 7039450620L);
		dr.insertLast("last",34556L);
		dr.deleteFirst();		
		System.out.println(dr.displayList());
		dr.find(7039450620L).displayDirectory();
		System.out.println(dr.size());
		ExtraCredit ex=new ExtraCredit();
		ex.add("apple");
		ex.add("banana");
		ex.add("orange");
		ex.add("lemmon");
		System.out.println(ex.size());
		//ex.remove("orange");
		System.out.println(ex.get("banana"));
		System.out.println(ex.displayAll());
		System.out.println(ex.getLast());
		System.out.println(ex.getFirst());
	}
		
		
		
		
	
}
