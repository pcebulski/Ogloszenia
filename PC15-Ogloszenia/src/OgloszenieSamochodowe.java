
public class OgloszenieSamochodowe extends Ogloszenie {

	private String model, marka;

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

	public int getRokProdukcji() {
		return rokProdukcji;
	}

	public void setRokProdukcji(int rokProdukcji) {
		this.rokProdukcji = rokProdukcji;
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
		return iloscDrzwi;
	}

	public void setIloscDrzwi(int iloscDrzwi) {
		this.iloscDrzwi = iloscDrzwi;
	}

	public RodzajPaliwa getRodzajPaliwa() {
		return rodzajPaliwa;
	}

	public void setRodzajPaliwa(RodzajPaliwa rodzajPaliwa) {
		this.rodzajPaliwa = rodzajPaliwa;
	}

	private int rokProdukcji, przebieg, pojemnosc, moc, iloscDrzwi;
	private RodzajPaliwa rodzajPaliwa;

	enum RodzajPaliwa {
		Diesel, Benzyna, Gaz, Elektryczny

	}

	@Override
	public String toString() {
		return "OgloszenieSamochodowe [model=" + model + ", marka=" + marka + ", rokProdukcji=" + rokProdukcji
				+ ", przebieg=" + przebieg + ", pojemnosc=" + pojemnosc + ", moc=" + moc + ", iloscDrzwi=" + iloscDrzwi
				+ ", rodzajPaliwa=" + rodzajPaliwa + "]";
	}

	OgloszenieSamochodowe() {

	}

	OgloszenieSamochodowe(int id_ogloszenia, String tytul, String opis, int cena, int id_sprzedawcy, int id_ogl_sam,
			int id_ogl_miesz, String marka, String model, int rokProdukcji, int przebieg, int pojemnosc, int moc,
			RodzajPaliwa rodzajPaliwa, int iloscDrzwi) {
		super(id_ogloszenia, tytul, opis, cena, id_sprzedawcy, id_ogl_sam, id_ogl_miesz);
		this.marka = marka;
		this.model = model;
		this.rokProdukcji = rokProdukcji;
		this.przebieg = przebieg;
		this.pojemnosc = pojemnosc;
		this.moc = moc;
		this.rodzajPaliwa = rodzajPaliwa;
		this.iloscDrzwi = iloscDrzwi;

	}

}
