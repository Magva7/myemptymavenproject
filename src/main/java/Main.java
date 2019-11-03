public class Main {
    public static void main(String args[]) {
        /**Объявляем переменную, в которой будет храниться длина массива args, т.е. какое количество
         * аргументов мы передали,чтобы потом мы знали, на сколько делить*/
        int countArg = args.length;

        /**Объявляем переменную, в которой будет храниться сумма введенных аргументов*/
        int argSum = 0;

        /**Вызываем наш метод, который выводит простые числа*/
        simple_number_method();

        /**Если ничего не передали, то вывести сообщение, если передали, то вызываем метод,
         * который выводит среднее значение от переданных аргументов */
        if (args.length == 0) {
            System.out.println("Введите аргумент");
        } else {
            /**Вызываемт наш метод, который преобразует введенные аргументы в int, суммирует их и делит на количество*/
            changeToIntegerAndCalcAverage(args, argSum,countArg);;
        }
    }

    /**Код метода, который выводит простые числа*/
    static void simple_number_method() {
        /**Тестовое сообщение для отладки*/
        System.out.println("Запускается метод simple_number_method, которые выводит простые числа");
        /**Задача- вывести простые числа от 2 до 100
         * Судя по Википедии, проще всего делать проверку на делители через квадратный корень*/

        /**Алгоритм следующий: *Извлекаем квадратный корень из числа,
         * Округляем кв. корень до ближайшего целого
         *Проверяем, делится ли число на множители, т.е. на 2,3 и т.д до кв.корень*/

        /**Делаем через цикл, у которого все внутри, пока с конкретными
         * числами, с переменными потом*/
        for (int number = 2; number <= 100; number++) {

            /**Берем квадратный корень из переменной*/
            double square = Math.sqrt(number);

            /**Округляем*/
            int square2 = (int) Math.round(square);

            /**Выводим для теста*/
            // System.out.println(square2);

/**Итак, получили квадратный корень из числа, и округлили его до целого.
 * Теперь в цикле каждую итерацию делим число на j, начиная с 2 и заканчивая, пока
 * j не будет равно квадратный корень и смотрим, есть ли остаток,
 * если остаток есть, значит число не поделилось, тогда
 * делим число на j плюс 1 и опять проверяем,
 * есть ли остаток, и т.д. до итерации, пока j не будет равно квадратный корень.
 * Если в какой-нибудь из итераций поделилось без остатка, т.е. остаток = 0,
 * то увеличиваем счетик counter, это значит число не простое и мы его потом
 * выводить не будем, а если во всех итерациях при делении был остаток, то
 * тогда у нас счетчик будет 0, значит число простое и мы его потом выведем*/

/**Объявляем переменную для счетчика*/
            int counter = 0;

/**Для проверки остатков делаем цикл, отсчет в нем будет по переменной j,
 * которая будет каждую итерацию увеличиваться на 1 от 2 до кв. корня*/

            for (int j = 2; j <= square2; j++) {
                int ostatok = number % j;

                if (ostatok == 0)
                    counter++;
            }

            /**Теперь проверяем счетчик, если он 0, значит
             * остатков при делении ни разу не было, значит число простое и
             * мы его выводим, а если не 0, значит где-то поделилось без остатка,
             счетчик увеличился и значит число не простое и вы его не выводим, т.е.
             ничего не делаем*/
            if (counter == 0) {
                System.out.println(number);
            }
        }
    }

    /**Код метода, который переводит в цикле числа в int, суммирует их и делит на кол-во аргументов*/
    public static void changeToIntegerAndCalcAverage(String[] args, int argSum, int countArg) {
        /**Набиваем переменную argSum - переводим принятые снаружи в терминале аргументы в int через цикл.
         * Переводим каждый элемент, перебирая их по порядку, каждую итерацию в переменную argSum
         * будет прибавляться аргумент, переведенный в int*/
        for (int i = 0; i < args.length; i++) {
            argSum += Integer.valueOf(args[i]);
        }
        int average = argSum/countArg;
        System.out.println("Сумма аргументов, деленная их количество равна: " +average);
    }
}
