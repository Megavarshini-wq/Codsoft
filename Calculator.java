import java.util.*;
class Calculator
{
  public static void main(String args[])
  {
     Scanner s=new Scanner(System.in);
     System.out.print("Total no of subjects: ");
     int n=s.nextInt();
     int mark[]=new int[n];
     for(int i=0;i<n;i++)
     {
       System.out.print("Enter mark "+(i+1)+": ");
       int score=s.nextInt();
       mark[i]=score;
     }
     int tot=0;
     for(int i=0;i<n;i++)
     {
       tot+=mark[i];
     }
     float avg=(tot/n);
     System.out.println("Total marks obtained: "+tot);
     System.out.println("Average percentage: "+avg+"%");
     if(avg>=95)
      System.out.println("Grade - O");
     else if(avg>=90 && avg<95) 
      System.out.println("Grade - A+");
     else if(avg>=80 && avg<90)
      System.out.println("Grade - A");
     else if(avg>=70 && avg<80)
      System.out.println("Grade - B+");
     else if(avg>=60 && avg<70)
      System.out.println("Grade - B");
     else if(avg>=50 && avg<60)
      System.out.println("Grade - C");
     else if(avg>=40 && avg<50)
      System.out.println("Grade - D");
     else 
      System.out.println("Grade - E");
      
  }
}
