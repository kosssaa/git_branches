package pl.sda.javagda25;

import java.io.*;

public class Odczyt {
    public static void main(String[] args) {


        int counter = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("Odczyt.txt"))) {
            String line;
            while ((line = reader.readLine()) != null)
                counter++;

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Liczba linii " + counter);

    }

}