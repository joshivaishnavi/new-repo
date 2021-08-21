import java.io.*;
import java.util.*;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
		
		System.out.println("Enter length N : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter elements : ");
		for(int i = 0; i < n ; i++) {
			list.add(sc.nextInt());
		}
		
//	    list.add(20);
//	    list.add(30);
//	    list.add(40);
	    
	    System.out.println("List Size :"+list.size());
	
	    System.out.println("While Loop");
	    
	    Iterator<Integer> itr = list.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	    
	    System.out.println("Advanced For Loop / For Each Loop");
	    
	    for( Object obj : list ) {
	    	System.out.println(obj);
	    }
		
	    
	    System.out.println("For Loop");
	    for( int i = 0; i< list.size(); i++ ) {
	    	System.out.println(list.get(i));
	    }
	    
	}
	

}
