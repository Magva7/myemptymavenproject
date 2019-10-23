public class Main {
    public static void main(String[] args) {
//      System.out.println("Hello World!");

        System.out.println("Аргумент 1: " +args[0]);
        System.out.println("Аргумент 2: " +args[1]);
        System.out.println("Аргумент 3: " +args[2]);

        /**Задания по практике*/
        /**Сумма трех чисел*/
        /**Сумма*/
//        int sum = args[0] + args[1] + args[2]; показывает error, т.к. подаем тип string, а переменная int

        /**Приводим в int */
        int sum1 = Integer.valueOf(args[0] + args[1] + args[2]);
        System.out.println("sum1 - сумма трех чисел равна: " +sum1);

        /**Приводим в int */
        int sum2 = Integer.valueOf(sum1);
        System.out.println("sum2 - сумма трех чисел равна: " +sum2);

        /**Среднее от 3 чисел - делим на 3 (Получив три числа, вывести среднее значение от их суммы)*/
        float AverageSum =  sum1/ 3;
        System.out.println("Сумма трех чисел, деленная на 3 равна: " +AverageSum);

        /**Пробуем по одному аргументу*/
        int arg1 = Integer.valueOf(args[0]);
        int arg2 = Integer.valueOf(args[1]);
        int arg3 = Integer.valueOf(args[2]);
        int argSum = arg1 + arg2 + arg3;
        int average = argSum/3;
        System.out.println("argSum: " +argSum);
        System.out.println("average: " +average);

        /**Произведение 3 чисел*/
//        int umnoj = Integer.valueOf(args[0] * args[1] * args[2]);
//        System.out.println("Произведение 3 чисел равно: " +umnoj);

//        /**Тест вывода переменной с циклом*/
//      for (int i = 0; i < args.length; i++) {
//          int varNew3 = Integer.valueOf(args[i]);
//          int varNew4 = varNew3 + 10;
//          System.out.println("Вывод переменной в цикле. arg[0] + 10 = " + varNew4);
//      }
}
    }