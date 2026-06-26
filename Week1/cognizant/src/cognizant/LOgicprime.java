package cognizant;

public class LOgicprime {

    public static void main(String[] args) {

        int n = 13;

        int sum=0;
        for(int j = 2; j <= n; j++) {

            boolean prime = true;

            for(int i = 2; i <= Math.sqrt(j); i++) {

                if(j % i == 0) {
                    prime = false;
                    break;
                }
            }

            if(prime) {
              System.out.println(j);
              sum=sum+j;
              
            }
        }
      ///   System.out.println(sum);
        
    }
}