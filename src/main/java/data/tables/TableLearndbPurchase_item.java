package data.tables;

import java.util.ArrayList;

public class TableLearndbPurchase_item {
    private static String purchase_item = "CREATE TABLE learndb.purchase_item (\n" +
            "    purchase_item_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    purchase_id INT NOT NULL,\n" +
            "    product_id INT NOT NULL,\n" +
            "    price NUMERIC (15, 2) NOT NULL,\n" +
            "    count INT NOT NULL,\n" +
            "    CONSTRAINT purchase_item__pk PRIMARY KEY (purchase_item_id),\n" +
            "    CONSTRAINT purchase_item__product__uk UNIQUE (purchase_id, product_id),\n" +
            "    CONSTRAINT purchase_item__to__purchase FOREIGN KEY (purchase_id) REFERENCES purchase (purchase_id),\n" +
            "    CONSTRAINT purchase_item__to__product FOREIGN KEY (product_id) REFERENCES product (product_id),\n" +
            "    CONSTRAINT purchase_item__price__ck CHECK (price > 0),\n" +
            "    CONSTRAINT purchase_item__count__ck CHECK (count > 0)\n" +
            ");";
    private static String purchase_itemCREATE_INDEX ="CREATE INDEX purchase_item__product_id ON learndb.purchase_item (product_id);";

    public static ArrayList<String> fillingTable() {
        ArrayList<String> list = new ArrayList();

//        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (1, 6, 17800.00, 1)");

        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (1, 6, 17800.00, 1)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (1, 2, 26100.00, 30)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (2, 11, 1321800000.00, 1)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (3, 8, 38300.00, 1)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (3, 9, 44500.00, 1)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (4, 5, 23500.00, 2)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (5, 7, 4900.00, 1)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (6, 10, 76800.00, 1)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (6, 9, 43800.00, 1)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (6, 8, 38200.00, 1)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (7, 8, 38300.00, 3)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (8, 3, 26100.00, 1)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (9, 3, 26100.00, 1)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (10, 2, 27500.00, 5)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (10, 10, 76800.00, 1)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (10, 8, 38200.00, 1)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (11, 4, 21500.00, 1)");
        list.add("insert learndb.purchase_item (purchase_id, product_id, price, count) values (11, 12, 100000.00, 1)");


        return list;
    }

}
