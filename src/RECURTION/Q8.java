package RECURTION;

/*Q. In a string S, remove consecutive duplicates from it recursively.

        Sample Input 1 :
        aabccba
        Sample Output 1 :
        abcba

 */


import java.util.Scanner;

class RemoveDuplicatesString {
    public static boolean[] map = new boolean[26];
    public static String newstring="";
    public static String removeDup(String str, int index){
        if(index==str.length()){
            return newstring;
        }
        char ch=str.charAt(index);
        if(map[ch-'a']){
            removeDup(str, index+1);
        }
        else{
            newstring+=ch;
            map[ch-'a']= true;
            removeDup(str,index+1);
        }
        return newstring;
    }

}
public class Q8 {
    public static void main(String[] args) {
        RemoveDuplicatesString obj=new RemoveDuplicatesString();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str= sc.nextLine();
        System.out.println("New String will be : ");
        System.out.println(obj.removeDup(str,0));

    }
}
