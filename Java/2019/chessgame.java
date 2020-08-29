import java.util.*;

public class chessgame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int wX = scan.nextInt(), wY = scan.nextInt();
        int bX = scan.nextInt(), bY = scan.nextInt();

        int[][] grid = new int[n][n];
        Queue<Point> points = new LinkedList<>();

        points.add(new Point(bX, bY, 1));

        while (!points.isEmpty()){

            Point p = points.remove();

            if (p.x < 0 || p.x >= n || p.y < 0 || p.y >= n){
                continue;
            }

            if (p.x == wX && p.y == wY + p.dist - 1){
                System.out.println("BLACK WINS");
                System.out.println(p.dist - 1);
                return;
            }

            if (p.x == wX && p.y == wY + p.dist - 2){
                System.out.println("STALEMATE");
                System.out.println(p.dist - 1);
                return;
            }

            if (p.dist < grid[p.x][p.y] || grid[p.x][p.y] == 0){
                grid[p.x][p.y] = p.dist;
                //possible knight moves from here:
                points.add(new Point(p.x + 2, p.y + 1, p.dist + 1));
                points.add(new Point(p.x - 2, p.y + 1, p.dist + 1));
                points.add(new Point(p.x + 2, p.y - 1, p.dist + 1));
                points.add(new Point(p.x - 2, p.y - 1, p.dist + 1));
                points.add(new Point(p.x + 1, p.y + 2, p.dist + 1));
                points.add(new Point(p.x - 1, p.y + 2, p.dist + 1));
                points.add(new Point(p.x + 1, p.y - 2, p.dist + 1));
                points.add(new Point(p.x - 1, p.y - 2, p.dist + 1));

            }
        }
        System.out.println("WHITE WINS");
    }

    static class Point {
        int x, y, dist;
        public Point (int x, int y, int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
}
