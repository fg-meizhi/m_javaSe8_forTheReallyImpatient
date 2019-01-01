package lambda;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaFileExercise2 {

    public static void main(String[] args) {
        List<File> files = new ArrayList<>();
        files.add(new File("/Library/PreferencePanes/Contents/Resources/zh_CN.lproj"));
        files.add(new File("/Library/Logs/Microsoft/InstallLogs"));
        files.add(new File("/Library/Application Support/Adobe/Adobe PDF/Settings"));
        files.add(new File("/Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home/bin"));

        sortFiles(files.toArray(new File[]{}));
    }

    /**
     * 1. 按路径目录排序
     * 2. 每组目录中的元素再按路径名排序
     *
     * @param files
     */
    public static void sortFiles(File[] files) {
        Stream<File> stream = Stream.of(files);
        stream.forEach(file -> {
            System.out.println(file.getAbsolutePath());
        });
    }

}
