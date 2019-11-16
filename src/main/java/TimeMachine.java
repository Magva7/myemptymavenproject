/*наш класс TimeMashine, у этого класса методы буду увеличивать и уменьшать значение age у объекта Cat*/

public class TimeMachine {

    public void goToFuture(Cat cat) {

        cat.age += 10;
    }

    public void goToPast(Cat cat) {

        cat.age -= 10;
    }
}