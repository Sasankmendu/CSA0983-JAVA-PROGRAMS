import java.util.Scanner;

public class examination {
    public static void main(String[] args) {
        int numStudents = 3;
        int numSubjects = 3;
        int[] highestMarks = new int[numSubjects];
        int[] studentRollNo = new int[numSubjects];

        int highestTotalMarks = 0;
        int highestTotalMarksRollNo = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter data for Student " + (i + 1) + ":");
            int rollNo = scanner.nextInt();
            int s1 = scanner.nextInt();
            int s2 = scanner.nextInt();
            int s3 = scanner.nextInt();
            int totalMarks = s1 + s2 + s3;
            if (s1 > highestMarks[0]) {
                highestMarks[0] = s1;
                studentRollNo[0] = rollNo;
            }

            if (s2 > highestMarks[1]) {
                highestMarks[1] = s2;
                studentRollNo[1] = rollNo;
            }

            if (s3 > highestMarks[2]) {
                highestMarks[2] = s3;
                studentRollNo[2] = rollNo;
            }
            if (totalMarks > highestTotalMarks) {
                highestTotalMarks = totalMarks;
                highestTotalMarksRollNo = rollNo;
            }
        }

        scanner.close();
        System.out.println("Highest marks in each subject:");
        System.out.println("Subject 1: Roll No. " + studentRollNo[0] + ", Marks: " + highestMarks[0]);
        System.out.println("Subject 2: Roll No. " + studentRollNo[1] + ", Marks: " + highestMarks[1]);
        System.out.println("Subject 3: Roll No. " + studentRollNo[2] + ", Marks: " + highestMarks[2]);

        System.out.println("Student with the highest total marks:");
        System.out.println("Roll No. " + highestTotalMarksRollNo + ", Total Marks: " + highestTotalMarks);
    }
}
