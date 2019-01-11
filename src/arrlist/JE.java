package arrlist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JE {
    public static void main(String[] args) {
        ArrayList<Integer> intArr =
               new ArrayList<>();
        ArrayList<Integer> newArr =
                new ArrayList<>();
        boolean found = false;
        for(int i = 1; i < 10000; i ++){
            found = false;
            if((i) % Math.sqrt(i) == 0){
                intArr.add(i);
                found = true;
            }
            if (found && (i%2 == 0 && i%3 == 0)){
                newArr.add(i);
            }
        }

        for (Integer i: newArr) {
            System.out.print(i + ", ");
        }
        newArr.remove(1);
        newArr.remove((Integer)900);
        System.out.println("");
        for (Integer i: newArr) {
            System.out.print(i + ", ");
        }

        String[] stringMas = new String[5];
        stringMas[0] = "One";
        stringMas[2] = "One";
        List<String> stringsArr =
                Arrays.asList(stringMas);
        System.out.println("------");
        for(String s : stringsArr){
            System.out.println(s);
        }
    }
}
