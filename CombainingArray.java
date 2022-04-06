import java.util.Arrays;

public class CombainingArray {

    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={5,6,7,8};

        int arraylength = arr1.length;
        int arraylength2 = arr2.length;

        int combainedArray[] = new int[arraylength+arraylength2];

        System.arraycopy(arr1, 0, combainedArray, 0, arraylength);  
        System.arraycopy(arr2, 0, combainedArray, arraylength, arraylength2);  
        System.out.println(Arrays.toString(combainedArray));
    }

    
}
