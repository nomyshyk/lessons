package staticLesson;

public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sharik", 5, 6);
        Dog dog2 = new Dog("Жучка", 3, 4);
        Dog dog3 = new Dog("Шарик2", 4, 4);
        dog3 = new Dog("Шарик2", 4, 4);
        System.out.println(Dog.getCount());
    }
}
