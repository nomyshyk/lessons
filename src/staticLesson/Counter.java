package staticLesson;

public class Counter {
    private static int numOfCalls;

    public static int increment(){
        return ++numOfCalls;
    }

    public static int factorial(){
        int result = 1;
        if (numOfCalls == 0){
            return 0;
        }
        for(int i = 1; i <= numOfCalls; i++){
            result = result * i;
        }
        return result;
    }

    public static int getNumOfCalls() {
        return numOfCalls;
    }

    public static void setNumOfCalls(int numOfCalls) {
        Counter.numOfCalls = numOfCalls;
    }
}
