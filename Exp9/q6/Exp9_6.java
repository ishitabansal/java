import java.util.HashMap;

public class Exp9_6 {

public static void main(String[] args) {
		HashMap <Integer,String> obj=new HashMap();  
obj.put(1, "ishita");    
obj.put(2, "rajat");
obj.put(3, "nipun");
System.out.println(obj.containsKey(3));    
System.out.println(obj.containsValue("bansal"));  
System.out.println(obj.keySet());  
System.out.println(obj);
	}

}
