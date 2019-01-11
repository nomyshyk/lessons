package hashtest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestHash1 {
    public static void main(String[] args) {
        HashSet<Integer> integers =
                new HashSet<>();

        for(int j = 1; j <= 4; j ++){
            for (int i = 1; i <= 100; i++){
                integers.add(i);
            }
        }

        int summa = 0;
        for (Integer i: integers) {
            System.out.println(i);
            summa += i;
        }
        System.out.println(summa);

    }
}
