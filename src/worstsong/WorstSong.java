package worstsong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WorstSong {
    public static String worstYearInMusic(String fileName) {
        int worstCount = 0;
        String worstSongYear = "";

        Map<String, Integer> yearCounter = new HashMap<>();

        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] splitWords = data.split(";");
                String year = splitWords[3];
                Integer count;
                count = yearCounter.get(year);

                if (count == null) {
                    yearCounter.put(year, 1);
                }

                else {
                    yearCounter.put(year, ++count);
                }
            }
        }

        catch (FileNotFoundException e) {
            System.out.println("Ou :( ERROR!");
        }

        for (Map.Entry<String, Integer> entry : yearCounter.entrySet()) {
            if (worstCount < entry.getValue()) {
                worstCount = entry.getValue();
                worstSongYear = entry.getKey();
            }
        }

        return worstSongYear;
    }

    public static void main(String[] args) {
        System.out.println(worstYearInMusic("100worst.csv"));
    }

}
