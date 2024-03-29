import java.util.Arrays;

public class Bsort {


    static void bubbl(int[] arr){
        for (int i =0; i < arr.length; i++){
            for (int j=0; j < arr.length -i -1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
    static void display(int[] arr){
        for (int i =0; i < arr.length; i++){
            System.out.print(arr[i]);
           // System.out.println();
        }
    }
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 1, 3, 8, 0,2};
        //int[] arr2 = ;
//        int[] ans =
        bubbl(arr);
        display(arr);


    }
}
