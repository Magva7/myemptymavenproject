public class Main {
public static void main(String[] args) {
        System.out.println("Hello World!");

        /**Тест вывода аргументов*/
        System.out.println("Аргумент 1: " + args[0]);
        System.out.println("Аргумент 2: " + args[1]);
        System.out.println("Аргумент 3: " + args[2]);

        }

/**Суммирование аргументов*/
//        /**Переводим аргументы в int по одному*/
//        int arg1 = Integer.valueOf(args[0]);
//        int arg2 = Integer.valueOf(args[1]);
//        int arg3 = Integer.valueOf(args[2]);
//

/**
 * Тестируем метод
 */
public static void test() {
        int a = 15;
        System.out.println(a);
        }


/**
 * Объявляем новый метод 1, который принимает 3 аргумента
 */
public static int average(String[] args) {
        int arg1 = Integer.valueOf(args[0]);
        int arg2 = Integer.valueOf(args[1]);
        int arg3 = Integer.valueOf(args[2]);
        int averageSum = (arg1 + arg2 + arg3) / 3;

        System.out.println("1 Сумма чисел, делённая на 3 равна: " + averageSum);

        return averageSum;
        }

/**
 * Объявляем новый метод 2, который принимает 3 аргумента
 */
public static void average2(int arg4, int arg5, int arg6) {
//        int arg4 = Integer.valueOf(arg4);
//        int arg5 = Integer.valueOf(arg5);
//        int arg6 = Integer.valueOf(arg6);
        int averageSum2 = (arg4 + arg5 + arg6) / 3;
        }
}
//        System.out.println("2 Сумма чисел, делённая на 3 равна: " +averageSum2);
//    }
//
//        /**Делим сумму на 3*/
//        int average = argSum/3;
//
//        /**Выводим для теста сумму трех аргументов*/
//        System.out.println("Сумма аргументов равна: " +argSum);
//
//        /**Выводим сумму, деленную на 3*/
//        System.out.println("Сумма аргументов, деленная на 3 равна: " +average);

//        /**Тест вывода переменной с циклом*/
//      for (int i = 0; i < args.length; i++) {
//          int varNew3 = Integer.valueOf(args[i]);
//          int varNew4 = varNew3 + 10;
//          System.out.println("Вывод переменной в цикле. arg[0] + 10 = " + varNew4);
//      }

//}