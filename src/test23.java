
import java.util.Scanner;

class test23 {
    public static void main(String[] args) {
        // put your code here
        Scanner consol = new Scanner(System.in);
        int n = consol.nextInt();

        int result = 0;

        for (int i=0; result<=n; i++) {
            result = (int) Math.pow(2, i);
            if (result<n) {
                System.out.println(result);
            }
        }


        //dfgsdf
        //dfgdfg
        //fdg
    }
}