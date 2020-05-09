import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Exp9_5 {

	public static void main(String[] args) {       
	ArrayList<Integer> obj=new ArrayList();  //making object of arraylist
	obj.add(20);
	obj.add(8);
	obj.add(5);
	Iterator it=obj.iterator();   
	while(it.hasNext())
	{
	System.out.println(it.next());	 
	}
ArrayList newone=new ArrayList();
newone=(ArrayList)obj.clone();  
System.out.println(newone);
Collections.reverse(obj);
System.out.println(obj);      
	}

}
