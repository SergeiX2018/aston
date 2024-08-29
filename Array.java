public class Array {
    public static void main(String[] args) {
        try {
            String[][] arrayForByFor = createArray();
            checkArraySize(arrayForByFor);
            int[][] intArray = convertToIntArray(arrayForByFor);
            int sum = sumArray(intArray);
            System.out.println("Числовой массив:");
            printArray(intArray);
            System.out.println("Сумма элементов массива: " + sum);

        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
    public static String[][] createArray() {
        return new String[][] {
                {"1", "2", "12", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "1", "12" },
                {"13", "14", "15", "16"}
        };
    }
    public static void checkArraySize(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("Ошибка: массив должен быть размером 4x4.");
        }
        for (int i = 0; i < 4; i++) {
            if ( array[i].length != 4) {
                throw new MyArraySizeException("Ошибка: массив должен быть размером 4x4.");
            }
        }
    }
    public static int[][] convertToIntArray(String[][] stringArray) throws MyArrayDataException {
        int rows = stringArray.length;
        int cols = stringArray[0].length;
        int[][] intArray = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                try {
                    intArray[i][j] = Integer.parseInt(stringArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка преобразования элемента [" + i + "][" + j + "] со значением '" + stringArray[i][j] + "'");
                }
            }
        }
        return intArray;
    }
    public static int sumArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}





