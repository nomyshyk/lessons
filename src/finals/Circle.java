package finals;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) throws Exception{
        File file = new File("my.txt");
        FileWriter fw = new FileWriter(file);
        String string = "";
        for(char c = 'А'; c<= 'Я' ; c++){
            string += (c+"\n");
        }
        fw.write(string);
        fw.close();

        FileReader fr = new FileReader(file);
        Scanner scanner = new Scanner(fr);

        File fileCopy = new File("div3.txt");
        fw = new FileWriter(fileCopy);
        String every3rd = null;
        int i = 0;
        while (scanner.hasNextLine()){
            if (i%3 == 0 && i > 0){
                System.out.println(scanner.nextLine());
            }
            i++;
        }
        fw.write(every3rd);
        fw.close();

    }
}