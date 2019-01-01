package stream;

import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Stream1 {

    public static void main(String[] args) throws IOException {

        String contents = new String(Files.readAllBytes(Paths.get(URLDecoder
                .decode(Stream1.class.getClassLoader().getResource("1.txt").getPath())))
                , StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

//        int count = 0;
//        for (String word : words) {
//            if (word.length() > 12) {
//                count++;
//            }
//        }
//        System.out.println(count);

        long count = words.stream().filter(word -> word.length() > 12).count();
        System.out.println(count);

        // 并行执行
        count = words.parallelStream().filter(word -> word.length() > 12).count();
        System.out.println(count);
    }

}
