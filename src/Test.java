public class Test {

        public static final String ODD = "Нечётный";
        public static final String EVEN = "Чётный";
        public static String[] strings = new String[5];

        public static void main(String[] args) {
            //напишите тут ваш код

            for (int i = 0; i <= 4; i++){
                if (dividesByTwo(i)) {
                    strings[i] = EVEN;
                } else {
                    strings[i] = ODD;
                }
            }


            System.out.print("index = 0");
            System.out.println(" value = " + strings[0]);
            System.out.print("index = 1");
            System.out.println(" value = " + strings[1]);
            System.out.print("index = 2");
            System.out.println(" value = " + strings[2]);
            System.out.print("index = 3");
            System.out.println(" value = " + strings[3]);
            System.out.print("index = 4");
            System.out.println(" value = " + strings[4]);
        }

        static boolean dividesByTwo(int a){
            return (a%2==0);
        }

    //sdf
    //dsfsf
    //sadf
}
