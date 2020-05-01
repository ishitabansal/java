public class Name
{
   public static void main(String[] args)
{     int j;
       int incr=0;
   String n="Ishita bansal";
   System.out.println("Name is:-"+n);
    System.out.println("length of the string is:- "+n.length());     //find the length of given string
     for(j=0;j<n.length();j++)
       {
           if(n.charAt(j)=='s' || n.charAt(j)=='s')
              {
                 incr++;
                 System.out.println("position of element s:-"+j);
                 System.out.println("element is found"+incr+"times");
               }
            
          }
       if(incr==0)
         {
              System.out.println("This string has no 's' elemnt");
          }
}

}
