import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Demo {
    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet();
        int arr1[]={1,2,3,4,5,5};//op:5
        int arr2[] ={6,6,7,8,9,0,1,2,5};//op:6
        for(int i=0;i<=arr1.length-1;i++){
            for(int j=0;j<=arr2.length-1;j++){
             if(arr1[i]==arr2[j]){
                set.add(arr2[j]);
             }
            }
        }

        //for arr1
        for(int i=0;i<=arr1.length-1;i++){
            for(int j=i+1;j<=arr1.length-1;j++){
             if(arr1[i]==arr1[j]){
                set.add(arr1[j]);
             }
            }
        }

        //for arr2
        for(int i=0;i<=arr2.length-1;i++){
            for(int j=i+1;j<=arr2.length-1;j++){
             if(arr2[i]==arr2[j]){
                set.add(arr2[j]);
             }
            }
        }
        System.out.println(set);
    }

}

