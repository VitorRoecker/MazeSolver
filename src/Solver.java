import java.io.FileNotFoundException;
import java.util.*;

public class Solver {
    private final int[][] maze;

    public Solver(int[][] maze) {
        this.maze = maze;
    }

    public char[][] solution() {
        return null;
    }

    public boolean isSolvable() {
        return false;
    }

    private static int[][] loadInputIntoArray() throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] tiles = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tiles[i][j] = in.nextInt();
            }
        }
        return tiles;
    }

    public static void main(String[] args) {
        try {
            int[][] tiles = loadInputIntoArray();

            Solver solver = new Solver(tiles);

            if (solver.isSolvable()) {
                char[][] solution = solver.solution();
                System.out.println("imprima a solução.");
            } else {
                System.out.println("Não é possível resolver o labirinto.");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}