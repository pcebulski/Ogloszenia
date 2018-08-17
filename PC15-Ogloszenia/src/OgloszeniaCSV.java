import java.math.BigDecimal;

public class OgloszeniaCSV {

	String tytul, opis;
	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getOpis() {
		return opis;
	}

	@Override
	public String toString() {
		return "OgloszeniaCSV [tytul=" + tytul + ", opis=" + opis + ", id_ogloszenia=" + id_ogloszenia + ", cena="
				+ cena + ", id_sprzedawcy=" + id_sprzedawcy + ", id_ogl_sam=" + id_ogl_sam + ", id_ogl_miesz="
				+ id_ogl_miesz + ", imie=" + imie + ", nazwisko=" + nazwisko + ", ulica=" + ulica + ", miasto=" + miasto
				+ ", nr_telefon=" + nr_telefon + ", metraz=" + metraz + ", ilosc_pokoi=" + ilosc_pokoi
				+ ", miejscowosc=" + miejscowosc + ", rodzaj=" + rodzaj + ", model=" + model + ", marka=" + marka
				+ ", rodzaj_paliwa=" + rodzaj_paliwa + ", rok_produkcji=" + rok_produkcji + ", przebieg=" + przebieg
				+ ", pojemnosc=" + pojemnosc + ", moc=" + moc + ", ilosc_drzwi=" + ilosc_drzwi + "]";
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public BigDecimal getNr_telefon() {
		return nr_telefon;
	}

	public void setNr_telefon(BigDecimal nr_telefon) {
		this.nr_telefon = nr_telefon;
	}

	public String getRodzaj_paliwa() {
		return rodzaj_paliwa;
	}

	public void setRodzaj_paliwa(String rodzaj_paliwa) {
		this.rodzaj_paliwa = rodzaj_paliwa;
	}

	public int getRok_produkcji() {
		return rok_produkcji;
	}

	public void setRok_produkcji(int rok_produkcji) {
		this.rok_produkcji = rok_produkcji;
	}

	public int getIlosc_drzwi() {
		return ilosc_drzwi;
	}

	public void setIlosc_drzwi(int ilosc_drzwi) {
		this.ilosc_drzwi = ilosc_drzwi;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public int getId_ogloszenia() {
		return id_ogloszenia;
	}

	public void setId_ogloszenia(int id_ogloszenia) {
		this.id_ogloszenia = id_ogloszenia;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public int getId_sprzedawcy() {
		return id_sprzedawcy;
	}

	public void setId_sprzedawcy(int id_sprzedawcy) {
		this.id_sprzedawcy = id_sprzedawcy;
	}

	public int getId_ogl_sam() {
		return id_ogl_sam;
	}

	public void setId_ogl_sam(int id_ogl_sam) {
		this.id_ogl_sam = id_ogl_sam;
	}

	public int getId_ogl_miesz() {
		return id_ogl_miesz;
	}

	public void setId_ogl_miesz(int id_ogl_miesz) {
		this.id_ogl_miesz = id_ogl_miesz;
	}

	public int getMetraz() {
		return metraz;
	}

	public void setMetraz(int metraz) {
		this.metraz = metraz;
	}

	public int getIlosc_pokoi() {
		return ilosc_pokoi;
	}

	public void setIlosc_pokoi(int ilosc_pokoi) {
		this.ilosc_pokoi = ilosc_pokoi;
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}

	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public String getRodzaj() {
		return rodzaj;
	}

	public void setRodzaj(String rodzaj) {
		this.rodzaj = rodzaj;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getRodzajPaliwa() {
		return rodzaj_paliwa;
	}

	public void setRodzajPaliwa(String rodzajPaliwa) {
		this.rodzaj_paliwa = rodzajPaliwa;
	}

	public int getRokProdukcji() {
		return rok_produkcji;
	}

	public void setRokProdukcji(int rokProdukcji) {
		this.rok_produkcji = rokProdukcji;
	}

	public int getPrzebieg() {
		return przebieg;
	}

	public void setPrzebieg(int przebieg) {
		this.przebieg = przebieg;
	}

	public int getPojemnosc() {
		return pojemnosc;
	}

	public void setPojemnosc(int pojemnosc) {
		this.pojemnosc = pojemnosc;
	}

	public int getMoc() {
		return moc;
	}

	public void setMoc(int moc) {
		this.moc = moc;
	}

	public int getIloscDrzwi() {
		return ilosc_drzwi;
	}

	public void setIloscDrzwi(int iloscDrzwi) {
		this.ilosc_drzwi = iloscDrzwi;
	}

	int id_ogloszenia, cena, id_sprzedawcy, id_ogl_sam, id_ogl_miesz;
	String imie, nazwisko, ulica, miasto;
	BigDecimal nr_telefon;
	int metraz, ilosc_pokoi;
	String miejscowosc, rodzaj;
	String model, marka, rodzaj_paliwa;
	int rok_produkcji, przebieg, pojemnosc, moc, ilosc_drzwi;
	
	OgloszeniaCSV(){
		
	}
	
	OgloszeniaCSV(int id_ogloszenia, String tytul, String opis, int cena, String imie, String nazwisko, BigDecimal nr_telefon, String ulica, String miasto, String miejscowosc, String rodzaj, int metraz, int ilosc_pokoi, String marka, String model, int rok_produkcji, int przebieg, int pojemnosc, int moc,
			String rodzaj_paliwa, int ilosc_drzwi){
		this.id_ogloszenia = id_ogloszenia;
		this.tytul = tytul;
		this.opis = opis;
		this.cena = cena;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.nr_telefon = nr_telefon;
		this.ulica = ulica;
		this.miasto = miasto;
		this.miejscowosc = miejscowosc;
		this.rodzaj = rodzaj;
		this.metraz = metraz;
		this.ilosc_pokoi = ilosc_pokoi;
		this.marka = marka;
		this.model = model;
		this.rok_produkcji = rok_produkcji;
		this.przebieg = przebieg;
		this.pojemnosc = pojemnosc;
		this.moc = moc;
		this.rodzaj_paliwa = rodzaj_paliwa;
		this.ilosc_drzwi = ilosc_drzwi;
	}
	
}
