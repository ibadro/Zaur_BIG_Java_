package Black_Belt.IO_NIO.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path1 {
    public static void main(String[] args) {
        Path filePath = Paths.get("Tesdt15.txt");
        System.out.println("filePath.getFileName()   " + filePath.getFileName());
    }
}
  /*  Объект типа Path представляет собой путь к файлу или
        Path path = Paths.get(“text1.txt”);
        path.getFileName() path.getParent() path.getRoot()

 getParent -родитель
path.getFileName() path.getParent() path.getRoot()
        path.is Absolute() path.toAbsolutePath()
        path1.resolve(path2) path1.relativize(path2)*/