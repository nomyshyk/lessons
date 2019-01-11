package hashtest;

public class Cat {
    public int id;
    public String name;

    public Cat(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cat){
            return (((Cat) obj).name.
                    equals(this.name))
            && ((Cat) obj).id == this.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id*133;
    }
}
