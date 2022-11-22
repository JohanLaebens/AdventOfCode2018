package Day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Day1b {

    List<String> allLines;

    public static void main(String[] args) {
        new Day1b();
    }


    Day1b() {
        readfile("input.txt");

        int startLevel = 0;
        List<Integer> visitedLevels =new ArrayList<Integer>();
        visitedLevels.add(0);
        boolean found = false;

        do {
            INNER_LOOP:
            for (int i = 0; i < allLines.size(); i++) {
                startLevel = startLevel + Integer.parseInt(allLines.get(i));
                System.out.println(startLevel);
                if (!findIfAlreadyAdded(startLevel, visitedLevels)) {
                    visitedLevels.add(startLevel);
                } else {
                    System.out.println("First to be double is: " + startLevel);
                    found= true;
                    break INNER_LOOP;
                }
            }
        } while (found== false);


    }

    private boolean findIfAlreadyAdded(int startLevel, List<Integer> visitedLevels) {
        for (int i = 0;i<visitedLevels.size();i++)
        {
            if (visitedLevels.get(i) == startLevel)
            {
                return true;
            }
        }
        return false;
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
