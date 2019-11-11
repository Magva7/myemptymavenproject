public class User {

    String name;
    short age;
    int height;

    public User(String name, int a, int b) { /*Т.е. суть такая - передаем 3 переменных, стровую, это по-любому имя и две
    числовых, а вот чтобы понять, какая из них возраст, а какая рост - делаем проверку, если число в диапазоне от 1 до 100,
    то 99% что это возраст, а если больше, то 99% что это рост*/
        this.name = name; //Имя

        if (a > 0 && a < 100){ //Сравниваем, если переменная a у нас в диапазоне от 1 до 100
            this.age = (short) a; //то это по-любому возраст
            this.height = b; //а значит вторая переменная это рост

        } else { //если не так, то значит наоборот
            this.age = (short) b;
            this.height = a;
        }
    }


    public User(int a, String name, int b) { /*Меняем перменные местами*/

        if (a > 0 && a < 100){
            this.age = (short) a;
            this.height = b;

        } else {
            this.age = (short) b;
            this.height = a;
        }

        this.name = name;
    }

    public User(int a, int b, String name) { /*Меняем перменные местами*/

        if (a > 0 && a < 100){
            this.age = (short) a;
            this.height = b;

        } else {
            this.age = (short) b;
            this.height = a;
        }

        this.name = name;
    }

    public static void main(String[] args) {
        /*Для теста создаем разные объекты и передаем параметры в разном порядке, чтобы протестить, что
        наши конструкторы работают*/
        User Vasya = new User("Вася", 11, 178); /*надо переводить  второй параметр
        в  short, а то воспринимает как int*/
        User Petya = new User("Петя", 190, 17);/*надо переводить  третий параметр
        в  short, а то воспринимает как int*/
        User Olya = new User((short) 21, "Оля", 176);/*надо переводить  первый параметр
        в  short, а то воспринимает как int*/

        Output (Vasya);
        Output (Petya);
        Output (Olya);
    }

    /*Добавляем ради интереса новый метод, который будет выводить*/
    public static void Output(User ktoto ) { System.out.println( ktoto.name + " - Возраст" + " " + ktoto.age + ", Рост" + " " + ktoto.height); }
}