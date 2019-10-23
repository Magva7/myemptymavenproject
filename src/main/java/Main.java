public class Main {
    public static void main(String[] args) {
//      System.out.println("Hello World!");

        /**Тест вывода аргументов*/
        System.out.println("Аргумент 1: " +args[0]);
        System.out.println("Аргумент 2: " +args[1]);
        System.out.println("Аргумент 3: " +args[2]);

        /**Переводим аргументы в int по одному*/
        int arg1 = Integer.valueOf(args[0]);
        int arg2 = Integer.valueOf(args[1]);
        int arg3 = Integer.valueOf(args[2]);

        /**Суммируем 3 аргумента*/
        int argSum = arg1 + arg2 + arg3;

        /**Делим сумму на 3*/
        int average = argSum/3;

        /**Выводим для теста сумму трех аргументов*/
        System.out.println("Сумма аргументов равна: " +argSum);

        /**Выводим сумму, деленную на 3*/
        System.out.println("Сумма аргументов, деленная на 3 равна: " +average);

//        /**Тест вывода переменной с циклом*/
//      for (int i = 0; i < args.length; i++) {
//          int varNew3 = Integer.valueOf(args[i]);
//          int varNew4 = varNew3 + 10;
//          System.out.println("Вывод переменной в цикле. arg[0] + 10 = " + varNew4);
//      }
}
    }