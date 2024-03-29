public class Samelement {

    static void same(int[] arr){

        int n = arr.length;
        //int[] arr2;
        for(int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if (arr[i] == arr[j]){
                    System.out.print(arr[i]+"\n");
                }
            }
        }

    }
    public static void main(String[] args) {

        int[] arr = {1,2,5,7 ,7,9,2,1};
        same(arr);
    }
}
