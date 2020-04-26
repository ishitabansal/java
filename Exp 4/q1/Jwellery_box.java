class Box
{
private int l,b;
Box(int x,int y)
{l=x; b=y;};
int area()
{
 return(l*b);
}
}
class Rectangle extends Box
{
 int h;
 Rectangle(int x,int y,int z)
 {
   super(x,y);
   h=z;
 }
 int volume()
 {
 return(area()*h);
 }
}
 public class Jwellery_box
{ 
 public static void main(String[] args)
 {
  Rectangle rc=new Rectangle(10,20,15);
  int a1=rc.area();
  int v1=rc.volume();
  System.out.println("Area of room:"+a1);
  System.out.println("Volume of room:"+v1);
 }
}
