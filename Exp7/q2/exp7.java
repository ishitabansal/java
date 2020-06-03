package ishita;
public class exp7
{
 public static void main(String[] args)
 {
  int n=0,m=10,r=0;
  try
  {
   r=m/n;
  }
  catch(ArithmeticException e)
  {
   System.out.println("error");
  }
}
} 
