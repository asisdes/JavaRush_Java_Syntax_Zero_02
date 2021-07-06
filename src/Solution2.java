import java.util.Scanner;

/*
Создаем двухмерный массив
*/

public class Solution2 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код



        Scanner consol = new Scanner(System.in);
        int line = consol.nextInt();
        multiArray = new int[line][];

        for (int i=0; i<line; i++) {
            int lengthLineArray = consol.nextInt();
            multiArray[i] = new int[lengthLineArray];
        }

        for (int i=0; i<multiArray.length; i++) {
            for(int j=0; j<multiArray[i].length; j++) {
                multiArray[i][j] = 1;
            }
        }

        for (int i=0; i<multiArray.length; i++) {
            for(int j=0; j<multiArray[i].length; j++) {
                System.out.print(multiArray[i][j]);
            }
            System.out.println();
        }
    }
}