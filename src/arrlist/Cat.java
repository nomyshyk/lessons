package arrlist;

public class Cat {
    public String name;
    public Integer age;

    public Cat(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " "+ this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Cat)){
            return false;
        }
        if(this.age.equals(((Cat) obj).age) &&
                this.name.equals (((Cat) obj).name)){
            return true;
        }
        return false;
    }
}
