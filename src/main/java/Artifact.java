/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/

public class Artifact {

    String name;
    int id;
    String culture;
    int age;

    //для тех, у которых есть все аргументы
    public Artifact(String name, int id, String culture, int age) {
        this.name = name;
        this.id = id;
        this.culture = culture;
        this.age = age;
    }

    //для тех, у которых известен только порядковый номер и культура
    public Artifact(String name, int id, String culture) {
        this.name = name;
        this.id = id;
        this.culture = culture;
    }

    //для тех, у которых известен только порядковый номер
    public Artifact(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public static void main(String[] args) {
        //Создаем артефакт, у которого есть все параметры
        Artifact cherep = new Artifact("Череп", 1, "Ацтеки", 5);

        //Создаем артефакт, у которого есть только порядковый номер и культура
        Artifact kalendar = new Artifact("Календарь", 55, "Майа");

        //Создаем артефакт, у которого есть только порядковый номер
        Artifact kamen = new Artifact("Камень", 2335);

        //Выводим для теста наши созданные артефакты сразу с их параметрами
        System.out.println("Название артефакта: " + cherep.name);
        System.out.println("id: " + cherep.id);
        System.out.println("Культура: " + cherep.culture);
        System.out.println("Возраст: " + cherep.age);
        System.out.println();

        System.out.println("Название артефакта: " + kalendar.name);
        System.out.println("id: " + kalendar.id);
        System.out.println("Культура: " + kalendar.culture);
        System.out.println("Возраст: " + kalendar.age);
        System.out.println();

        System.out.println("Название артефакта: " + kamen.name);
        System.out.println("id: " + kamen.id);
        System.out.println("Культура: " + kamen.culture);
        System.out.println("Возраст: " + kamen.age);
    }
}
