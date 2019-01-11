package staticLesson;

public class Test {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.increment();
        c1.increment();
        c1.increment();
        c1.increment();


        System.out.println(c1.factorial());
        System.out.println(Math.abs(-1212));
    }
}
