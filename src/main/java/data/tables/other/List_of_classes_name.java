package data.tables.other;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_of_classes_name {

    public static void main(String[] args) throws IOException {
        List<String> resourceFiles = getResourceFiles("C:\\Users\\george\\Desktop\\HUY");
        System.out.println(Arrays.toString(resourceFiles.toArray()));

//        File dir = new File("C:\\Users\\george\\Desktop\\HUY"); //path указывает на директорию
//        File[] arrFiles = dir.listFiles();
//        List<File> lst = Arrays.asList(arrFiles);
//        System.out.println(Arrays.toString(lst.toArray()));
//        for (File s : lst) {
//            System.out.println(s.getName());
//        }
//        lst.forEach(huy -> System.out.println(huy));
//
//        Path dir = Paths.get("C:\\Users\\george\\Desktop\\HUY");
//        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
//
//            for (Path file: stream) {
//                System.out.println(file.getFileName());
//            }
//        } catch (IOException | DirectoryIteratorException x) {
//            // IOException не может броситься во время итерации.
//            // В этом куске кода оно может броситься только
//            // методом newDirectoryStream.
//            System.err.println(x);
//        }


    }

    private static List<String> getResourceFiles(String path) throws IOException {

        ArrayList<String> filenames = new ArrayList<>();

        try (InputStream in = (InputStream) getResourceFiles(path);
             BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String resource;

            while ((resource = br.readLine()) != null) {
                filenames.add(resource);
            }
        }

        return filenames;
    }

}
