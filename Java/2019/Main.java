import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Triangle calc = new Triangle();
    }
}

class Triangle {
    public int angle1;
    public int angle2;
    public int angle3;
    // the most unnecessary constructor ever...
    public Triangle() {
        Scanner scanAngle1 = new Scanner(System.in);
        System.out.println("FIRST ANGLE: ");
        angle1 = scanAngle1.nextInt();

        Scanner scanAngle2 = new Scanner(System.in);
        System.out.println("SECOND ANGLE: ");
        angle2 = scanAngle1.nextInt();

        Scanner scanAngle3 = new Scanner(System.in);
        System.out.println("THIRD ANGLE: ");
        angle3 = scanAngle1.nextInt();

        TriangleBool();

    }

    //Determine if it is a triangle or not
    private void TriangleBool() {
        if (angle1 + angle2 + angle3 == 180) {
            //Determine the type of triangle
            if (angle1 == angle2 && angle1 == angle3) {
                System.out.println("THIS IS AN EQUILATERAL TRIANGLE");
            } else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
                System.out.println("THIS IS AN ISOSCELES TRIANGLE");
            } else {
                System.out.println("THIS IS A SCALENE TRIANGLE");
            }
        } else {
            System.out.println("NOT A TRIANGLE");
        }

    }
}
