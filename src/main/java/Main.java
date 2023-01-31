public class Main {


    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, -1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -1, 0, 0, 0, 20, 0, 0},
                {0, 0, 0, -1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, -1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        printArray(matrix);

        int rowStart = 3;
        int colStart = 7;

        int kFinish = rowStart * 10 + colStart;
        rowStart = kFinish / 10;
        colStart = kFinish % 10;
        System.out.printf("Финишная точка: %d, Строка: %d, Столбец: %d", kFinish, rowStart, colStart);



    }

}
