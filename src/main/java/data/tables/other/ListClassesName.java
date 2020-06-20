package data.tables.other;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListClassesName {

    public static void main(String[] args) throws IOException {
        ListClassesName name = new ListClassesName("./src/main/java/data/tables");
        name.classesName().forEach(s -> System.out.println(s));

    }

    private String path;
    public ListClassesName(String path) {
        this.path = path;
    }

    public ArrayList<String> classesName() throws IOException {
//        "./src/main/java/data/tables"
        ArrayList<String> list = new ArrayList<>();

        Path dir = Paths.get(path);
        DirectoryStream<Path> stream = Files.newDirectoryStream(dir);

            Pattern pattern = Pattern.compile(".java$", Pattern.CASE_INSENSITIVE);
            for (Path file : stream) {
                String str = file.toString();
                Matcher match = pattern.matcher(str);
                if (match.find()) {
                    list.add(str);
                }
            }
            return list;
    }


}
