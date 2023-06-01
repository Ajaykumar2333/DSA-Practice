package Arrays;

public class Sum {
    public static void main(String[] args) {
        int arr[] = {1,5,3};

        int ans = sum(arr);

        System.out.println(ans);
    }

    public static int sum(int[] arr){

        int sum = 0;

        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }


        return sum;

    }
}