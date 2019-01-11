package staticLesson;

public class TestParamVal {
    public static void main(String[] args) {
        /*int value = 100;
        increment(value);*/

        TestObject to = new TestObject();
        to.objValue = 200;
        increment(to.objValue);
        System.out.println(to.objValue);
        increment(to);
        System.out.println("Я после того как был вызван по ссылке "
                + to.objValue);
        //System.out.println(value);
    }

    public static void increment(int pvalue){
        ++pvalue;
        System.out.println("Моё значение в int методе " + pvalue);
    }

    public static void increment(TestObject to){
        ++to.objValue;
        System.out.println("Моё значение в TestObject методе " + to.objValue);
    }


}

class TestObject{
    public int objValue;
}
