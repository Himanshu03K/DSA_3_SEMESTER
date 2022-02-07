package RECURTION;

/*Q. Given an input string S and two characters char1 and char2, you need to replace every occurrence of character c1 with character c2 in the given string. Do this recursively.

        Sample Input :
        abaca
        a x
        Sample Output :
        xbxcd

 */


import java.util.Scanner;

class ReplaceChar {
    static String ans="";
    public static String replaceChar(String str,char c1,char c2,int index) {
        if(index==str.length()-1){
            return ans;
        }
        if(str.charAt(index)==c1) {
            ans =str.replace(c1,c2);
            replaceChar(str,c1,c2,index+1);
        }
        else {
            replaceChar(str, c1, c2, index + 1);
        }
        return ans;

    }
}
public class Q7 {
    public static void main(String[] args) {
        ReplaceChar obj = new ReplaceChar();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Enter character1 : ");
        char c1 = sc.next().charAt(0);
        System.out.println("enter characer to be replaced with : ");
        char c2 = sc.next().charAt(0);
        System.out.println("New string is : ");
        System.out.println(obj.replaceChar(str, c1, c2, 0));
    }
}
