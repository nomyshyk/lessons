package arrlist;

import java.util.ArrayList;

public class Evens {
    public static void main(String[] args) {
        ArrayList<Integer> mas =
                 new ArrayList<>();
        for(int i = 1; i<= 100; i++){
            if(i%2 == 0){
                mas.add(i);
            } else{
                mas.add(0,i);
            }
        }
        for(Integer i : mas){
            System.out.println(i);
        }
    }
}
