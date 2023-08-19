import java.util.Scanner;

//Перевод цельсия в кельвина/фарингейт
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру");
        try {
            double temp = scanner.nextDouble();
            System.out.println("Выбери какой расчет произвести: \n1. Перевод по шкале Фарингейта \n2. Перевод по шкале Кельвина");
            int num = scanner.nextInt();

            if (num == 1) {
                System.out.println(((temp*1.8)+32) + "°F");
            } else if (num == 2) {
                System.out.println((temp+273.15) + "K");
            } else {
                System.out.println("Ты что-то неправильно ввел! Перезагрузи программу и введи цифру 1 или 2");
            }
        } catch (Exception e) {
            System.out.println("Ты что-то неправильно ввел! Перезагрузи программу и попробуй заново!");
        }

    }
}