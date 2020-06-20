package data.tables;

import java.util.ArrayList;

public class TableLearndbStore {
    private static String store = "CREATE TABLE learndb.store (\n" +
            "    store_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    name VARCHAR(45) NOT NULL,\n" +
            "    site_url VARCHAR(45),\n" +
            "    CONSTRAINT store__pk PRIMARY KEY (store_id),\n" +
            "    CONSTRAINT store__name__uk UNIQUE (name)\n" +
            ");";

    public static ArrayList<String> fillingTable() {
        ArrayList<String> list = new ArrayList();
        list.add("insert learndb.store (store_id, name, site_url) values (100, \"Pioner\", \"pioner.ru\" )");
        list.add("insert learndb.store (store_id, name, site_url) values (200, \"Mars\", \"mars.ru\" )");
        list.add("insert learndb.store (store_id, name, site_url) values (300, \"Adalin\", \"adalin.ru\" )");
        list.add("insert learndb.store (store_id, name, site_url) values (400, \"Europe\", \"evropa.ru\" )");
        list.add("insert learndb.store (store_id, name, site_url) values (500, \"March\", \"mart.ru\" )");
        list.add("insert learndb.store (store_id, name, site_url) values (600, \"Umi\", \"\" )");
        list.add("insert learndb.store (store_id, name, site_url) values (800, \"Uneversam\", \"\" )");
        list.add("insert learndb.store (store_id, name, site_url) values (900, \"Big\", \"big.ru\" )");
        list.add("insert learndb.store (store_id, name, site_url) values (201, \"Saturn\", \"saturn\" )");
        list.add("insert learndb.store (store_id, name, site_url) values (301, \"Adalin-family\", \"adalin-ultra.ru\" )");
        list.add("insert learndb.store  (store_id, name, site_url) values (302, \"Adalin-ultra.ru\", \"\" )");


        return list;
    }

}
