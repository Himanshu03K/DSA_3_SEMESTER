package Array;

/*Q.In GLA University there is various department. It is asked to every dept to conduct meeting for all the employees of GLA University. The central Management asked the dept kindly share starting time and ending time of the meeting in 24 hours format so that after verifying it will be circulated among the GLA employees.
        But there is a problem that before circulating the meeting information, the central management will find out if there are any clashes between time or not. If there are clashes it means the employee cannot attend all the meetings. Can you help central management to find it out

 use this class structure

public class TimeInterval
{
    int start;
    int end;
// use constructor, getter and setter methods as per requirement
    pubic boolean canAttendMeeting(TimeInterval [ ] tlarr)
{
    // set of statements
}

    Hint:- Single Dimension array
 */

import java.util.Arrays;
import java.util.Scanner;

class TimeInterval{
    int start;
    int end;
    public TimeInterval(int start,int end){
        this.start=start;
        this.end=end;
    }
    public static boolean canAttendMeeting(TimeInterval[] arr1){
        int start[]= new int[arr1.length];
        int end[]= new int[arr1.length];

        for(int i=0;i< arr1.length;i++) {
            start[i] = arr1[i].start;
            end[i]=arr1[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for(int i=0;i<arr1.length-1;i++){
            if(end[i]<=start[i+1]){
                return true;
            }
        }
        return false;
    }

}
public class GLAMeeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creating a non-primitive type array
        System.out.println("Enter the no.of meetings to conduct: ");
        int n = sc.nextInt();
        TimeInterval arr[]= new TimeInterval[n];
        System.out.println("enter the start and end time of meeting: ");
        for(int i=0;i< n;i++){
            arr[i]= new TimeInterval(sc.nextInt(), sc.nextInt());
        }

        if(TimeInterval.canAttendMeeting(arr)== true){
            System.out.println("Employee can attend all the meetings without any clash");
        }
        else {
            System.out.println("Employee can not attend all the meetings without any clash");
        }
    }
}
