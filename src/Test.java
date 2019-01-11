public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        /*rectangle.height = 10;
        rectangle.width = 100;*/
        rectangle.setHeight(10);
        rectangle.setWidth(100);

        System.out.println("From method");
        System.out.println(rectangle.getArea());
        rectangle.setWidth(200);
        System.out.println(rectangle.getArea());

        System.out.println("directly to object");
        System.out.println(rectangle.width);

        System.out.println("Object 2");
        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.getHeight());

    }
}
