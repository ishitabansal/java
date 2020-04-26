class Combination
{
 public static int reverseNumber(int no)
 { 
  int ono=0,rev=0,rem;
  ono=no;
  while(ono!=0)
  {
   rem=ono%10;
   ono/=10;
   rev= (rev*10)+rem;
  }
  return rev;
 
 }
 
 public static void main(String[] args) 
 {
  int no,rem;
  String num=javax.swing.JOptionPane.showInputDialog("Enter Three Digit Number");
  no=Integer.parseInt(num);
  for(int j=0;j<2;j++)
  {
   for(int i=0;i<3;i++)
   {
    rem=no%10;
    no=no/10;
    no=(rem*100)+no;
    System.out.println("numbers are:"+no);
   }
   no=reverseNumber(no);
  } 
 
   
 }
}
