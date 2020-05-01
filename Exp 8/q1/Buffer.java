public class Buffer
{
    
    public static String toUpperCase(StringBuffer s)
{
    String str = "";
    for(int x=0; x<s.length(); x++){
        char ch = s.charAt(x);
        if(ch >= 'a' && ch <= 'z')
            str += "" + (char)(ch - 32);
        else
            str += "" + ch; 
    }
    return str;
}

public static void main(String[] args)
{
    System.out.println(toUpperCase(new StringBuffer("ishita bansal")));
        System.out.println(toUpperCase(new StringBuffer("rajat panwar")));
      System.out.println(toUpperCase(new StringBuffer("nippun singhal")));
      System.out.println(toUpperCase(new StringBuffer("mansi saini")));
       System.out.println(toUpperCase(new StringBuffer("shivani chauhan")));  
}
}
