import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {


        int arr[]= {1,2,5,66,7,8,99,0,103,104,63,999,998};


        //Using array sort 
        // Arrays.sort(arr);           
        // System.out.println(arr[arr.length-1]);

        int largestNumber=0;
        int secondLargest=0;
        int arr1[];

       for (int i = 0; i <= arr.length; i++) {
           for (int j = i+1; j <=arr.length; j++) {

               if(largestNumber<arr[i])
               largestNumber=arr[i];

               if(secondLargest<arr[i]&& arr[i]!=largestNumber)
               secondLargest=arr[i];
           }
       }
       System.out.println("largest"+largestNumber+"second"+secondLargest);


    }
}
