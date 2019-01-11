package arrlist;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            cats.add(new Cat("Cat N"+i, i));
        }

        int position =
                cats.indexOf
                        (new Cat("Cat N"+6, 10));
        System.out.println(
                position == -1 ? "Не найдено"
                        : "Найдено по индексу "
                           + position
        );
        System.out.println(cats.contains(new Object()));

        System.out.println("Одна и та же ? " +
                new Cat("Tom", 15)
                .equals(new Cat("Tom", 15)));

        Cat[] arrayCats = cats.toArray(new Cat[6]);

        for (Cat c : arrayCats) {
            System.out.println("Кошка в цикле " + c);
        }

    }
}
