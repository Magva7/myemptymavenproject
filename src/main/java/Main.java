public class Main {
    public static void main(String[] args) {
//      System.out.println("Hello World!");

        /**Вызываем наш метод, который выводит простые числа*/

        /**Тут код нашего метода, который выводит простые числа*/
        public static int average(int argSum, int countArg) {

            int average = argSum/countArg;
            return average;
        }


        //      System.out.println("Hello World!");
        /**Задача - вывести сообщение если ничего не передали*/
        if (args.length == 0) {
            System.out.println("Введите аргумент");
        } else {
            /**Тут будем вызывать наш метод, который выводит среднее значение от переданных аргументов*/
        }

        //        /**Старое*/
//        System.out.println("Всего аргументов в командной строке: " + args.length);
//        System.out.println("Выводим аргумент 1: " +args[0]);
//
//        /**Объявляем новую переменную, у которое значение будет равно первому аргументу, который мы передадим,
//         * он же будет первым элементом массива и сразу приводим эту переменную к типу int*/
//        int varNew = Integer.valueOf(args[0]);
//        int varNew2 = varNew +10;
//        System.out.println("Тест вывода переменной без цикла. Переменная + 10 = " +varNew2);
//
//        /**Тест вывода переменной с циклом*/
//      for (int i = 0; i < args.length; i++) {
//          int varNew3 = Integer.valueOf(args[i]);
//          int varNew4 = varNew3 + 10;
//          System.out.println("Вывод переменной в цикле. arg[0] + 10 = " + varNew4);
//      }
}
    }