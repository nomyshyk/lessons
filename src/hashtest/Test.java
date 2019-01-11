package hashtest;

import java.util.LinkedList;
import java.util.List;

public class Test {
    List<Multiple> multiples = new LinkedList<>();

    public static void main(String[] args)
            throws Exception{

        Test test = new Test();
        test.addToMultiples(new Multiple(10,10));
        test.addToMultiples(new Multiple(5,3));
        test.addToMultiples(new Multiple(2,50));
        test.addToMultiples(new Multiple(25,4));
        System.out.println(test.multiples.size());
    }

    public void addToMultiples(Multiple m) throws Exception {
        boolean found = multiples.contains(m);
        if(found == true){
            System.out.println
                    ("Уже есть - "+ m.a + " " + m.b);;
        } else{
            multiples.add(m);
        }

    }


}
