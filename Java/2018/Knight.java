import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Knight
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      int maxX = scanner.nextInt(), maxY = scanner.nextInt();
      int aX = scanner.nextInt() - 1, aY = scanner.nextInt() - 1;
      int bX = scanner.nextInt() - 1, bY = scanner.nextInt() - 1;

      int[][] grid = new int[maxX][maxY];//0 = unvisited
      Queue<Point> points = new LinkedList<>();

      points.add(new Point(aX, aY, 1));//starting point (starting dist of 1 since 0 is unvisited; subtracted at output)
      while(!points.isEmpty())
      {
         //try out the closest next move
         Point p = points.remove();

         if(p.x < 0 || p.x >= maxX || p.y < 0 || p.y >= maxY)
            continue;//illegal point; ignore

         if(p.x == bX && p.y == bY)//found shortest path to B
         {
            System.out.println(p.dist - 1);//output it
            return;//stop searching
         }

         if(p.dist < grid[p.x][p.y] || grid[p.x][p.y] == 0)//more optimal path here than old one (or unvisited)
         {
            grid[p.x][p.y] = p.dist;//store more optimal route
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
   }

   static class Point
   {
      int x, y, dist;

      Point(int x, int y, int dist)
      {
         this.x = x;
         this.y = y;
         this.dist = dist;
      }
   }
}