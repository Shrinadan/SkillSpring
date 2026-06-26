package cognizant;

public class Missing_number {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4};

        int n = arr.length + 1; // total numbers including missing

        int totalSum = n * (n + 1) / 2; //4*5/2=10

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i]; //7
        }

        int missing = totalSum - sum;// 10-7=3

        System.out.println(missing);
    }
}