import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Viết class FileHelper để hỗ trợ đọc/ghi file
        Đối tượng file được truyền vào hoặc thông qua đường dẫn (path)

        Lưu ý: file là đối tượng đang làm việc lưu trong Ram, sẽ tham chiếu đến file thực tế nằm trên ổ cứng SSD hoặc HDD
        */

        // Tạo thư mục Java đường dẫn C:Java, tạo 1 file test.txt


        File fTest = new File("C:\\Java\\test.txt");
        if(!fTest.exists()){
            try {
                // Nếu file không tồn tại thì tạo file đó theo đường dẫn trên
                fTest.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // Tạo đối tương fileHelper hỗ trợ đọc ghi file thuận tiện hơn!!!

        FileHelper fileHelper = FileHelper.getInstance();
        // Đọc nội dung trong trong file test
        try {
            List<String> fTestLines = fileHelper.readLines(fTest);
            System.out.println(fTestLines);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Ghi nội dung vào file
        try {
            fileHelper.writeLine(fTest,true,"Hello wolrd");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Lại đọc lại nội dung file vừa thêm, đọc bằng path nhé

        try {
            List<String> fTestLines = fileHelper.readLines("C:\\Java\\test.txt");
            System.out.println(fTestLines);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
