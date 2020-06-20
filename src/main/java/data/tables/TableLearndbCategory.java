package data.tables;

import java.util.ArrayList;

public class TableLearndbCategory {
    private static String category = "CREATE TABLE learndb.category (\n" +
            "    category_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    parent_category_id INT,\n" +
            "    name VARCHAR(90) NOT NULL,\n" +
            "    CONSTRAINT category__pk PRIMARY KEY (category_id),\n" +
            "    CONSTRAINT category__parent__fk FOREIGN KEY (parent_category_id) REFERENCES category (category_id),\n" +
            "    CONSTRAINT category__name__uk UNIQUE (parent_category_id, name)\n" +
            ");";
    private static String categoryCREATE_INDEX = "CREATE INDEX category__parent_category_id ON learndb.category (parent_category_id);";


    public static ArrayList<String> fillingTable() {
        ArrayList<String> list = new ArrayList();
        list.add("insert learndb.category (parent_category_id, name) values (null, \"Household products\")");
        list.add("insert learndb.category (parent_category_id, name) values (null, \"Digital technology\")");
        list.add("insert learndb.category (parent_category_id, name) values (1, \"Appliances\")");
        list.add("insert learndb.category (parent_category_id, name) values (2, \"Laptops & Accessories\")");
        list.add("insert learndb.category (parent_category_id, name) values (2, \"Cameras\")");
        list.add("insert learndb.category (parent_category_id, name) values (2, \"Game consoles\")");
        list.add("insert learndb.category (parent_category_id, name) values (2, \"Audio equipment\")");
        list.add("insert learndb.category (parent_category_id, name) values (2, \"Cell Phones\")");
        list.add("insert learndb.category (parent_category_id, name) values (4, \"Laptops\")");
        list.add("insert learndb.category (parent_category_id, name) values (4, \"Rucksacks\")");

        return list;
    }

}
