package data.tables.fillingStringForTables;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fillpurchase {

    public static void main(String[] args) {
        for (String s : Fillpurchase.Fill()) {
            System.out.println(s);
        }

    }


    public static ArrayList<String> Fill() {

        String str = "1\t1\t2019-03-11T10:15:02.206Z\t500\t29\n" +
                "2\t2\t2019-03-10T10:12:34.206Z\t900\t34\n" +
                "3\t3\t2019-03-05T09:12:33.206Z\t302\t\n" +
                "4\t4\t2019-03-06T13:12:33.206Z\t500\t15\n" +
                "5\t5\t2019-03-07T14:22:43.206Z\t301\t43\n" +
                "6\t6\t2019-03-09T12:25:43.206Z\t600\t32\n" +
                "7\t7\t2019-03-13T15:10:43.206Z\t302\t\n" +
                "8\t8\t2019-03-07T12:23:43.206Z\t100\t25\n" +
                "9\t9\t2019-03-06T10:55:43.206Z\t100\t25\n" +
                "10\t10\t2019-03-01T12:15:43.206Z\t600\t19\n" +
                "11\t11\t2019-03-10T16:35:43.206Z\t201\t8";

        ArrayList<String> fillBD = new ArrayList<String>();
        String[] rows = str.split("\n");

        for (String row : rows) {

            String print = "";
            String convertedString = Convert.convertCyrilic(row);
            String[] words = convertedString.split("\t");
            Pattern pat = Pattern.compile("\\d+");

            print = print + "\\\"" + words[2] + "\\\"" + ", ";
            for (int i = 3; i < words.length; i++) {
                Matcher match = pat.matcher(words[i]);
                if (match.find()) {
                    print = print + words[i] + ", ";
                } else {
                    print = print + "\\\"" + words[i] + "\\\"" + ", ";
                }
            }
//            System.out.println(print);


            String insertTableStr = "list.add(\"insert learndb.purchase (purchase_date, store_id, employee_id) values (" +
                    print.substring(0, print.length() - 2) + ")\");";

            fillBD.add(insertTableStr);

        }
        System.out.println(fillBD.size());

        return fillBD;
    }


}
