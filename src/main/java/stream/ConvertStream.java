package stream;

import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ConvertStream {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(URLDecoder
                .decode(Stream1.class.getClassLoader().getResource("1.txt").getPath())))
                , StandardCharsets.UTF_8);

        Stream<String> b = Stream.of(contents.split("[\\P{L}]+")).map(String::toUpperCase);
        System.out.println(Arrays.toString(b.toArray()));

        Stream<Character> c = Stream.of(contents.split("[\\P{L}]+")).map(s -> s.charAt(0));
        System.out.println(Arrays.toString(c.toArray()));

        Stream<Double> d = Stream.generate(Math::random).limit(100);
        System.out.println(Arrays.toString(d.toArray()));

        System.out.println("--------------");
        Stream<Double> e = Stream.generate(Math::random).limit(100);
//        e.iterate().peek(i -> System.out.println(" " + i));

        Stream<String> f = Stream.of("a", "a", "a", "b", "b", "c").distinct();
        System.out.println(Arrays.toString(f.toArray()));

        Stream<String> g =  Stream.of(contents.split("[\\P{L}]+")).sorted(Comparator.comparing(String::length).reversed());
        System.out.println(Arrays.toString(g.toArray()));

    }
}
