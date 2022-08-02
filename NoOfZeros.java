import java.util.Arrays;

public class NoOfZeros {
    
    public static void main(String[] args) {
        int arr1[]={1,0,1,0,1,0,1};
        int count=0;

        for (int i : arr1) {
            
            if(i==0)
            count++;
        }

        for (int i = 0; i < arr1.length; i++) {

            if(i<count)
            arr1[i]=0;
            else
            arr1[i]=1;  
        }
        System.out.println(Arrays.toString(arr1));
    }
}
