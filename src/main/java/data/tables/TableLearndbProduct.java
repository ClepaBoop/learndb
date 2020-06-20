package data.tables;

import java.util.ArrayList;

public class TableLearndbProduct {
    private static String product = "CREATE TABLE learndb.product (\n" +
            "    product_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    category_id INT NOT NULL,\n" +
            "    name VARCHAR(45) NOT NULL,\n" +
            "    description VARCHAR(45),\n" +
            "    CONSTRAINT product__pk PRIMARY KEY (product_id),\n" +
            "    CONSTRAINT product__to__category FOREIGN KEY (category_id) REFERENCES category (category_id),\n" +
            "    CONSTRAINT product__name__uk UNIQUE (category_id, name)\n" +
            ");";
    private static String productCREATE_INDEX = "CREATE INDEX product__name ON learndb.product (name);";

    public static ArrayList<String> fillingTable() {
        ArrayList<String> list = new ArrayList();
        list.add("insert learndb.product (category_id, name, description) values (3, \"\tA vacuum cleaner S6\", \"1400 wt\")");
        list.add("insert learndb.product (category_id, name, description) values (3, \"Refrigerator A2\t\", \"No frost\")");
        list.add("insert learndb.product (category_id, name, description) values (6, \"Nintendo\t\", \"500 GB\")");
        list.add("insert learndb.product (category_id, name, description) values (6, \"PlayStation\", \"\t800 GB\")");
        list.add("insert learndb.product (category_id, name, description) values (6, \"Xbox\", \"\")");
        list.add("insert learndb.product (category_id, name, description) values (7, \"Headphones S3\", \"\tWireless\")");
        list.add("insert learndb.product (category_id, name, description) values (10, \"\tDeepbox\", \"Nylon\")");
        list.add("insert learndb.product (category_id, name, description) values (8, \"Slider B3\", \"\t1 sim\")");
        list.add("insert learndb.product (category_id, name, description) values (8, \"Monoblock C4\", \"\t2 sim\")");
        list.add("insert learndb.product (category_id, name, description) values (9, \"Ultrabook X5\", \"15 inches\")");
        list.add("insert learndb.product (category_id, name, description) values (5, \"\tLord Nikon 95\", \"\t100 megapixe\")");
        list.add("insert learndb.product (category_id, name, description) values (5, \"\tNikon D750\", \"\t24.93Mpix\")");

        return list;

    }
}
