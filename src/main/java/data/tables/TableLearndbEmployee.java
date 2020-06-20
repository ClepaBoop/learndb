package data.tables;

import java.util.ArrayList;

public class TableLearndbEmployee {
    private static String employee = "CREATE TABLE learndb.employee (\n" +
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
    private static String employeeCREATE_INDEX ="CREATE INDEX employee__manager_id ON learndb.employee (manager_id);";

    public static ArrayList<String> fillingTable() {
        ArrayList<String> list = new ArrayList();
//        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (200, \"\", \"\", \"\", \"\")");

        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (100, \"CHIEF\", \"Alekse\", \"Ivanov\", \"Petrovich\", null)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (200, \"CHIEF\", \"Kenni\", \"Makkormik\", \"\", null)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (400, \"CHIEF\", \"Anna\", \"Matveeva\", \"Igorevna\", null)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (500, \"CHIEF\", \"Roman\", \"Shmidt\", \"Sergeevich\", null)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (600, \"CHIEF\", \"Viktor\", \"Suhorukov\", \"Vitalevich\", null)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (800, \"CHIEF\", \"Svetlana\", \"Nemcova\", \"Leonidovna\", null)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (900, \"CHIEF\", \"Olga\", \"Vershinina\", \"Olegovna\", null)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"CEO\", \"Petr\", \"Korsakov\", \"Konstantinovich\", null)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (301, \"DIRECTOR\", \"Serge\", \"Antonov\", \"Kirillovich\", null)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (302, \"GENERALMANAGER\", \"Vlad\", \"Kontur\", \"Semenovich\", null)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (100, \"MANAGER\", \"Gleb\", \"Tarasov\", \"Avdeevich\", null)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (200, \"MANAGER\", \"Vladislav\", \"Kalashnikov\", \"kovovich\", null)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (300, \"MANAGER\", \"Vladislav\", \"Birkov\", \"kovovich\", null)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (400, \"MANAGER\", \"Valeri\", \"Medvedev\", \"Antoninovich\", 3)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (500, \"MANAGER\", \"rik\", \"Kartman\", \"\", 4)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (600, \"MANAGER\", \"Nikola\", \"Vorobv\", \"Artmovich\", 5)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (600, \"MANAGER\", \"Miron\", \"Kalinin\", \"Ivanovich\", 5)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (600, \"MANAGER\", \"Vilen\", \"Kulakov\", \"Fedotovich\", 5)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (800, \"MANAGER\", \"Zinovi\", \"Belozrov\", \"Semnovich\", 6)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (900, \"MANAGER\", \"Pavel\", \"Avdeev\", \"kovovich\", 7)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"MANAGER\", \"Nikki\", \"Zaceva\", \"Aristarhovna\", 8)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (301, \"MANAGER\", \"Kristina\", \"Emelnova\", \"Alekseevna\", 9)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"MANAGER\", \"Dominika\", \"Timofeeva\", \"Fedotovna\", null)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (302, \"MANAGER\", \"Marina\", \"Kondrateva\", \"Ivanovna\", 10)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (100, \"SELLER\", \"Lbov\", \"Blinova\", \"Lvovna\", 11)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (200, \"SELLER\", \"Natali\", \"Potapova\", \"Evseevna\", 12)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (200, \"SELLER\", \"Lili\", \"Rbova\", \"Leonidovna\", null)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (300, \"SELLER\", \"lza\", \"Odincova\", \"Alekseevna\", 13)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (500, \"SELLER\", \"Zarina\", \"Mironova\", \"Artemovna\", 15)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (600, \"SELLER\", \"Nina\", \"Dchkova\", \"Luknovna\", 16)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (600, \"SELLER\", \"Gleb\", \"Petrov\", \"Avdeevich\", 16)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (600, \"SELLER\", \"Miron\", \"Agafev\", \"Ivanovich\", 18)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (900, \"SELLER\", \"Lili\", \"Leonteva\", \"Leonidovna\", 20)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (900, \"SELLER\", \"lian\", \"Gromov\", \"Fedorovich\", 20)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (900, \"SELLER\", \"Terenti\", \"Burov\", \"Fedorovich\", 20)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"SELLER\", \"Nina\", \"Kondrateva\", \"Leonidovna\", 21)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"SELLER\", \"Lbomir\", \"Efremov\", \"Svtoslavovich\", 21)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"SELLER\", \"Luka\", \"Dementev\", \"Olegovich\", 21)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (301, \"SELLER\", \"Vlas\", \"Suhanov\", \"Olegovich\", 22)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"SELLER\", \"duard\", \"Rogov\", \"Maksovich\", 23)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"SELLER\", \"Terenti\", \"Moiseev\", \"Olegovich\", 23)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (201, \"SELLER\", \"Arnold\", \"Nikiforov\", \"Olegovich\", 23)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (302, \"SELLER\", \"Martin\", \"Subbotin\", \"Stanislavovich\", 24)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (302, \"SELLER\", \"Piter\", \"Parker\", \"\", 24)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (302, \"SELLER\", \"Viktor\", \"Medvedev\", \"Anatolevich\", 24)");
        list.add("insert learndb.employee (store_id, rank_id, first_name, last_name, middle_name, manager_id) values (302, \"SELLER\", \"Lev\", \"Odincova\", \"Sergeevich\", 24)");


        return list;
    }
}
