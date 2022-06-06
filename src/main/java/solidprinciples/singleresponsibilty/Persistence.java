package solidprinciples.singleresponsibilty;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

/**
 * Created by SK on 10/23/2021
 **/
public class Persistence {

  public void saveToFile(Journal journal, String filename, boolean overwrite) {
    if (overwrite || new File(filename).exists()) {
      try (PrintStream out = new PrintStream(filename)){
        out.println(journal.toString());
      } catch (FileNotFoundException e) {
        System.out.println("File not found - "+e.getMessage());
      }
    }
  }

  public Journal load (String filename) {
    // TODO
    return null;
  }

  public Journal load (URL url) {
    // TODO
    return null;
  }

}
