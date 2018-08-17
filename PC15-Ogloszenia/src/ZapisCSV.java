import java.io.File;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ZapisCSV {

	public static void main(String[] args) {

		List<OgloszeniaCSV> lista = new LinkedList<>();

		String sql = "SELECT * FROM ogloszenia o LEFT JOIN sprzedawcy s USING(id_sprzedawcy) LEFT JOIN ogloszenia_samochodowe os USING(id_ogl_sam) LEFT JOIN ogloszenia_mieszkaniowe om USING(id_ogl_miesz)";

		try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/ogloszenia", "ogloszenia",
				"abc123")) {

			try (PreparedStatement stmt = c.prepareStatement(sql)) {

				try (ResultSet rs = stmt.executeQuery()) {

					while (rs.next()) {

					
						int id_ogloszenia = rs.getInt(4);
						String tytul = rs.getString(5);
						String opis = rs.getString(6);
						int cena = rs.getInt(7);
						String imie = rs.getString(8);
						String nazwisko = rs.getString(9);
						BigDecimal nr_telefon = rs.getBigDecimal(10);
						String ulica = rs.getString(11);
						String miasto = rs.getString(12);
						String marka = rs.getString(13);
						String model = rs.getString(14);
						int rok_produkcji = rs.getInt(15);
						int przebieg = rs.getInt(16);
						int pojemnosc = rs.getInt(17);
						int moc = rs.getInt(18);
						String rodzaj_paliwa = rs.getString(19);
						int ilosc_drzwi = rs.getInt(20);
						String miejscowosc = rs.getString(21);
						String rodzaj = rs.getString(22);
						int metraz = rs.getInt(23);
						int ilosc_pokoi = rs.getInt(24);
						
						lista.add(new OgloszeniaCSV(id_ogloszenia, tytul, opis, cena, imie, nazwisko, nr_telefon, ulica, miasto, miejscowosc, rodzaj, metraz, ilosc_pokoi, marka, model, rok_produkcji, przebieg, pojemnosc, moc, rodzaj_paliwa, ilosc_drzwi));

					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

			MetodaCSV.zapiszOgloszenia(new File("OgloszeniaCSV.csv"), lista);
	}

}
