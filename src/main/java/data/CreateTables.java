package data;

import data.tables.other.ListClassesName;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;


public class CreateTables {

    public static void commands() throws IOException {

        ListClassesName name = new ListClassesName("./src/main/java/data/tables");

        Map <String, String> listCommands = new LinkedHashMap<>();

        listCommands.put("timezone", "");
        listCommands.put("city", "");
        listCommands.put("store", "");
        listCommands.put("store_address", "");
        listCommands.put("category", "");
        listCommands.put("product", "");
        listCommands.put("product_price", "");
        listCommands.put("rank", "");
        listCommands.put("employee", "");
        listCommands.put("purchase", "");
        listCommands.put("purchase_item", "");

    }

    public String command (String string){

        return ;
    }

}
