package stream;

import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 创建Stream的操作
 */
public class CreateStream {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(URLDecoder
                .decode(Stream1.class.getClassLoader().getResource("1.txt").getPath())))
                , StandardCharsets.UTF_8);

//        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));
        Stream<String> words = Stream.of(contents.split("[\\P{L}]+"));
        System.out.println(Arrays.toString(words.toArray()));

        // part of array
        Stream<String> a = Stream.of("a", "b", "c");
        System.out.println(Arrays.toString(a.toArray()));

        Stream<String> echos = Stream.generate(() -> "echo").limit(5);
        System.out.println(Arrays.toString(echos.toArray()));
    }
}
