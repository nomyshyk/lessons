public class JavaVoid {
    public static void main(String[] args) {
        double a1 = 12.09;
        double b1 = 8.7;

        System.out.println((a1*b1)/ (a1-b1));
        double a2 = 127.09;
        double b2 = 8.75;
        System.out.println((a2*b2)/ (a2/b2));

        System.out.println("-метод берется за работу-");
        methodTest(b1, 23);
        System.out.println("a1  = "+ a1);
        methodTest( 8.75);
        //double resultAB1 = methodTest( 8.75);
    }

    static void methodTest(double a, double b){
        System.out.println("Метод с двумя аргументами");
        System.out.println((a*b)/ (a+b));
    }

    static void methodTest(double a){
        System.out.println("Метод с одним аргументом");
        double result = (a*a)/ (a+a);
        System.out.println(result);
    }
}
