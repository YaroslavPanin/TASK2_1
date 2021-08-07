import java.util.Scanner;

public class Task {
    public static void main (String[] args){

        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите первый угол:");
        double x = vvod.nextDouble();
        System.out.println("Введите второй угол:");
        double y = vvod.nextDouble();

        if ((180 > (x+y) ) && (x>0) && (y>0) && (x<=90) && (y<=90) && (x == 90) || (y == 90) || ((x+y) ==90)) {
            System.out.println("Данный треугольник прямоугольный");
        }
        else {
            System.out.println("Данный треугольник НЕ прямоугольный");
        }

    }
}
