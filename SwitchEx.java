/*Question:
 * Write a program to accept the marks and names of the 10 students, and give the grade according to the marks 

*/

import java.util.*;

public class SwitchEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] names=new String[10];
		int[]marks = new int[10];
		char[]grades=new char[10];
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter name of Student:"+(i+1));
			names[i]=sc.next();
			System.out.println("Enter the marks of:"+(i+1));
			marks[i]=sc.nextInt();
			
			
			switch(marks[i]/10)
			{
			case 10:
			case 9:	
				grades[i]='A';
				break;
			
			case 8:
				grades[i]='B';
				break;
			case 7:
				grades[i]='C';
				break;
			case 6:
				grades[i]='D';
				break;
			case 5:
				grades[i]='E';
				break;
			default:
				grades[i]='F';
				
				
			}
		}
		System.out.println("\nStudent Details");
		for(int i=0;i<10;i++)
		{
			System.out.println("\nName of Student ="+names[i]+"\nMarks of Students:"+marks[i]+"\n Grade of Student:"+grades[i]);
		}
	}

}
