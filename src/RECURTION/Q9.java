package RECURTION;

/*Q. write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into a corresponding integer and return the answer.

Sample Input:
“2029”

Sample Output:
2029

 */

import java.util.Scanner;

class ConvertStringToNumber {
    static int num=0;
    public static int convertString(String str,int index){
        if(index == str.length()){
            return num;
        }else {
            num *=10;
            num+=str.charAt(index)-'0';
            convertString(str, index+1);
        }
        return num;
    }


}
public class Q9 {
    public static void main(String[] args) {
        ConvertStringToNumber obj= new ConvertStringToNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println(obj.convertString(str,0));
    }
}
