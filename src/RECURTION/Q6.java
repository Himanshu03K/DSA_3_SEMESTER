package RECURTION;

/*Q6. Create an array of 5 elements with values {1,7,4,7,6}.Search value 7 in the given array and print all the  occurrence(index) of search value(7) by holding the index in a result array . Do it recursively

The prototype of the method is as follows:-

public static int[] res(int arr[], int current index, int search_value)
{
	// set of statements;
}

 */

import java.util.ArrayList;
import java.util.Scanner;

class SearchValueAndPrint {
    static int count=0;
    static ArrayList<Integer> res = new ArrayList<>();
    public static ArrayList<Integer> res(int arr[], int current_index, int search_value)
    {
        if(current_index==arr.length){
            return res;
        }
        if(arr[current_index]==search_value){
            res.add(current_index);
            res(arr,current_index+1,search_value);
        }
        else{
            res(arr,current_index+1,search_value);
        }
        return res;
    }

}
public class Q6 {
    public static void main(String[] args) {
        SearchValueAndPrint obj = new SearchValueAndPrint();
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements of Array :");
        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the value to find : ");
        int n = s.nextInt();
        System.out.println(obj.res(arr,0,n));
    }
}
