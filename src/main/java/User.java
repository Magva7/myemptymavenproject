public class User {

    String name;
    short age;
    int height;

    public User(String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(String name, int height, short age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public User(int height, String name, short age) {
        this.height = height;
        this.name = name;
        this.age = age;
    }

    public User(int height, short age, String name) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public User(short age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public User(short age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public static void main(String[] args) {
        /*Для теста создаем разные объекты и передаем параметры в разном порядке, чтобы протестить, что
        наши конструкторы работают*/
        User Vasya = new User("Вася", (short) 11, 178); /*надо переводить  второй параметр
        в  short, а то воспринимает как int*/
        User Petya = new User("Петя", 190, (short) 17);/*надо переводить  третий параметр
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