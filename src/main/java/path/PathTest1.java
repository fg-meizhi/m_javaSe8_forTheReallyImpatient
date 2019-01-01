package path;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class PathTest1 {

    public static void main(String[] args) {
        Path absolute = Paths.get("/Users/maven/Downloads");
        Path relative = Paths.get(absolute.toString(), "知识管理：为业务绩效赋能_3835726.epub");
        System.out.println(relative);

        System.out.println("------------------------------");

        Path p2 = absolute.resolve("2");
        System.out.println(p2);

        System.out.println("------------------------------");

        Path mdFile = Paths.get("/Users/maven/Downloads", "业务语言UL英文对照.md");
        byte[] bytes = readFile(mdFile);
        String content = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("读取文件：" + mdFile);
        System.out.println(content);

        System.out.println("------------------------------");

        List<String> lines = null;
        try {
            lines = Files.readAllLines(mdFile);
            int i = 1;
            for (String line : lines) {
                System.out.println(i + "-" + line);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------");

        Path writeMdFile = absolute.resolve("PathWriteFile.md");
        try {
            Files.write(writeMdFile, content.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("------------------------------");

        try {
            Files.write(writeMdFile, lines, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static byte[] readFile(String filePath) {
        return readFile(Paths.get(filePath));
    }

    public static byte[] readFile(Path path) {
        try {
            byte[] bytes = Files.readAllBytes(path);
            return bytes;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
