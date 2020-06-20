package data.tables.fillingStringForTables;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FillPurchase_item {

    public static void main(String[] args) {
        for (String s : FillPurchase_item.Fill()) {
            System.out.println(s);
        }

    }


    public static ArrayList<String> Fill() {

        String str = "1\t1\t1\t6\t17800.00\t1\n" +
                "2\t2\t1\t2\t26100.00\t30\n" +
                "3\t3\t2\t11\t1321800000.00\t1\n" +
                "4\t4\t3\t8\t38300.00\t1\n" +
                "5\t5\t3\t9\t44500.00\t1\n" +
                "6\t6\t4\t5\t23500.00\t2\n" +
                "7\t7\t5\t7\t4900.00\t1\n" +
                "8\t8\t6\t10\t76800.00\t1\n" +
                "9\t9\t6\t9\t43800.00\t1\n" +
                "10\t10\t6\t8\t38200.00\t1\n" +
                "11\t11\t7\t8\t38300.00\t3\n" +
                "12\t12\t8\t3\t26100.00\t1\n" +
                "13\t13\t9\t3\t26100.00\t1\n" +
                "14\t14\t10\t2\t27500.00\t5\n" +
                "15\t15\t10\t10\t76800.00\t1\n" +
                "16\t16\t10\t8\t38200.00\t1\n" +
                "17\t17\t11\t4\t21500.00\t1\n" +
                "18\t18\t11\t12\t100000.00\t1\n";

        ArrayList<String> fillBD = new ArrayList<String>();
        String[] rows = str.split("\n");

        for (String row : rows) {

            String print = "";
            String convertedString = Convert.convertCyrilic(row);
            String[] words = convertedString.split("\t");
            Pattern pat = Pattern.compile("\\d+");

            for (int i = 2; i < words.length; i++) {
                Matcher match = pat.matcher(words[i]);
                if (match.find()) {
                    print = print + words[i] + ", ";
                } else {
                    print = print + "\\\"" + words[i] + "\\\"" + ", ";
                }
            }
//            System.out.println(print);


            String insertTableStr = "list.add(\"insert learndb.purchase_item (purchase_id, product_id, price, count) values (" +
                    print.substring(0, print.length() - 2) + ")\");";

            fillBD.add(insertTableStr);

        }
        System.out.println(fillBD.size());

        return fillBD;
    }


}
