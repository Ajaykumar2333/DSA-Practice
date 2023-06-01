package Arrays;

public class MaxValue {
    public static void main(String[] args) {

        int arr[] = {1,5,3,10,20,30,3};


//        1stmethod
        System.out.println(maxValue(arr));
//        2ndmethod
        System.out.println(maxValue(arr));
    }

    public static int maxValue(int[] arr){

        int max = 0;
        for (int i = 0; i< arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int maxValue2(int[] arr){

        int max = 0;
        for (int i = 0; i< arr.length;i++){
           max= Math.max(max,arr[i]);
        }
        return max;
    }
}
