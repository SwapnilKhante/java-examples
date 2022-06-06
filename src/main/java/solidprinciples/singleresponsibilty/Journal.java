package solidprinciples.singleresponsibilty;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


public class Journal {

    private final List<String> entries = new ArrayList <>();
    private static int count = 0;

    public void addEntry(String text){
        entries.add("" + (++count) +": " + text);
    }

    public void removeEntry(int index){
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    // method to store journal to a file
    // this is an anti-pattern as it violates the single responsibility principle
    // instead a separate class should be responsible for persisting the content of the file
    public void save(String filename) {
        try (PrintStream out = new PrintStream(filename)){
            out.println(toString());
        } catch (FileNotFoundException e) {
            System.out.println("File not found - "+e.getMessage());
        }
    }
}
