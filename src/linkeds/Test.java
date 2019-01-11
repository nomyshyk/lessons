package linkeds;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<Pet>();
        for (int i = 0; i < 100; i++) {
            if(i%2 == 0){
                pets.add(new Cat(i));
            } else {
                pets.add(new Dog(i));
            }
        }

        int catPosition = 0;
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i) instanceof Cat){
                ++catPosition;
                if(catPosition > 0 && catPosition%5 == 0){
                    pets.remove(i);
                }
            }
        }
        int dogPosition = 0;
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i) instanceof Dog){
                ++dogPosition;
                if(dogPosition > 0 && dogPosition%3 == 0){
                    pets.add(i+1, new Mouse(i));
                }
            }
        }

        boolean mouseFound = false;
        boolean catFound = false;
        LinkedList<Pet> mouseCatList = new LinkedList<>();
        for (int i = 0; i < pets.size(); i++) {
            if(pets.get(i) instanceof Mouse){
                mouseFound = true;
                System.out.println("XXXXX");
            }else if(pets.get(i) instanceof Dog) {
                mouseFound = false;
            }

            if(pets.get(i) instanceof Cat){
                catFound = true;
                System.out.println("YYYYY");
            }else if(pets.get(i) instanceof Dog) {
                catFound = false;
            }

            if (mouseFound && catFound){
                mouseCatList.add(pets.get(i-1));
                mouseCatList.add(pets.get(i));
                catFound = false;
                mouseFound = false;
            }

        }

        for (Pet p: pets ) {
            System.out.println(p);
        }
        //pets.pollLast();
        System.out.println(" ============ ");
        for (Pet p: mouseCatList ) {
            System.out.println(p);
        }

    }
}
