import java.util.*;
public class NumberGame
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int chances=5,target=20;
		int lrange=1,urange=100;
		int num;
		while(chances>0)
		{
		   System.out.print("Guess the number: "); 
		   num=s.nextInt();
		   if(num>=1 && num<=100)
		   {
		     if(num == target)
		     {
		       System.out.println("Correct guess!");
		       System.exit(0);
		     }
		     else if(num < target){
		       System.out.println("Your guess is lower than the target value! try again");
		       chances--;
		     }
		     else if(num > target){
		       System.out.println("Your guess is higher than the target value! try again");
		       chances--;
		     }
		   }
		   else{
		       System.out.println("Invalid input");
		   }
		}
		System.out.print("Sorry! you have exceeded the number of chances");
	}
}
