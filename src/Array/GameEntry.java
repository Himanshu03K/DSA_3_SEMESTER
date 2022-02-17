package Array;

/*Q. Create an application that store a sequence of high score entries(with name and score) for a video game in an array.

        A Java class, GameEntry, representing a game entry is as follows:-
public class GameEntry {
    private int score;
    private String name;
    public GameEntry(int score, String name) {
        this.score = score;
        this.name = name;
    }
    // Getter methods that returns the name and score
    public int getScore() { return score; }
    public String getName() { return name; }
    // here i am returning a string representation of the entry
    @Override
    public String toString() {
        return "("+score + ", "+ name+ ")";
    }
}

Hint :- Sorting

 */

import java.util.Scanner;

public class GameEntry {
    private int score;
    private String name;
    public GameEntry(int score, String name) {
        this.score = score;
        this.name = name;
    }
    public int getScore() { return score; }
    public String getName() { return name; }
    @Override
    public String toString() {
        return "("+score + ", "+ name+ ")";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of game entries: ");
        int n = sc.nextInt();
        GameEntry[] arr= new GameEntry[n];
        for(int i=0;i<n;i++){
            arr[i]= new GameEntry(sc.nextInt(), sc.next());
        }

        for(int i=0;i<n;i++) {
            for (int j = i; j < n; j++) {
                if (arr[i].getScore() < arr[j].getScore()) {
                    GameEntry temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }

            }
            System.out.print(arr[i].toString()+" ");
        }

    }
}