import java.util.Arrays;

/*
Делим массив
*/

public class Solution6 {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};

    public static void main(String[] args) {
        //напишите тут ваш код

        if (array.length%2 == 0) {
            result[0] = Arrays.copyOfRange(array, 0, array.length/2);
            result[1] = Arrays.copyOfRange(array, array.length/2, array.length);
        } else {
         int dline = array.length - 1;
            result[0] = Arrays.copyOfRange(array, 0, dline/2+1);
            result[1] = Arrays.copyOfRange(array, dline/2+1, array.length);
        }
        System.out.println(Arrays.deepToString(result));
    }
}
