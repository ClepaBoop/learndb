package data.tables;

import java.util.ArrayList;

public class TableLearndbPurchase {
    private static String purchase = "CREATE TABLE learndb.purchase (\n" +
            "    purchase_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    purchase_date date NOT NULL,\n" +
//            "    purchase_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
            "    store_id INT NOT NULL,\n" +
            "    employee_id INT,\n" +
            "    CONSTRAINT purchase__pk PRIMARY KEY (purchase_id),\n" +
            "    CONSTRAINT purchase__to__employee FOREIGN KEY (employee_id) REFERENCES employee (employee_id),\n" +
            "    CONSTRAINT purchase__to__store FOREIGN KEY (store_id) REFERENCES store (store_id)\n" +
            ");";
    private static String purchaseCREATE_INDEX ="CREATE INDEX purchase__employee_id ON learndb.purchase (employee_id);";

    public static ArrayList<String> fillingTable() {
        ArrayList<String> list = new ArrayList();
//        list.add("insert learndb.purchase (purchase_date, store_id, employee_id) values (\"2019-03-11T10:15:02.206\", 500, 29)");

        list.add("insert learndb.purchase (purchase_date, store_id, employee_id) values (\"2019-03-11T10:15:02.206\", 500, 29)");
        list.add("insert learndb.purchase (purchase_date, store_id, employee_id) values (\"2019-03-10T10:12:34.206\", 900, 34)");
        list.add("insert learndb.purchase (purchase_date, store_id, employee_id) values (\"2019-03-05T09:12:33.206\", 302, null)");
        list.add("insert learndb.purchase (purchase_date, store_id, employee_id) values (\"2019-03-06T13:12:33.206\", 500, 15)");
        list.add("insert learndb.purchase (purchase_date, store_id, employee_id) values (\"2019-03-07T14:22:43.206\", 301, 43)");
        list.add("insert learndb.purchase (purchase_date, store_id, employee_id) values (\"2019-03-09T12:25:43.206\", 600, 32)");
        list.add("insert learndb.purchase (purchase_date, store_id, employee_id) values (\"2019-03-13T15:10:43.206\", 302, null)");
        list.add("insert learndb.purchase (purchase_date, store_id, employee_id) values (\"2019-03-07T12:23:43.206\", 100, 25)");
        list.add("insert learndb.purchase (purchase_date, store_id, employee_id) values (\"2019-03-06T10:55:43.206\", 100, 25)");
        list.add("insert learndb.purchase (purchase_date, store_id, employee_id) values (\"2019-03-01T12:15:43.206\", 600, 19)");
        list.add("insert learndb.purchase (purchase_date, store_id, employee_id) values (\"2019-03-10T16:35:43.206\", 201, 8)");


        return list;
    }

}
