package data.tables;

import java.util.ArrayList;

public class TableLearndbProduct_price {
    private static String product_price = "CREATE TABLE learndb.product_price (\n" +
            "    product_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    store_id INT NOT NULL,\n" +
            "    price NUMERIC (15, 2) NOT NULL,\n" +
            "    CONSTRAINT product_price__pk PRIMARY KEY (product_id, store_id),\n" +
            "    CONSTRAINT product_price__price__ck CHECK (price > 0)\n" +
            ");";
    private static String product_priceCREATE_INDEX ="CREATE INDEX product_price__store_id ON learndb.product_price (store_id);";

    public static ArrayList<String> fillingTable() {
        ArrayList<String> list = new ArrayList();

        list.add("insert learndb.product_price (product_id, store_id, price) values (1, 300, 10500.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (10, 400, 75600.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (8, 400, 37000.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (4, 400, 20000.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (2, 500, 26100.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (3, 500, 22000.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (4, 500, 22000.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (5, 500, 23500.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (6, 500, 17800.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (8, 600, 38200.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (9, 600, 43800.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (10, 600, 76800.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (2, 600, 27500.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (1, 800, 12000.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (3, 800, 22100.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (4, 800, 21000.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (5, 800, 24600.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (11, 900, 1321800000.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (3, 201, 22900.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (4, 201, 21500.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (5, 201, 23500.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (6, 201, 17800.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (6, 301, 17900.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (1, 301, 12500.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (7, 301, 4900.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (8, 302, 38300.00)");
        list.add("insert learndb.product_price (product_id, store_id, price) values (9, 302, 44500.00)");


        return list;

    }

}
