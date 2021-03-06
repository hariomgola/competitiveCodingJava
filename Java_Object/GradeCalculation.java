package Java_Object;
/**
Average and Grade Calculation
Develop a smart application as Student Grade Calculator(SGC).
Create a class Student with following private attribute :
int id, String name, marks(integer array), float average and char grade. 
Include appropriate getters and setters methods and constructor.

public  void calculateAvg()- This method should calculate average and set average mark for the current student.

public void findGrade()- This method should set the grade based on the average calculated. 
If the average is between 80 and 100 then, then return grade as 'O', else 'A' .
If the student gets less than 50 in any of the subjects then return grade as 'F'. 
Using appropriate setter method set the grade to the student.

(Note : number of subject should be greater than zero, if not display as 'Invalid number of subject' 
and get number of subject again, Assume mark for a subject should be in the range 0 - 100.  
If not display a message "Invalid Mark" and get the mark again)

Write a class StudentMain and write the main method.
In this class, write a method
public static Student getStudentDetails() - this method should get the input from the user for a student, 
create a student object with those details and return that object.

In main create studentís object by invoking the getStudentDetails method.  
Also calculate average and grade for that student object using appropriate methods.

SGC app should get the input and display the output as specified in the snapshot:

Sample Input 1:
Enter the id:
123
Enter the name:
Tom
Enter the no of subjects:
3
Enter mark for subject 1:
95
Enter mark for subject 2:
80
Enter mark for subject 3:
75

Sample Output 1:
Id:123
Name:Tom
Average:83.33
Grade:O

Sample Input 2:
Enter the id:
123
Enter the name:
Tom
Enter the no of subjects:
0

Invalid number of subject

Enter the no of subjects:
3
Enter mark for subject 1:
75
Enter mark for subject 2:
49
Enter mark for subject 3:
90

Sample Output 2:
Id:123
Name:Tom
Average:71.33
Grade:F
*/
import java.util.Scanner;
public class GradeCalculation 
{
	public static Students getStudentDetails()
	{
		Scanner SC= new Scanner(System.in);
		System.out.println("Enter the id:");
		int id=SC.nextInt();
		System.out.println("Enter the name:");
		String name=SC.next();
		
		while(true)
		{
			System.out.println("Enter the no of subject:");
			int subject=SC.nextInt();
			if(subject<=0)
				System.out.println("Invalid number of subject");
			if(subject>0)
			{
				int [] marks = new int[subject];
				for(int i=1;i<=subject;i++)
				{
					while(true)
					{
						System.out.println("Enter marks for subject "+i+" :");
						marks[i-1]=SC.nextInt();
						if(marks[i-1]>=0 && marks[i-1]<=100)
							break;
						else
							System.out.println("Invalid Mark");
					}
				}
				Students student=new Students(id,name,marks);
				return student;
			}
			
		}
	}
	
	public static void main(String[] args) 
	{
		Students student=getStudentDetails();
		System.out.println("Id:"+student.getId());
		System.out.println("Name:"+student.getName());
		student.calculateAvg();
		student.findGrade();
		float average=student.getAverage();
		System.out.println("Average:"+String.format("%.2f", average));
		System.out.println("Grade:"+student.getGrade());
	}

}
