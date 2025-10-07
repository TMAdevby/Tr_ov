package bl_belt.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной." +
                "Непонятного нет для меня под луной." +
                "Мне известно что мне ничего не известно!" +
                "Вот последняя правда открытая мной.";
        FileWriter writer = null;
        try{
            //writer = new FileWriter("C:\\Users\\Lenovo\\OneDrive\\Desktop\\text1.txt", true);
            writer = new FileWriter("text2.txt");
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
