import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        int maxSize =arr.length-1;
        int minSize =0;
        int temp;

        //using two pointer technique
        while(minSize<maxSize){
           temp= arr[minSize];
           arr[minSize]=arr[maxSize];
           arr[maxSize]=temp;
           minSize++;
           maxSize--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
