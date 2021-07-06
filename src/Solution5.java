import java.util.Arrays;

/*
Заполняем массив
*/

public class Solution5 {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //напишите тут ваш код
        if (array.length%2 == 0) {
            int dlina = array.length/2;
            Arrays.fill(array, 0, dlina, valueStart);
            Arrays.fill(array, dlina, array.length, valueEnd);
        } else {
            int dlina = (array.length-1)/2;
            Arrays.fill(array, 0, dlina+1, valueStart);
            Arrays.fill(array, dlina+1, array.length, valueEnd);
        }
        //System.out.println(array.length%2);
        System.out.println(Arrays.toString(array));

    }
}