public class Main {
    public static void main(String[] args) {
//      System.out.println("Hello World!");

        //      System.out.println("Hello World!");
        /**Задача - вывести для теста аргумент, который передали, если ничего не передали,
         * то вывести сообщение. Схитрим и просто проверим длину массива, если 0, значит
         * ничего не передали*/
        if (args.length != 0) {
            System.out.println("Выводим аргумент 1: " + args[0]);
        } else {
            System.out.println("Введите аргумент");
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