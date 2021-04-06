import java.util.Scanner;

public class InputFunctions {
    Scanner in = new Scanner(System.in);

    public void Start() {
        System.out.println(">>> Программа начала свою работу <<<");
    }

    public int inputFunction() {
        while (true) {
            System.out.print("""
                    Выберите функцию:
                    1. 2*x^3-9*x^2+3*x+11
                    2. 3*x^5+x^2+0.1
                    3. sin(x)+cos(x)
                    4. x^2+10*x-6
                    0. Завершение и выход из программы
                    Номер функции:\s""");
            try {
                int functionNumber = Integer.parseInt(in.next().trim());
                if (functionNumber == 1 || functionNumber == 2 || functionNumber == 3 || functionNumber == 4 || functionNumber == 0)
                    return functionNumber;
            } catch (NumberFormatException ignored) {
                System.out.println("Введите число из диапозона 1-4");
            }
        }
    }

    public int inputMethod() {
        while (true) {
            System.out.print("""
                    Выбирите метод:
                    1. Метод трапеций
                    2. Метод Симсона
                    3. Метод Прямоугольников
                    Номер метода:\s""");
            try {
                int methodNumber = Integer.parseInt(in.next().trim());
                if (methodNumber == 1 || methodNumber == 2 || methodNumber == 3)
                    return methodNumber;
            } catch (NumberFormatException ignored) {
                System.out.println("Введите число из диапозона 1-3");
            }
        }
    }

    public int inputMethodOfRectangles() {
        while (true) {
            System.out.print("""
                    Выбирите метод:
                    1. Правых прямоугольников
                    2. Левых прямоугольников
                    3. Средних прямоугольников
                    4. Все методы 
                    номер метода:\s""");
            try {
                int num_method = Integer.parseInt(in.next().trim());
                if (num_method == 1 || num_method == 2 || num_method == 3 || num_method == 4)
                    return num_method;
            } catch (NumberFormatException ignored) {
                System.out.println("Введите число из диапозона 1-4");
            }
        }
    }

    public int inputA() {
        while (true) {
            System.out.print("Введите нижний предел интегрирования (Целое число) a: ");
            try {
                return Integer.parseInt(in.next().trim());
            } catch (NumberFormatException ignored) {
            }
        }
    }

    public int inputB() {
        while (true) {
            System.out.print("Введите верхний предел интегрирования (Целое число) b: ");
            try {
                return Integer.parseInt(in.next().trim());
            } catch (NumberFormatException ignored) {
            }
        }
    }

    public double inputE() {
        while (true) {
            System.out.print("Введите точность e: ");
            try {
                return Double.parseDouble(in.next().trim().replaceAll(",", "\\."));
            } catch (NumberFormatException ignored) {
            }
        }
    }

}