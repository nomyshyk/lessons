package staticLesson;

class Cat{
    private static int count;
    private static int staticInt;

    public static void main(String args[]){
        Cat c = new Cat();
        System.out.println(Cat.count); //Ошибка
    }

    public static int getValue(){
        return count;
    }

}

