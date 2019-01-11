package linkeds;

public abstract class Pet {
    public int age;
    public Pet(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getClass() + " " + age ;
    }
}
