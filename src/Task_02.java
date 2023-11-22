import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        System.out.println("Задание №2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк треугольника: ");

        int rows =sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < rows; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = i; k < rows; k++) {
               if (i == 0 || k == i || k == rows - 1) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
            }
            System.out.println();
        }

    }
}
