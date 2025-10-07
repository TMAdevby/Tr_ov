package bl_belt.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно что мне ничего не известно!\n" +
                "Вот последняя правда открытая мной.\n";
        FileWriter writer = null;
        try{
            //writer = new FileWriter("C:\\Users\\Lenovo\\OneDrive\\Desktop\\text1.txt", true);
            writer = new FileWriter("text2.txt",false);
            /*for(int i = 0; i<rubai.length(); i++){
                writer.write(rubai.charAt(i));
            }*/
            writer.write(rubai);
            writer.write("\n");
            System.out.println("Done!");
        }   catch (IOException e){
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
    }
}
