package data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


//устаревшая версия
public class CreateTable {

    public static String timezone = "CREATE TABLE learndb2.timezone (\n" +
            "    timezone_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    time_offset VARCHAR(45) NOT NULL,\n" +
            "    CONSTRAINT timezone__pk PRIMARY KEY (timezone_id),\n" +
            "    CONSTRAINT timezone__offset__uk UNIQUE (time_offset)\n" +
            ");";

    private static String city = "CREATE TABLE learndb2.city (\n" +
            "    city_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    name VARCHAR(45) NOT NULL,\n" +
            "    timezone_id INT NOT NULL,\n" +
            "    CONSTRAINT city__pk PRIMARY KEY (city_id),\n" +
            "    CONSTRAINT city__to__timezone FOREIGN KEY (timezone_id) REFERENCES timezone (timezone_id)\n" +
            ");";

    private static String store = "CREATE TABLE learndb2.store (\n" +
            "    store_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    name VARCHAR(45) NOT NULL,\n" +
            "    site_url VARCHAR(45),\n" +
            "    CONSTRAINT store__pk PRIMARY KEY (store_id),\n" +
            "    CONSTRAINT store__name__uk UNIQUE (name)\n" +
            ");";

    private static String store_address = "CREATE TABLE learndb2.store_address (\n" +
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

    private static String store_addressCREATE_INDEX = "CREATE INDEX store_address__city_id ON learndb2.store_address (city_id);";

    private static String category = "CREATE TABLE learndb2.category (\n" +
            "    category_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    parent_category_id INT,\n" +
            "    name VARCHAR(90) NOT NULL,\n" +
            "    CONSTRAINT category__pk PRIMARY KEY (category_id),\n" +
            "    CONSTRAINT category__parent__fk FOREIGN KEY (parent_category_id) REFERENCES category (category_id),\n" +
            "    CONSTRAINT category__name__uk UNIQUE (parent_category_id, name)\n" +
            ");";
    private static String categoryCREATE_INDEX = "CREATE INDEX category__parent_category_id ON learndb2.category (parent_category_id);";

    private static String product = "CREATE TABLE learndb2.product (\n" +
            "    product_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    category_id INT NOT NULL,\n" +
            "    name VARCHAR(45) NOT NULL,\n" +
            "    description VARCHAR(45),\n" +
            "    CONSTRAINT product__pk PRIMARY KEY (product_id),\n" +
            "    CONSTRAINT product__to__category FOREIGN KEY (category_id) REFERENCES category (category_id),\n" +
            "    CONSTRAINT product__name__uk UNIQUE (category_id, name)\n" +
            ");";
    private static String productCREATE_INDEX ="CREATE INDEX product__name ON learndb2.product (name);";

    private static String product_price = "CREATE TABLE learndb2.product_price (\n" +
            "    product_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    store_id INT NOT NULL,\n" +
            "    price NUMERIC (15, 2) NOT NULL,\n" +
            "    CONSTRAINT product_price__pk PRIMARY KEY (product_id, store_id),\n" +
            "    CONSTRAINT product_price__price__ck CHECK (price > 0)\n" +
            ");";
    private static String product_priceCREATE_INDEX ="CREATE INDEX product_price__store_id ON learndb2.product_price (store_id);";

    private static String rank = "CREATE TABLE learndb2.rank (\n" +
            "    store_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    rank_id VARCHAR(45) NOT NULL,\n" +
            "    name VARCHAR(45) NOT NULL,\n" +
            "    CONSTRAINT rank__pk PRIMARY KEY (store_id, rank_id),\n" +
            "    CONSTRAINT rank__to__store FOREIGN KEY (store_id) REFERENCES store (store_id)\n" +
            ");";

    private static String employee = "CREATE TABLE learndb2.employee (\n" +
            "    employee_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    store_id INT NOT NULL,\n" +
            "    rank_id VARCHAR(45) NOT NULL,\n" +
            "    first_name VARCHAR(45) NOT NULL,\n" +
            "    last_name VARCHAR(45) NOT NULL,\n" +
            "    middle_name VARCHAR(45),\n" +
            "    manager_id INT,\n" +
            "    CONSTRAINT employee__pk PRIMARY KEY (employee_id),\n" +
            "    CONSTRAINT employee__to__rank FOREIGN KEY (store_id, rank_id) REFERENCES rank (store_id, rank_id),\n" +
            "    CONSTRAINT employee__manager__fk FOREIGN KEY (manager_id) REFERENCES employee (employee_id)\n" +
            ");";
    private static String employeeCREATE_INDEX ="CREATE INDEX employee__manager_id ON learndb2.employee (manager_id);";

    private static String purchase = "CREATE TABLE learndb2.purchase (\n" +
            "    purchase_id INT NOT NULL AUTO_INCREMENT,\n" +
            "    purchase_date date NOT NULL,\n" +
//            "    purchase_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
            "    store_id INT NOT NULL,\n" +
            "    employee_id INT,\n" +
            "    CONSTRAINT purchase__pk PRIMARY KEY (purchase_id),\n" +
            "    CONSTRAINT purchase__to__employee FOREIGN KEY (employee_id) REFERENCES employee (employee_id),\n" +
            "    CONSTRAINT purchase__to__store FOREIGN KEY (store_id) REFERENCES store (store_id)\n" +
            ");";
    private static String purchaseCREATE_INDEX ="CREATE INDEX purchase__employee_id ON learndb2.purchase (employee_id);";

    private static String purchase_item = "CREATE TABLE learndb2.purchase_item (\n" +
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
    private static String purchase_itemCREATE_INDEX ="CREATE INDEX purchase_item__product_id ON learndb2.purchase_item (product_id);";





    public static ArrayList<String> createTables(){
        ArrayList <String> tables = new ArrayList<String>();
        tables.add(timezone);
        tables.add(city);
        tables.add(store);
        tables.add(store_address);
        tables.add(category);
        tables.add(product);
        tables.add(product_price);
        tables.add(rank);
        tables.add(employee);
        tables.add(purchase);
        tables.add(purchase_item);
        tables.add(store_addressCREATE_INDEX);
        tables.add(categoryCREATE_INDEX);
        tables.add(productCREATE_INDEX);
        tables.add(product_priceCREATE_INDEX);
        tables.add(employeeCREATE_INDEX);
        tables.add(purchaseCREATE_INDEX);
        tables.add(purchase_itemCREATE_INDEX);

        return tables;
    }

}
