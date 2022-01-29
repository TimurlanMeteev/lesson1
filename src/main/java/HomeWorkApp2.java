public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(isWithinNumbers(10, 5));
        positiveNegative(0);
        System.out.println(isPositive(7));
        printString("Geek Brains", 3);
        System.out.println(isLeapYear(2000));

    }


    public static boolean isWithinNumbers(int a, int b) {

        int sum = a + b;
        return ((sum >= 10) && (sum <= 20));

    }

    public static void positiveNegative(int input) {
        if (input >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isPositive(int input) {
        return (input > 0);
    }

    public static void printString(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }


}
