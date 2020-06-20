package data.tables;

import java.util.ArrayList;

public class TableLearndbRank {

    private static String rank = "CREATE TABLE learndb.rank (\n" +
            "    store_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    rank_id VARCHAR(45) NOT NULL,\n" +
            "    name VARCHAR(45) NOT NULL,\n" +
            "    CONSTRAINT rank__pk PRIMARY KEY (store_id, rank_id),\n" +
            "    CONSTRAINT rank__to__store FOREIGN KEY (store_id) REFERENCES store (store_id)\n" +
            ");";

    public static ArrayList<String> fillingTable() {
        ArrayList<String> list = new ArrayList();
//        list.add("insert learndb.rank (store_id, rank_id, name) values (100, \"CHIEF\", \"Director\")");


        list.add("insert learndb.rank (store_id, rank_id, name) values (100, \"CHIEF\", \"Direktor\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (100, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (100, \"SELLER\", \"Prodavec\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (200, \"CHIEF\", \"Direktor\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (200, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (200, \"SELLER\", \"Prodavec\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (300, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (300, \"SELLER\", \"Prodavec\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (400, \"CHIEF\", \"Direktor\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (400, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (500, \"CHIEF\", \"Direktor\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (500, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (500, \"SELLER\", \"Prodavec\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (600, \"CHIEF\", \"Direktor\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (600, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (600, \"SELLER\", \"Prodavec\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (800, \"CHIEF\", \"Direktor\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (800, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (900, \"CHIEF\", \"Direktor\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (900, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (900, \"SELLER\", \"Prodavec\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (201, \"CEO\", \"Direktor\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (201, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (201, \"SELLER\", \"Prodavec\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (301, \"DIRECTOR\", \"Direktor\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (301, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (301, \"SELLER\", \"Prodavec\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (302, \"GENERALMANAGER\", \"Direktor\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (302, \"MANAGER\", \"Menedzher\")");
        list.add("insert learndb.rank (store_id, rank_id, name) values (302, \"SELLER\", \"Prodavec\")");


        return list;

    }


}
