import java.util.Arrays;

public class HomeWorkApp3 {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(booleanNegoteArray(new int[]{0, 1, 0, 0, 1, 0, 0, 1})) + '\n');
        System.out.println(Arrays.toString(fillUpArray(100)) + "\n");
        System.out.println(Arrays.toString(doubleIfLess (new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 })) + "\n");
        fillDiagonals(5);
        int [] arr = fillWithInitialValue(6,9);
    }

    public static int[] booleanNegoteArray(final int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                input [i] =1;
            } else {
                input[i] = 0;
            }

        }
        return input;
    }

    public static int [] fillUpArray(final int length) {
        int [] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr [i] = i + 1;
        }
        return arr;
    }

    public static int[] doubleIfLess (final int [] input) {
        for (int i = 0; i < input.length; i++) {
            if (input [i] < 6 ) {
                input [i] *=2;
            }
        }
        return input;
    }

    public static void fillDiagonals(final int size) {
        int [][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            int rowLength = arr[i].length;
            for (int j = 0; j < rowLength; j++) {
                if ((i==j) || (j==rowLength - 1 - i)) {
                    arr [i][j]= 1;
                }
                System.out.println(arr[i][j] + "");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int [] fillWithInitialValue (final int len, final int initialWalue){
        int [] arr = new int [len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialWalue;
        }
        return arr;
    }

}
