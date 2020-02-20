package House_Construction_Cost;
import java.util.Scanner;
public class Main extends House_Construction_Cost{
	public static void main(String args[]) {
		Scanner input_obj=new Scanner(System.in);
		System.out.println("Enter the area of your house (in square feet)");
		float area=input_obj.nextFloat();
		System.out.println("Enter your choice of type of material for house construction:");
		System.out.println("1.Standard Material\n2.Above Standard Material\n3.High Standard Material");
		int choice=input_obj.nextInt();
		int special_choice=0;
		if(choice==3) {
			System.out.println("Do you want a fully automated house(0/1)?");
			special_choice=input_obj.nextInt();
		}
		if(choice>=1 && choice<=3) {
			if(choice==3 && special_choice==1) {
					System.out.println("Your House Construction Cost--->  "+calculate_house_construction_cost(area,3)+" INR");
			}
			else
				System.out.println("Your House Construction Cost--->  "+calculate_house_construction_cost(area,choice-1)+" INR");
		}
		else
			System.out.println("Invalid choice...TRY AGAIN!!!");
		input_obj.close();
	}
}
