package Simple_And_Compound_Interest;
import java.util.Scanner;
public class Main extends Interest{
  public static void main(String args[]) {
	  Interest interest_obj=new Interest();
	  Scanner input_obj=new Scanner(System.in);
	  System.out.println("---WELCOME TO OUR APPLICATION---");
	  System.out.println("Which of our following services you are needed with?");
	  System.out.println("1.Calculate SIMPLE INTEREST\n2.Calculate COMPOUND INTEREST");
	  int choice=input_obj.nextInt();
	  System.out.println("Enter the principal amount...");
	  float principal_Amount=input_obj.nextFloat();
	  System.out.println("Enter the duration in years...");
	  int time_In_Years=input_obj.nextInt();
	  System.out.println("Enter the rate of interest...");
	  float rate_Of_Interest=input_obj.nextFloat();
	  if(choice==1)
			System.out.println("Simple interest---> "+interest_obj.calculate_simple_interest(principal_Amount,time_In_Years,rate_Of_Interest));
	  else if(choice==2)
		{
			System.out.println("Enter the number of times to be calculated");
			int num_Of_Times=input_obj.nextInt();
			System.out.println("Compound interest--->"+interest_obj.calculate_compound_interest(principal_Amount,num_Of_Times,time_In_Years,rate_Of_Interest));
		}
		else
			System.out.println("Invalid option...TRY AGAIN!!");
	  input_obj.close();
}
}



	
	