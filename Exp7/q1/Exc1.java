import java.util.*;
 public class Exc1 {
  
           public static void main(String[] args)
             { 
                for(int i=0;i<10;i++) {
              Scanner sc=new Scanner(System.in);
  
              System.out.println("enter the name : ");
               String name=sc.nextLine();
               System.out.println("Enter roll no : ");
                int rollno=sc.nextInt();
               }
             Exc1 arr[]=new Exc1[10];
                try {
                    for(int k=0;k<20;k++)
                       {
                          arr[k]=new Exc1();
                       }
                     }
                 
                catch(ArrayIndexOutOfBoundsException e)
                  {
                    System.out.println("Exception");
                   }
                              
}
}

