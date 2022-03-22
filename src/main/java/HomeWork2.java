public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println("Вызов метода checkSum со значениями 3 и 9 " + checkSum(3, 9));
        isPositiveOrNegative(-9);
        System.out.println("Вызов метода со значением 7 " + positiveOrNegative(7));
        printWordTimes("Tima", 5);
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " является положительным.");
        } else {
            System.out.println("Число " + a + " является отрицательным.");
        }
    }

    public static boolean positiveOrNegative(int b) {
        return b < 0;
    }

    public static void printWordTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("[" + i + "]" + " " + word);
        }
    }



}