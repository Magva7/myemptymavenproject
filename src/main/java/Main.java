public class Main {
    public static void main(String[] args) {
//      System.out.println("Hello World!");
        /**Задача - вывести для теста аргумент, который передали, если ничего не передали,
         * то вывести сообщение. Схитрим и просто проверим длину массива, если 0, значит
         * ничего не передали*/
        if (args.length != 0) {
            System.out.println("Выводим аргумент 1: " + args[0]);
        } else {
            System.out.println("Введите аргумент");
        }


//        /**Задача: Поиск простого числа в промежутке от 2 до 100*
//         * Т.е. судя по всему нужно вывести рандомное число в этом диапазоне*/
//        int min = 2;
//        int max = 100;
//
//        /**Суть выражения ниже: сначала объявляем новую переменную rnd, которую потом будем выводить, объявляем ее
//         * сразу int, то работает потому что бы потом после равно перед выражением int вставили и поэтому целое число
//         * выводится, если бы не вставили, то выводилось бы не целое, типа 72,0 и тогда вместо int надо было бы
//         * использовать double, а т.к. мы хотим, чтобы без запятой выводилось, то используем unt,потом используем
//         * метод  Math.random, задаем ему максимальное и минимальные значения, потом добавляем единицу, чтобы в диапазон
//         * попало максимальное значение, а потом еще раз добавляем минимальное значение, чтобы отсчет диапазона
//         * пошел от него, потом вставляем перед выражением int, чтобы было целое число*/
//        int rnd = (int)(Math.random() * ((max - min) + 1)) + min;
//
//        System.out.println("1Cлучайное целое число: " + rnd);

    }
//    public static int rnd(int min, int max)
//    {
//        max -= min;
//        return (int) (Math.random() * ++max) + min;
//    }


//        /**Если нужно будет угадывать число, то пока неясно, как сделать, чтобы выводился вопрос, т.е. чтобы
//         * пользователь вводил число и выводился ответ - больше или меньше введое число загаданного числа*/

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