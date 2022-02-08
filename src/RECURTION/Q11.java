package RECURTION;

/*Q. Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function
that checks if the string was generated using the following rules:
a. The string begins with an 'a'
b. Each 'a' is followed by nothing or an 'a' or "bb"
c. Each "bb" is followed by nothing or an 'a'
If all the rules are followed by the given string, return true otherwise return false.

Sample Input 1 :
abb
Sample Output 1 :
true
Sample Input 2 :
abababa
Sample Output 2 :
false

 */

import java.util.Scanner;

class CheckString {
    static int count=0;
    static boolean ans;
    public static boolean checkString(String str) {
        if(0==str.length()){
            return true;
        }
        if(str.length()==1){
            return str.charAt(0) == 'a';
        }
        if(str.charAt(0)=='a'){
            return checkString(str.substring(1));
        }
        else if(str.charAt(0)=='b' && str.charAt(1)=='b'){
            return checkString(str.substring(2));
        }
        else return false;
    }
}
public class Q11 {
    public static void main(String[] args) {
        CheckString obj = new CheckString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        if(str.charAt(0)=='a')
            System.out.println(obj.checkString(str));
        else System.out.println("false");

    }
}
