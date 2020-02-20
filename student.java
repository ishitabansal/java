class Marks
{
 int marks;
 string grade;
 
 void calculategrade()
 {
  if (marks>=40)
    grade = "pass";
  elseif(marks>=51)
    grade = "merit";
  elseif(marks>=75)
    grade = "distinction";
  else
    grade = "fail";
  }
}

pulic class Record
{
 public static void main(String args[])
 {
  Scanner SC = new Scanner(system.in);
  Marks obj[] = new Marks[10];
  for(int i=0; i<=10; i++)
  {
   obj[i].marks = SC.nectInt();
   obj[i].calculategrade();
  }
  