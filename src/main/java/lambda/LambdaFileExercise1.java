package lambda;

import java.io.File;
import java.util.stream.Stream;

public class LambdaFileExercise1 {

    public static void main(String[] args) {
        String downloadPathStr = "/Users/maven/Downloads";
        LambdaFileExercise1 exercise1 = new LambdaFileExercise1();
        exercise1.listSubFolders(downloadPathStr);
    }

    /**
     * 遍历子文件夹
     * @param path
     */
    public void listSubFolders(String path) {
        File downloadPath = new File(path);
        Stream.of(downloadPath.listFiles())
                .filter(file -> file.isDirectory())
                .forEach(System.out::println);
    }
}
