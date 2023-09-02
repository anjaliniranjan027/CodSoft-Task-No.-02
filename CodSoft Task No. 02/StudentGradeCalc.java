// STUDENT GRADE CALCULATOR

import java.util.Scanner;

public class StudentGradeCalc
{
   public static void main(String[] args)
   {
      float[] marks = new float[8];
      float sum=0;
      Scanner scan = new Scanner(System.in);
      

      System.out.println("Enter Marks Obtained in 8 Subjects: ");

      for(int i=0; i<8; i++)

        {
         marks[i] = scan.nextFloat();
         sum += marks[i];
       
        }

      // Calculation of sum
      System.out.println("Your total score : " + sum);


	   int TotalMarks = 800 ;

      // Calculation of Percentage
      float Percentage = sum / TotalMarks ;
      System.out.println("YOUR PERCENTAGE IS : " + Percentage) ;

      // Calculation of Average Score
      float avg = sum/8;
      System.out.println("YOUR AVERAGE SCORE IS : "  + avg);

      String grade = " ";
      
      if(avg>=90)
         grade = "O";
      else if(avg>=80 && avg<94)
         grade = "A+";
      else if(avg>=70 && avg<80)
         grade = "A";
      else if(avg>=60 && avg<70)
         grade = "B+";
      else if(avg>=50 && avg<60)
         grade = "B";
      else if(avg>=40 && avg<50)
         grade = "C";
      else if(avg>=30 && avg<40)
         grade = "D";
      else 
         grade = "F";
	 
      System.out.println("Grade = " +grade);
  }
}
 

