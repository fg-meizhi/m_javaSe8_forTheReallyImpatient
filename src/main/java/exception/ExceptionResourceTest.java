package exception;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ExceptionResourceTest {

    public static void main(String[] args) throws IOException {
        String filePath = "/Users/maven/800 - Code/YT-Code/YT-Analysis/src/main/java/pub/yuntu/analysis/rules/engine/PolyEngine.java";
        try(Scanner in = new Scanner(Paths.get(filePath))) {
            while(in.hasNext()) {
                System.out.println(in.next());
            }
        }
    }

}
