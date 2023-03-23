package Main;

import View.NostroFrame;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;



public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        System.out.println("feugeihuieha!");
        NostroFrame nf1 = new NostroFrame();
        //legge tutto il file e lo mostra a video
        List<String> stngFile = new ArrayList<String>();
        Scanner scnr = new Scanner(new FileReader(
                "C:\\Users\\gaiac\\OneDrive\\Desktop\\scuola(5)\\gpo\\dizionario.txt"));
        String str;
        while (scnr.hasNext()) {
            str = scnr.next();
            stngFile.add(str);
        }
        String[] array=stngFile.toArray(new String[0]);
        for(String eachString : array) {
            System.out.println(eachString);
        }
        //prova per vedere se funziona
        System.out.println(array[20]);


    }
}

