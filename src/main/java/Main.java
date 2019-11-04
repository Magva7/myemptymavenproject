import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

///**Вывести на экран пять строк из нулей, причем количество нулей в каждой строке равно номеру строки.*/
//    /**Создаем переменную, в которой будет храниться количество нулей*/
//    String countNuls = "";
//    /**Создаем цикл, который будет набивать нашу переменную нулями*/
//    for(int i = 0; i<5;i++){
//        countNuls +="0";
//        System.out.println(countNuls);
//    }

/**Вывести англ. алфавит по 5 букв в строке*/

/**Вывести англ. алфавит по 5 букв в строке*/
/**Псевдокод*/
/**Создаем переменную, в которой будет храниться весь алфавит - может лучше массив*/
String alphabet[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "v", "x", "y", "z"};

///**Теструем вывод массива целиком, для этого создаем новую переменную String, в которой будут храниться элементы массива,
// *  чтобы выводились в нормальном виде, т.е. если выведем просто массив, то выведется криво*/
//        String intArrayString = Arrays.toString(alphabet);
//        System.out.println(intArrayString);
///**Теперь пробуем вывести элементы массива по 5 в строке, пока руками, потом можно попробовать через цикл*/
//        System.out.println(alphabet[0]+alphabet[1]+alphabet[2]+alphabet[3]+alphabet[4]);
//        System.out.println(alphabet[5]+alphabet[6]+alphabet[7]+alphabet[8]+alphabet[9]);
//        System.out.println(alphabet[10]+alphabet[11]+alphabet[12]+alphabet[13]+alphabet[14]);
//        System.out.println(alphabet[15]+alphabet[16]+alphabet[17]+alphabet[18]+alphabet[19]);
//        System.out.println(alphabet[20]+alphabet[21]+alphabet[22]);

//        /**Теперь пробуем через нескольтко циклов*/
//            /**Перебирает перевые 5 элементов массива и выводит их в строке*/
//            for (int i=0;i<5;i++){
//                System.out.print(alphabet[i]);
//            }
//        /**Просто перенос строки после цикла, типа br, чтобы следующие 5 элементов вывелись на новой строке*/
//        System.out.println();
//
//        for (int i=5;i<10;i++){
//            System.out.print(alphabet[i]);
//        }
//        /**Просто перенос строки после цикла, типа br, чтобы следующие 5 элементов вывелись на новой строке*/
//        System.out.println();
//
//        for (int i=10;i<15;i++){
//            System.out.print(alphabet[i]);
//        }
//        /**Просто перенос строки после цикла, типа br, чтобы следующие 5 элементов вывелись на новой строке*/
//        System.out.println();
//
//        for (int i=15;i<20;i++){
//            System.out.print(alphabet[i]);
//        }
//        /**Просто перенос строки после цикла, типа br, чтобы следующие 5 элементов вывелись на новой строке*/
//        System.out.println();
//
//        for (int i=20;i<23;i++){
//            System.out.print(alphabet[i]);
//        }
//        /**Просто перенос строки после цикла, типа br, чтобы следующие 5 элементов вывелись на новой строке*/
//        System.out.println();

        /**Теперь пробуем через вложенный цикл*/
        for(int count = 5;count<26;count +=5) {

            for (int i = count - 5; i < count; i++) {
                System.out.print(alphabet[i]);
            }

            /**Просто перенос строки после цикла, типа br, чтобы следующие 5 элементов вывелись на новой строке*/
            System.out.println();
            System.out.println(count);
        }


}
    }