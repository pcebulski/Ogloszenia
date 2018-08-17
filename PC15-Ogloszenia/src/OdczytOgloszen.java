import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OdczytOgloszen {

	public static void main(String[] args) {
		
		String sql = "SELECT * FROM ogloszenia o LEFT JOIN sprzedawcy s USING(id_sprzedawcy) LEFT JOIN ogloszenia_samochodowe os USING(id_ogl_sam) LEFT JOIN ogloszenia_mieszkaniowe om USING(id_ogl_miesz)";
		

        try(Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/ogloszenia", "postgres", "abc123")) {

            try(PreparedStatement stmt = c.prepareStatement(sql)) {

                try(ResultSet rs = stmt.executeQuery()) {

                    while(rs.next()) {
                    	
                    	int id_ogl_sam = rs.getInt(2);
                        int id_ogloszenia = rs.getInt(4);
                        String tytul = rs.getString(5);
                        String opis = rs.getString(6);
                        int cena = rs.getInt(7);
                        String imie = rs.getString(8);
                        String nazwisko = rs.getString(9);
                        BigDecimal nr_telefon = rs.getBigDecimal(10);
                        String ulica = rs.getString(11);
                        String miasto = rs.getString(12);
                        		
                        System.out.println(id_ogloszenia + " -> " + tytul + " - " + opis + " -$" + cena + " - SPRZEDAJĄCY - " + imie + " " + nazwisko
                        		+ " nr. " +nr_telefon + " ul. " + ulica + " " +miasto);
                        
                        if(id_ogl_sam != 0) {
                        	String marka = rs.getString(13);
                            String model = rs.getString(14);
                            int rok_produkcji = rs.getInt(15);
                            int przebieg = rs.getInt(16);
                            int pojemnosc = rs.getInt(17);
                            int moc = rs.getInt(18);
                            String rodzaj_paliwa = rs.getString(19);
                            int ilosc_drzwi = rs.getInt(20);
                        	System.out.println(marka + " " + model + " rocznik: " + rok_produkcji + " przebieg: " +przebieg 
                        			+ " pojemność: " + pojemnosc + " moc: " + moc + " KM rodzaj paliwa: " + rodzaj_paliwa 
                        			+ " ilość drzwi: " + ilosc_drzwi);
                        	
                        } else {
                        	String miejscowosc = rs.getString(21);
                            String rodzaj = rs.getString(22);
                            int metraz = rs.getInt(23);
                            int ilosc_pokoi = rs.getInt(24);
                        	
                        	if(ilosc_pokoi != 0) {
                        		System.out.println("Rodzaj nieruchomości: " + rodzaj + ", miejscowość: " + miejscowosc 
                            			+ " metraż = " + metraz + " , ilość pokoi = " + ilosc_pokoi);
                        	} else {
                        		System.out.println("Rodzaj nieruchomości: " + rodzaj + ", miejscowość: " + miejscowosc 
                            			+ " metraż = " + metraz);
                        	}
                        }

                    }
                }
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }

	}

}
