import java.util.Scanner;

class Solution8 {
    public static void main(String[] args) {

    Scanner consol = new Scanner(System.in);

    int x1 = consol.nextInt();
    int y1 = consol.nextInt();
    int x2 = consol.nextInt();
    int y2 = consol.nextInt();

    if ((Math.abs(x1-x2) == Math.abs(y1-y2))  || (x1 == x2 || y1==y2)) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }
    }




}