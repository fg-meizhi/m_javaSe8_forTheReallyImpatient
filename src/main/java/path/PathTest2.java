package path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest2 {

    public static void main(String[] args) {

        Path absolute = Paths.get("/Users/maven/Downloads");

        try {
            Path p = absolute.resolve("2");
            Files.createDirectory(p);
            System.out.println("create directory: " + p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------");

        try {
            Path p = Paths.get(absolute.toString(), "2", "3", "4", "5");
            if (!Files.exists(p)) {
                Files.createDirectories(p);
                System.out.println("create directory: " + p);
            } else {
                System.out.println("directory exists: " + p);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------");

        System.out.println("------------------------------");

        System.out.println("------------------------------");

        System.out.println("------------------------------");

        System.out.println("------------------------------");

        System.out.println("------------------------------");


    }

}
