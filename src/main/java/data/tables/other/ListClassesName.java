package data.tables.other;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListClassesName {


    public static ArrayList<String> classesName(String path) throws IOException {
//        "./src/main/java/data/tables"
        ArrayList<String> list = new ArrayList<>();

        Path dir = Paths.get(path);
        DirectoryStream<Path> stream = Files.newDirectoryStream(dir);

            Pattern pattern = Pattern.compile(".java", Pattern.CASE_INSENSITIVE);
            for (Path file : stream) {
                String str = file.getFileName().toString();
                Matcher match = pattern.matcher(str);
                if (match.find()) {
                    list.add(str);
                }
            }
            return list;
    }


}
