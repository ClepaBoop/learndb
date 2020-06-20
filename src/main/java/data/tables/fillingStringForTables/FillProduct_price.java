package data.tables.fillingStringForTables;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FillProduct_price {

    public static void main(String[] args) {
        for (String s : FillProduct_price.Fill()) {
            System.out.println(s);
        }

    }


    public static ArrayList<String> Fill() {

        String str = "1\t1\t300\t10500.00\n" +
                "2\t10\t400\t75600.00\n" +
                "3\t8\t400\t37000.00\n" +
                "4\t4\t400\t20000.00\n" +
                "5\t2\t500\t26100.00\n" +
                "6\t3\t500\t22000.00\n" +
                "7\t4\t500\t22000.00\n" +
                "8\t5\t500\t23500.00\n" +
                "9\t6\t500\t17800.00\n" +
                "10\t8\t600\t38200.00\n" +
                "11\t9\t600\t43800.00\n" +
                "12\t10\t600\t76800.00\n" +
                "13\t2\t600\t27500.00\n" +
                "14\t1\t800\t12000.00\n" +
                "15\t3\t800\t22100.00\n" +
                "16\t4\t800\t21000.00\n" +
                "17\t5\t800\t24600.00\n" +
                "18\t11\t900\t1321800000.00\n" +
                "19\t3\t201\t22900.00\n" +
                "20\t4\t201\t21500.00\n" +
                "21\t5\t201\t23500.00\n" +
                "22\t6\t201\t17800.00\n" +
                "23\t6\t301\t17900.00\n" +
                "24\t1\t301\t12500.00\n" +
                "25\t7\t301\t4900.00\n" +
                "26\t8\t302\t38300.00\n" +
                "27\t9\t302\t44500.00";

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
//                    print = print + "\\\"" + words + "\\\"" + ", ";
                }
            }
//            System.out.println(print);


            String insertTableStr = "list.add(\"insert learndb.product_price (product_id, store_id, price) values (" +
                    print.substring(0, print.length() - 2) + ")\");";

            fillBD.add(insertTableStr);

        }

        return fillBD;
    }


}
