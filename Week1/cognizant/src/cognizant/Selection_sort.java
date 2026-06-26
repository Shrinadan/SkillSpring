package cognizant;

public class Selection_sort {

    public static void main(String[] args) {

        int[] arr = {5, 3, 6, 3};

        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
//} 5,3,3,6
//for i=0
//min 5
// j=1=3  5<3 yes 
// min=1;
//		j=2 3<3 no kuchh mat 
//				j=3
//				3<3 break
//				min=2=j
//				swap
//				again i=2 
//				j=2 again loop 
