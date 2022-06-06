package solidprinciples.singleresponsibilty;

import java.io.IOException;

/**
 * Created by SK on 10/23/2021
 **/
public class Demo {

    public static void main(String[] args) {

        Journal journal = new Journal();
        journal.addEntry("I played badminton today");
        journal.addEntry("I ate breakfast today");
        System.out.println(journal);

        Persistence persistence = new Persistence();
        String filename = "journal.txt";
        persistence.saveToFile(journal, filename, true);

        try {
            Runtime.getRuntime().exec("notepad.exe " +filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
