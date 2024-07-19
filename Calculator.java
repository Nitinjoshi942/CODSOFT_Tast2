import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfSubjects;
        int totalMarks = 0;
        int subjectMarks;
        float percentage;
        char grade;

        System.out.print("Enter the number of subjects: ");
        numberOfSubjects = sc.nextInt(); // taking input of numberofsubjects

        for (int i = 1; i <= numberOfSubjects; i++) {
            while(true){
                System.out.print("Enter marks for subject " + i + " (out of 100): ");
                subjectMarks = sc.nextInt();
                if (subjectMarks >= 0 && subjectMarks <= 100) {
                    totalMarks += subjectMarks;
                    break;
                } else {
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
                }
            }
        }

        // calculating percentage
        percentage = ((totalMarks / numberOfSubjects));
        if(percentage >= 90){
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        //print statements to display totalmakrs , percentage , grade.
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("percentage : "  + percentage );
        System.out.println("grade :" + grade);

        sc.close();
    }
}
