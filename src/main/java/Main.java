public class Main {
    public static void main(String[] args) {

        /*Создаем новый объект нашего класса машины времени*/
        TimeMachine timeMachine = new TimeMachine();

   /*Создаем новый объект нашего Cat, чтобы создать нового кота и передаем в него сразу 5,
    чтобы у этого нового объекта у переменной age было значение 5, т.е. чтобы возраст у кота как бы был 5*/
        Cat barsik = new Cat(5);

        /*Выводим, чтобы глянуть*/
        System.out.println("Сколько лет Барсику в самом начале работы программы?");
        System.out.println(barsik.age);

        /*Вызываем наш метод, который должен увеличить у объекта Cat переменную age на 10,
        и опять выводим, чтобы протестить*/
        timeMachine.goToFuture(barsik);
        System.out.println("А теперь?");
        System.out.println(barsik.age);

        /*Видим, что да, age увиличилась и выводим сообщение*/
        System.out.println("Елки-палки! Барсик постарел на 10 лет! Живо гони назад!");

        /*Теперь вызываем метод, который должен уменьшить age на 10 и снова выводим age, чтобы глянуть,
         столько теперь age*/
        timeMachine.goToPast(barsik);

        System.out.println("Получилось? Мы вернули коту его изначальный возраст?");
        System.out.println(barsik.age);
    }
}