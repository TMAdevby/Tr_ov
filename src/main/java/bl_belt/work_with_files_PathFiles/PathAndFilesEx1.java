package bl_belt.work_with_files_PathFiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx1 {
    public static void main(String[] args) {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Lenovo\\OneDrive\\Desktop\\M");

        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("directoryPath.getFileName() " + directoryPath.getFileName());
        System.out.println("--------------------------------------------------");

        System.out.println("filePath.getFileName() " + filePath.getParent());
        System.out.println("directoryPath.getFileName() " + directoryPath.getParent());
        System.out.println("--------------------------------------------------");

        System.out.println("filePath.getRoot() " + filePath.getRoot());
        System.out.println("directoryPath.getRoot() " + directoryPath.getRoot());
        System.out.println("--------------------------------------------------");

        System.out.println("filePath.isAbsolute() " + filePath.isAbsolute());
        System.out.println("directoryPath.isAbsolute() " + directoryPath.isAbsolute());
        System.out.println("--------------------------------------------------");

    }
}
