package data.tables;

import java.util.ArrayList;

public class TableLearndbCity {
    public static String city = "CREATE TABLE learndb.city (\n" +
            "    city_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    name VARCHAR(45) NOT NULL,\n" +
            "    timezone_id INT NOT NULL,\n" +
            "    CONSTRAINT city__pk PRIMARY KEY (city_id),\n" +
            "    CONSTRAINT city__to__timezone FOREIGN KEY (timezone_id) REFERENCES timezone (timezone_id)\n" +
            ");";

    public static ArrayList<String> fillingTable() {
        ArrayList<String> list = new ArrayList();
        list.add("insert learndb.city (name, timezone_id) values (\"Moscow\", 2)");
        list.add("insert learndb.city (name, timezone_id) values (\"St. Petersburg\t\", 2)");
        list.add("insert learndb.city (name, timezone_id) values (\"Novosibirsk\", 5)");
        list.add("insert learndb.city (name, timezone_id) values (\"Vladivostok\", 8)");
        list.add("insert learndb.city (name, timezone_id) values (\"Ufa\", 4)");
        list.add("insert learndb.city (name, timezone_id) values (\"Kaliningrad\", 1)");
        list.add("insert learndb.city (name, timezone_id) values (\"Kemerovo\", 6)");
        list.add("insert learndb.city (name, timezone_id) values (\"Samara\", 3)");
        list.add("insert learndb.city (name, timezone_id) values (\"Barnaul\", 5)");
        list.add("insert learndb.city (name, timezone_id) values (\"Irkutsk\", 7)");

        return list;
    }
}
