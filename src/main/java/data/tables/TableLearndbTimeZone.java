package data.tables;

import java.util.ArrayList;

public class TableLearndbTimeZone {
    public static String timezone = "CREATE TABLE learndb.timezone (\n" +
            "    timezone_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    time_offset VARCHAR(45) NOT NULL,\n" +
            "    CONSTRAINT timezone__pk PRIMARY KEY (timezone_id),\n" +
            "    CONSTRAINT timezone__offset__uk UNIQUE (time_offset)\n" +
            ");";

    public static ArrayList<String> fillingTable() {
        ArrayList<String> list = new ArrayList();
        list.add("insert learndb.timezone (time_offset) values (\"UTS+2\")");
        list.add("insert learndb.timezone (time_offset) values (\"UTS+3\")");
        list.add("insert learndb.timezone (time_offset) values (\"UTS+4\")");
        list.add("insert learndb.timezone (time_offset) values (\"UTS+5\")");
        list.add("insert learndb.timezone (time_offset) values (\"UTS+6\")");
        list.add("insert learndb.timezone (time_offset) values (\"UTS+7\")");
        list.add("insert learndb.timezone (time_offset) values (\"UTS+8\")");
        list.add("insert learndb.timezone (time_offset) values (\"UTS+10\")");
        list.add("insert learndb.timezone (time_offset) values (\"UTS+1\")");
        list.add("insert learndb.timezone (time_offset) values (\"UTS+9\")");
        return list;
    }

}
