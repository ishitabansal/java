public class Fibb
{
  public static void main(String args[])
  {
    int a=0,b=1,c;
    for(int j=0;j<=10;j++)
    {
     c=a+b;
     System.out.println(c);
     a=b;
     b=c;
    }
  }
}
