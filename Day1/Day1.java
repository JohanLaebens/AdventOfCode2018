package Day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Day1 {

    List<String> allLines;


    public static void main(String[] args) {
        new Day1();
    }


    Day1() {
        readfile("input.txt");

        int startLevel = 0;

        for (int i = 0;i<allLines.size();i++)
        {
            startLevel = startLevel + Integer.parseInt(allLines.get(i));
            System.out.println(startLevel);
        }

        System.out.print("I'm on level: " + startLevel);
    }



    private  void readfile(String filename)
    {
        try {
            //System.out.println(Paths.get(".").toAbsolutePath().normalize().toString() + "\Day1\\" + filename);
            allLines = Files.readAllLines(Paths.get(Paths.get(".").toAbsolutePath().normalize().toString() + "\\Day1\\" + filename));

//            for (String line : allLines) {
//                System.out.println(line);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
