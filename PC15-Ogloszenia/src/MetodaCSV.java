import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;



public class MetodaCSV {
	private static final String SEPARATOR = ";";

	
	public static void zapiszOgloszenia(File plik, List<OgloszeniaCSV> lista)  {
		try(PrintWriter out = new PrintWriter(plik)){
			for(OgloszeniaCSV oglosznieCSV : lista) {
				out.print(oglosznieCSV.getId_ogloszenia());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getTytul());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getOpis());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getCena());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getImie());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getNazwisko());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getNr_telefon());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getUlica());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getMiasto());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getMarka());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getModel());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getRok_produkcji());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getPrzebieg());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getPojemnosc());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getMoc());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getRodzaj_paliwa());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getIlosc_drzwi());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getMiejscowosc());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getRodzaj());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getMetraz());
				out.print(SEPARATOR);
				out.print(oglosznieCSV.getIlosc_pokoi());
				out.print(SEPARATOR);
				out.println();
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
}
}
