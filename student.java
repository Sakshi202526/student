/* problem statement 
input :Take marks obtained (out of 100) in each subject.
calculate total marks:sum up the marks obtained in all subject.
calculate average percentage :divide the total marks by the total number of subjects to get the average percentage.
grade calculation :assign grades based on the average percentage achieved.
dispaly result:show the total marks ,average percentage,and the  corresponding grade to the user.
*/

import java.util.Scanner;
public class student
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		// no of subjects
		System.out.println("Enter total number of subjects:");
		int sub=sc.nextInt();
		
		int totalm=0;
		
		for(int i=1;i<=sub;i++)
		{
			System.out.println("Enter total marks of subject out of 100:"+i);
			int mark=sc.nextInt();
			
			//validate
			while(mark < 0 || mark > 100)
			{
				System.out.println("Invalid inpute please !! enter valid output ");
				System.out.println("Enter total marks of subject out of 100:"+i);
			    mark=sc.nextInt();
				
			}
			totalm +=mark;
		}
		System.out.println("student result:");
		System.out.println("Total marks obtained in all subjects:"+totalm);
		
		//calculate avg percentage
		
		double avgpercen =(double) totalm/sub;
		System.out.printf("Average percentage :%.2f%%\n",avgpercen);
		
		//grade calculate
		
		if(avgpercen >= 90)
		{
			System.out.println("Your grade: A+");
		}
		else if(avgpercen >= 80)
		{
			System.out.println("Your grade:A");
		}
		else if(avgpercen >= 70)
		{
			System.out.println("Your grade: B+");
		}
		else if(avgpercen >= 60)
		{
			System.out.println("Your grade:B");
		}
		else if(avgpercen >= 50)
		{
			System.out.println("Your grade: c+");
		}
		else if(avgpercen >= 40)
		{
			System.out.println("Your grade:c");
		}
		else if(avgpercen >= 30)
		{
			System.out.println("Your grade: D+");
		}
		else if(avgpercen >= 20)
		{
			System.out.println("Your grade:D");
		}
		
		 
		
		sc.close();
	}
	
}

		
		