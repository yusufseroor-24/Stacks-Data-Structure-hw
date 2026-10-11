import java.util.Arrays;

public class Exercise1 {

    public static void rotate(int[] arr, int d, int n){
        d = d % n;

        for(int i=0; i<d; i++){
            int first = arr[0];

            for(int j=0; j < n -1; j++){
                arr[j] = arr[j + 1];
            }
            arr[n-1] = first;
        }
    }

}
