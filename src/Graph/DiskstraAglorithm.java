package Graph;

import java.util.Scanner;

public class DiskstraAglorithm {

    public static void diskstra(int matrix[][]){
        int n = matrix.length;
        boolean visited[] = new boolean[n];
        int weight[] = new int[n];
        weight[0] = 0;
        for (int i = 1; i <n ; i++) {
            weight[i] = Integer.MAX_VALUE;
            
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertex");
        int n= sc.nextInt();
        System.out.println("Enter the number of edges");
        int e = sc.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i <e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            // creation of undirected graph
            matrix[v1][v2]= weight;
            matrix[v2][v1] = weight;
        }
    }
}
