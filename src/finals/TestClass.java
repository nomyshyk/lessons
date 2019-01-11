package finals;

public class TestClass {
    final FinalBoy finalBoy = new FinalBoy();
    public static void main(String[] args) {
        TestClass tk = new TestClass();
        //tk.to = new TestClassOld();
        tk.finalBoy.value = 200;
    }
}
class FinalBoy{
    int value;
}
