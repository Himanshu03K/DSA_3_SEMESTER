package Array;

/*Q. Consider an array MARKS[4][5] which stores the marks obtained by 4 students in 5 subjects. Now write a program to
        (a) find the average marks obtained in each subject.
        (b) find the average marks obtained by every student.
        (c) find the number of students who have scored below 50 in their average
        (d) display the scores obtained by every student.
 */

import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int[][] marks = new int[4][5];
        for(int i=0;i<4;i++){
            System.out.println("Enter the marks obtained by student "+(i+1));
            for(int j=0;j<5;j++){
                marks[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<5;i++){
            int sum =0;
            int avg =0;
            System.out.print("average marks obtained in subject "+(i+1)+" ");
            for(int j=0;j<4;j++){

                sum += marks[j][i];
                avg = sum/4;

            }
            System.out.println(avg);
        }
        int count=0;
        for(int i=0;i<4;i++){
            int sum =0;
            int avg =0;
            System.out.print("average marks obtained by student "+(i+1)+" ");
            for(int j=0;j<5;j++){
                sum += marks[i][j];
                avg = sum/5;

            }
            System.out.println(avg);
            if(avg<50){
                count++;
            }
        }
        System.out.println("Student who score below 50 in their average : "+count);
        for(int i=0;i<4;i++){
            System.out.println("Scores obtained by student "+(i+1)+" ");
            for(int j=0;j<5;j++){
                System.out.println(marks[i][j]+" ");
            }
        }
    }
}