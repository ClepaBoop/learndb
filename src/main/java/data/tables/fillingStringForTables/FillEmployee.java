package data.tables.fillingStringForTables;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FillEmployee {

    public static void main(String[] args) {


        for (String s : FillEmployee.Fill()) {
            System.out.println(s);
        }

    }

    public static ArrayList<String> Fill() {

        String str = "10\t10\t100\tCHIEF\tАлексей\tИванов\tПетрович\t\n" +
                "20\t20\t200\tCHIEF\tКенни\tМаккормик\t\t\n" +
                "30\t30\t400\tCHIEF\tАнна\tМатвеева\tИгоревна\t\n" +
                "40\t40\t500\tCHIEF\tРоман\tШмидт\tСергеевич\t\n" +
                "50\t50\t600\tCHIEF\tВиктор\tСухоруков\tВитальевич\t\n" +
                "60\t60\t800\tCHIEF\tСветлана\tНемцова\tЛеонидовна\t\n" +
                "70\t70\t900\tCHIEF\tОльга\tВершинина\tОлеговна\t\n" +
                "80\t80\t201\tCEO\tПетр\tКорсаков\tКонстантинович\t\n" +
                "90\t90\t301\tDIRECTOR\tСергей\tАнтонов\tКириллович\t\n" +
                "10\t10\t302\tGENERAL_MANAGER\tВлад\tКонтур\tСеменович\t\n" +
                "11\t11\t100\tMANAGER\tГлеб\tТарасов\tАвдеевич\t\n" +
                "12\t12\t200\tMANAGER\tВладислав\tКалашников\tЯковович\t\n" +
                "13\t13\t300\tMANAGER\tВладислав\tБирюков\tЯковович\t\n" +
                "14\t14\t400\tMANAGER\tВалерий\tМедведев\tАнтонинович\t3\n" +
                "15\t15\t500\tMANAGER\tЭрик\tКартман\t\t4\n" +
                "16\t16\t600\tMANAGER\tНиколай\tВоробьёв\tАртёмович\t5\n" +
                "17\t17\t600\tMANAGER\tМирон\tКалинин\tИванович\t5\n" +
                "18\t18\t600\tMANAGER\tВилен\tКулаков\tФедотович\t5\n" +
                "19\t19\t800\tMANAGER\tЗиновий\tБелозёров\tСемёнович\t6\n" +
                "20\t20\t900\tMANAGER\tПавел\tАвдеев\tЯковович\t7\n" +
                "21\t21\t201\tMANAGER\tНикки\tЗайцева\tАристарховна\t8\n" +
                "22\t22\t301\tMANAGER\tКристина\tЕмельянова\tАлексеевна\t9\n" +
                "23\t23\t201\tMANAGER\tДоминика\tТимофеева\tФедотовна\t\n" +
                "24\t24\t302\tMANAGER\tМарина\tКондратьева\tИвановна\t10\n" +
                "25\t25\t100\tSELLER\tЛюбовь\tБлинова\tЛьвовна\t11\n" +
                "26\t26\t200\tSELLER\tНаталия\tПотапова\tЕвсеевна\t12\n" +
                "27\t27\t200\tSELLER\tЛилия\tРябова\tЛеонидовна\t\n" +
                "28\t28\t300\tSELLER\tЭльза\tОдинцова\tАлексеевна\t13\n" +
                "29\t29\t500\tSELLER\tЗарина\tМиронова\tАртемовна\t15\n" +
                "30\t30\t600\tSELLER\tНина\tДьячкова\tЛукьяновна\t16\n" +
                "31\t31\t600\tSELLER\tГлеб\tПетров\tАвдеевич\t16\n" +
                "32\t32\t600\tSELLER\tМирон\tАгафьев\tИванович\t18\n" +
                "33\t33\t900\tSELLER\tЛилия\tЛеонтьева\tЛеонидовна\t20\n" +
                "34\t34\t900\tSELLER\tЮлиан\tГромов\tФедорович\t20\n" +
                "35\t35\t900\tSELLER\tТерентий\tБуров\tФедорович\t20\n" +
                "36\t40\t201\tSELLER\tНина\tКондратьева\tЛеонидовна\t21\n" +
                "37\t41\t201\tSELLER\tЛюбомир\tЕфремов\tСвятославович\t21\n" +
                "38\t42\t201\tSELLER\tЛука\tДементьев\tОлегович\t21\n" +
                "39\t43\t301\tSELLER\tВлас\tСуханов\tОлегович\t22\n" +
                "40\t44\t201\tSELLER\tЭдуард\tРогов\tМаксович\t23\n" +
                "41\t45\t201\tSELLER\tТерентий\tМоисеев\tОлегович\t23\n" +
                "42\t46\t201\tSELLER\tАрнольд\tНикифоров\tОлегович\t23\n" +
                "43\t47\t302\tSELLER\tМартин\tСубботин\tСтаниславович\t24\n" +
                "44\t48\t302\tSELLER\tПитер\tПаркер\t\t24\n" +
                "45\t49\t302\tSELLER\tВиктор\tМедведев\tАнатольевич\t24\n" +
                "46\t50\t302\tSELLER\tЛев\tОдинцова\tСергеевич\t24";


        ArrayList<String> fillBD = new ArrayList<String>();
        String[] rows = str.split("\n");

        for (String row : rows) {
            String subSbtring = row.substring(6).replace("\\;", "");

            String convertedString = Convert.convertCyrilic(subSbtring);

            String[] split = convertedString.split("\t");
            String print = "";

            Pattern pat = Pattern.compile("\\d+");

            for (String word : split) {
                Matcher match = pat.matcher(word);
                if (match.find()) {
                    print = print + word + ", ";
                } else {
                    print = print + "\\\"" + word + "\\\"" + ", ";
                }

            }


//            System.out.println(print.substring(0, print.length() - 2));


            String insertTableStr = "list.add(\"insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (" +
                    print.substring(0, print.length() - 2) + ")\");";

            fillBD.add(insertTableStr);

        }

        return fillBD;
    }


}





