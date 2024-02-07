package main.ProduktDemo;//Läser från separat fil, setting.main.ObjModell.RepoProperties för att koppla upp mot databasen och hämtar från en tabell.


import java.io.IOException;
import java.sql.*;
import java.util.List;

public class RepoProperties {

    public static void main(String[] args) throws SQLException, IOException {

        Repository r = new Repository();
        List<Produkt> produktList =  r.getProdukts();
        produktList.forEach(produkt1 -> System.out.println(produkt1.getNamn() + "  " + produkt1.getFärg() + " " + produkt1.getMärke() + " " + produkt1.getPrisID() + " " + produkt1.getKategoriID() ));

            }
        }
