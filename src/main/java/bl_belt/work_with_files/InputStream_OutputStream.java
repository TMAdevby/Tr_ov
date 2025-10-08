package bl_belt.work_with_files;

import java.io.*;

public class InputStream_OutputStream {
    public static void main(String[] args) {
        try(FileInputStream inputStream
                = new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\lion.jpg");
                    FileOutputStream outputStream = new FileOutputStream("lion.jpg")){
            int i;
            while((i = inputStream.read()) != -1){
                outputStream.write(i);
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
