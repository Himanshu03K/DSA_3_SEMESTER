package HashMap;

/*
Count the distinct elements in every window of size k

Sample input
a=[1,2,2,1,3,1,1,3]
k=4

Sample Output
2
3
3
2
2

 */
import java.util.HashMap;
import java.util.Map;

public class CountDistinctElements {
    public static void countDistinct(int a[],int k){
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(a[i], map.getOrDefault(a[i],0)+1);
        }
        System.out.println(map.size());

        for(int i=k;i<a.length;i++){
            if(map.get(a[i-k])==1)
                map.remove(a[i-k]);
            else
                map.put(a[i-k], map.get(a[i-k])-1);

            map.put(a[i], map.getOrDefault(a[i],0)+1);
            System.out.println(map.size());
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,2,1,3,1,1,3};
        countDistinct(a,4);
    }
}
