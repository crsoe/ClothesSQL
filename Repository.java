package main.ProduktDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Repository {

    List<Produkt> getProdukts() throws IOException, SQLException {

    Properties p = new Properties();
        p.load(new FileInputStream("untitled/src/Properties/setting.Properties"));

        try (
    Connection con = DriverManager.getConnection(
            p.getProperty("connectionString"),
            p.getProperty("name"),
            p.getProperty("password"))) {

        Statement stmt = con.createStatement();

//RS
        ResultSet rs = stmt.executeQuery("select produktID, namn, Färg, Märke, StorlekID, prisID, beställID,KategoriID FROM Produkt");

        List<Produkt> produkt = new ArrayList<>();

        while (rs.next()) {
            Produkt temp = new Produkt();

            int produktID = rs.getInt("produktID");
            temp.setProduktID(produktID);

            String namn = rs.getString("namn");
            temp.setNamn(namn);

            String Färg = rs.getString("Färg");
            temp.setFärg(Färg);

            String Märke = rs.getString("Märke");
            temp.setMärke(Märke);

            int StorlekID1 = rs.getInt("StorlekID");
            temp.setStorlekID(StorlekID1);

            int prisID1 = rs.getInt("prisID");
            temp.setPrisID(prisID1);

            int beställID1 = rs.getInt("beställID");
            temp.setBeställID(beställID1);

            int KategoriID = rs.getInt("KategoriID");
            temp.setKategoriID((KategoriID));
            produkt.add(temp);

            }
            return produkt;
        }

    }

}
