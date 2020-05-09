import java.util.HashSet;

public class Exp9_7 {

	public static void main(String[] args) {
		HashSet<Integer> obj= new HashSet();   
obj.add(20);
obj.add(16);      
obj.add(15);
obj.add(5);
HashSet newone=new HashSet();
newone=(HashSet)obj.clone();   
System.out.println(newone);

newone.clear();
System.out.println("After clearing everything : "+ newone);
	System.out.println(obj.contains(3));
	}

}
