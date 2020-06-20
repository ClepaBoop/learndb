package data.tables;

import java.util.ArrayList;

public class TableLearndbStore_address {
    private static String store_address = "CREATE TABLE learndb.store_address (\n" +
            "    store_address_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    store_id INT NOT NULL,\n" +
            "    city_id INT NOT NULL,\n" +
            "    address VARCHAR(90) NOT NULL,\n" +
            "    opening_hours VARCHAR(90),\n" +
            "    phone VARCHAR(90),\n" +
            "    CONSTRAINT store_address__pk PRIMARY KEY (store_address_id),\n" +
            "    CONSTRAINT store_address__address__UK UNIQUE (store_id, city_id, address),\n" +
            "    CONSTRAINT store_address__to__store FOREIGN KEY (store_id) REFERENCES store (store_id),\n" +
            "    CONSTRAINT store_address__to__city FOREIGN KEY (city_id) REFERENCES city (city_id)\n" +
            ");";

    private static String store_addressCREATE_INDEX = "CREATE INDEX store_address__city_id ON learndb.store_address (city_id);";

    public static ArrayList<String> fillingTable() {
        ArrayList<String> list = new ArrayList();
        list.add("insert learndb.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (10, 100, 1, \"st. Arbat, 20\", \"Mon-Fri.: From 09: 00-17: 00\", \"7(495)312-03-08\" )");
        list.add("insert learndb.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (11, 100, 1, \"st. Builders, 124\", \"Mon-Fri.: From 09: 00-17: 00\", \"7(495)312-03-08\" )");
        list.add("insert learndb.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (12, 100, 5, \"Lenin Ave., 42\", \"Mon-Fri.: From 08: 00-18: 00\", \"7(495)312-03-08\" )");
        list.add("insert learndb.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (20, 200, 2, \"st. Kazan, 43\", \"Mon-Fri.: From 08: 00-16: 00\", \"7(812)700-03-03\" )");
        list.add("insert learndb.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (30, 300, 3, \"st. Lenin, 18\", \"Mon-Fri.: From 07: 00-19: 00\", \"7(383)568-03-03\" )");
        list.add("insert learndb.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (40, 400, 4, \"st. Mira, 12\", \"\", \"\t7(423)568-53-88\" )");
        list.add("insert learndb.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (50, 500, 5, \"st. Liberty 50\", \"Mon-Fri.: From 09: 00-17: 00\", \"7(347)668-56-66\" )");
        list.add("insert learndb.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (60, 600, 6, \"st. Suvorova, 11\", \"Mon-Fri.: From 10: 00-22: 00\", \"\" )");
        list.add("insert learndb.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (61, 600, 6, \"st. Chkalova, 42\", \"Mon-Fri.: From 08: 00-20: 00\", \"\" )");
        list.add("insert learndb.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (80, 800, 8, \"st. Michurina, 60\", \"Mon-Fri.: From 09: 00-17: 00\", \"7(846)000-54-44\" )");
        list.add("insert learndb.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (90, 900, 9, \"st. Lazurnaya, 79\", \"Mon-Fri.: From 09: 00-17: 00\", \"7(385)777-77-07\" )");
        list.add("insert learndb.store_address (store_address_id, store_id, city_id, address, opening_hours, phone) values (21, 201, 2, \"st. Sedova, 33\", \"Mon-Fri.: From 09: 00-17: 00\", \"\" )");




        return list;
    }

}
