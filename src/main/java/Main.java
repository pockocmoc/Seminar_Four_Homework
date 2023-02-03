public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1},
                {1, 1, 1, 0, 1},
        };

        System.out.println();
        System.out.println("Задан двумерный массив.");
        System.out.println("*************************");
        System.out.println();
        PrintArray.print(matrix);
        System.out.println();

        System.out.println("""
                Программа реализовывает волновой алгоритм(алгоритм ЛИ).
                Находит кратчайший путь от стартовой точки до финишной.
                Координаты точек указывает пользователь.\n
                Путь обозначается 1, стена 0.""");
        System.out.println();
        System.out.println("Введите координаты стартовой точки x: ");
        int i = NumberEntry.numberEntry();
        System.out.println("Введите координаты стартовой точки y: ");
        int j = NumberEntry.numberEntry();
        System.out.println("Введите координаты финишной точки x: ");
        int x = NumberEntry.numberEntry();
        System.out.println("Введите координаты финишной точки y: ");
        int y = NumberEntry.numberEntry();
        LeeAlgorithm.bfs(matrix, i, j, x, y);
    }
}
