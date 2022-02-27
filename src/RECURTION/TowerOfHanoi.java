package RECURTION;

import java.util.Scanner;

public class TowerOfHanoi {
    static void tower(int n, char from_rod, char to_rod, char aux_rod){
        if(n == 0)
            return;
        tower(n-1,from_rod,aux_rod,to_rod);
        System.out.println("Move disk "+ n+ " from rod "+from_rod+ " to rod "+to_rod);

        tower(n-1,aux_rod,to_rod,from_rod);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of disk");
        int n= sc.nextInt();
        tower(n,'A','B','C');
    }
}
