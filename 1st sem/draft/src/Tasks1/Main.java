package Tasks1;

import java.util.Scanner;

// main for test Rectangle
public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int x3 = input.nextInt();
        int y1 = input.nextInt();
        int y2 = input.nextInt();
        int y3 = input.nextInt();
        int x4 = input.nextInt();
        int y4 = input.nextInt();
        Rectangle rect = null, rect1 = null, rect2 = null;
        while (rect == null || rect1 == null || rect2 == null) {
            try {
                rect = new Rectangle(x1,y1,x2,y2,x3,y3,x4,y4);
                rect = new Rectangle(x1,y1,x2,y2,x3,y3,x4,y4);
                rect = new Rectangle(x1,y1,x2,y2,x3,y3,x4,y4);
            } catch (WrongParametersException ex) {
                System.out.println(ex.getMessage());
            } catch (Exception ex) {
                System.out.println("Unknown exception!");
            }
        }
        System.out.println(rect.calcPerimeter());
        System.out.println(rect.calcArea());
        System.out.println(rect.toString());
        System.out.println(rect.equals(rect1));
        Rectangle[] array = new Rectangle[2];
        array[0] = rect;
        array[1] = rect1;
        System.out.println(calcMultPerimeter(array));
    }

    public static int calcMultPerimeter(Rectangle[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i].calcPerimeter();
        }
        return result;
    }
}
