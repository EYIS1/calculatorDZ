import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Здравствуйте, это калькулятор от EYIS, введите первое число, затем операцию: + - * /, затем второе число.");
        System.out.println("первое число: ");
        int firstNum = scanner.nextInt();
        System.out.println("операция: ");
        String operation = scanner.next();
        System.out.println("второе число: ");
        int secondNum = scanner.nextInt();

        int result = 0;
        

        switch (operation)
        {
            case "+":
                result = firstNum + secondNum;
                break;

            case  "-":
                result = firstNum - secondNum;
                break;

            case "*":
                result = firstNum * secondNum;
                break;

            case "/":
                if (secondNum != 0)
                {
                    result = firstNum / secondNum;
                }
                else
                {
                    System.out.println("На ноль не делится.");
                }

                break;

            default:
                System.out.println("Ошибка: непавильная операция!");
                return;
        }
        System.out.println( "Result: " + result);
    }
}