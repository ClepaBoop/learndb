package data.tables.fillingStringForTables;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FillRank {

    public static void main(String[] args) {
        for (String s : FillRank.Fill()) {
            System.out.println(s);
        }

    }


    public static ArrayList<String> Fill() {

        String str = "1\t100\tCHIEF\tДиректор\n" +
                "2\t100\tMANAGER\tМенеджер\n" +
                "3\t100\tSELLER\tПродавец\n" +
                "4\t200\tCHIEF\tДиректор\n" +
                "5\t200\tMANAGER\tМенеджер\n" +
                "6\t200\tSELLER\tПродавец\n" +
                "7\t300\tMANAGER\tМенеджер\n" +
                "8\t300\tSELLER\tПродавец\n" +
                "9\t400\tCHIEF\tДиректор\n" +
                "10\t400\tMANAGER\tМенеджер\n" +
                "11\t500\tCHIEF\tДиректор\n" +
                "12\t500\tMANAGER\tМенеджер\n" +
                "13\t500\tSELLER\tПродавец\n" +
                "14\t600\tCHIEF\tДиректор\n" +
                "15\t600\tMANAGER\tМенеджер\n" +
                "16\t600\tSELLER\tПродавец\n" +
                "17\t800\tCHIEF\tДиректор\n" +
                "18\t800\tMANAGER\tМенеджер\n" +
                "19\t900\tCHIEF\tДиректор\n" +
                "20\t900\tMANAGER\tМенеджер\n" +
                "21\t900\tSELLER\tПродавец\n" +
                "22\t201\tCEO\tДиректор\n" +
                "23\t201\tMANAGER\tМенеджер\n" +
                "24\t201\tSELLER\tПродавец\n" +
                "25\t301\tDIRECTOR\tДиректор\n" +
                "26\t301\tMANAGER\tМенеджер\n" +
                "27\t301\tSELLER\tПродавец\n" +
                "28\t302\tGENERAL_MANAGER\tДиректор\n" +
                "29\t302\tMANAGER\tМенеджер\n" +
                "30\t302\tSELLER\tПродавец\n";

        ArrayList<String> fillBD = new ArrayList<String>();
        String[] rows = str.split("\n");

        for (String row : rows) {

            String print = "";
            String convertedString = Convert.convertCyrilic(row);
            String[] words = convertedString.split("\t");
            Pattern pat = Pattern.compile("\\d+");

            for (int i = 1; i < words.length; i++) {
                Matcher match = pat.matcher(words[i]);
                if (match.find()) {
                    print = print + words[i] + ", ";
                } else {
                    print = print + "\\\"" + words[i] + "\\\"" + ", ";
                }
            }
//            System.out.println(print);


            String insertTableStr = "list.add(\"insert learndb.rank (store_id, rank_id, name) values (" +
                    print.substring(0, print.length() - 2) + ")\");";

            fillBD.add(insertTableStr);

        }
        System.out.println(fillBD.size());

        return fillBD;
    }


}
