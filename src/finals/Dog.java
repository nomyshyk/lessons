package finals;

public class Dog {
    String name;
    int width;
    void bark(){
        System.out.println("Гав-гав!");
    }

    void run(){
        System.out.println("дыгыдык! дыгыдык!");
    }
}

class Mops extends Dog{

    void bark(){
        System.out.println("Гав-гав, я мопс");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();

        Mops mops = new Mops();
        mops.bark();
    }

    void run(){
        System.out.println("Я не бегаю, а хожу");
    }

}
