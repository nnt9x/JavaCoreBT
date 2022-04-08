import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IFileHelper {

    public List<String> readLines(File f) throws FileNotFoundException;
    public List<String> readLines(String pathFile) throws FileNotFoundException;
    public void writeLine(File f, boolean isAppend, String line) throws IOException;
    public void writeLine(String pathFile, boolean isAppend, String line) throws IOException;

}
