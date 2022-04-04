package SearchingAndSorting;

public class BinarySearch {
    public static void BinSearch(int arr[]){
        int n= arr.length;;
        int beg=0,end= n-1;
        if(beg<=end)
        {
            int mid=(beg+end)/2;
            if(n==arr[mid])
            {
                System.out.println(arr[mid]+"  -->  Found at index  -->  "+mid);
                System.exit(0);
            }
            if(n>arr[mid])
                beg=mid+1;
            if(n<arr[mid])
                end=mid-1;
            BinSearch(arr);
        }
        else
            System.out.println("Element not found");
    }

}
