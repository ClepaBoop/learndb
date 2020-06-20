import data.CreateTable;
import data.tables.*;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

        DBWorker db = new DBWorker();

        String query = "select * from learndb.huy";

        Statement statement = db.getConnection().createStatement();



        CreateTable createTable = new CreateTable();


//        ****** create table
//        for (String s : createTable.createTables()) {
//            System.out.println(s);
//            statement.execute(s);
//        }


        for (String s : TableLearndbPurchase_item.fillingTable()) {
            System.out.println(s);
            statement.execute(s);
        }

//        System.out.println(Arrays.toString(createTable.createTables().toArray()));
//        fields.forEach(n -> System.out.println(n));
//        System.out.println(fields.get(0));

        statement.close();
        db.getConnection().close();

    }




}
