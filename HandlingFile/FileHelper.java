import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class FileHelper implements IFileHelper {
    private static FileHelper instance = null;

    // Khoá không cho tạo đối tượng từ bên ngoài Class
    private FileHelper() {
    }

    public synchronized static FileHelper getInstance() {
        if (instance == null) {
            instance = new FileHelper();
        }
        return instance;
    }


    @Override
    public List<String> readLines(File f) throws FileNotFoundException {
        List<String> lines = new ArrayList<>();
        Scanner reader = new Scanner(f);
        while (reader.hasNextLine()) {
            lines.add(reader.nextLine());
        }
        reader.close();
        return lines;
    }

    @Override
    public List<String> readLines(String pathFile) throws FileNotFoundException {
        File f = new File(pathFile);
        return readLines(f);
    }

    // Append bằng false là ghi đè, bằng true là ghi nối tiếp
    @Override
    public void writeLine(File f, boolean isAppend, String line) throws IOException {
        FileWriter fileWriter = new FileWriter(f, isAppend);
        fileWriter.write("\n");
        fileWriter.write(line);
        fileWriter.close();
    }

    @Override
    public void writeLine(String pathFile, boolean isAppend, String line) throws IOException {
        File f = new File(pathFile);
        writeLine(f, isAppend, line);
    }
}
