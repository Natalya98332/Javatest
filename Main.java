import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int randomNum = (int)(Math.random() * 100) + 1;
        System.out.println(randomNum);
        System.out.print("Введите число от 1 до 100: ");
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        while(true) {
            if (sc > randomNum) {
                System.out.println("Я сам в шоке, но, загаданное число меньше, брат");
                System.out.print("Введите число от 1 до 100: ");
                sc = scanner.nextInt();
                count++;
            } else if (sc < randomNum) {
                System.out.println("Не ожидал от тебя такого. Загаданное число больше, брат");
                System.out.print("Введите число от 1 до 100: ");
                sc = scanner.nextInt();
                count++;
            } else {
                count++;
                System.out.println("Вы угадали число: " + randomNum);
                System.out.println("Количество попыток: " + count);
                break;
            }


        }
        scanner.close();


    }
}
