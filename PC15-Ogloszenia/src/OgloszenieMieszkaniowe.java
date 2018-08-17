
public class OgloszenieMieszkaniowe extends Ogloszenie {
	
	private int id_ogl_miesz, metraz, ilosc_pokoi;
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

	public Rodzaj getRodzaj() {
		return rodzaj;
	}

	public void setRodzaj(Rodzaj rodzaj) {
		this.rodzaj = rodzaj;
	}

	private String miejscowosc;
	private Rodzaj rodzaj;
	
	enum Rodzaj {
		Dom, Mieszkanie, Dzialka
	}
	

	OgloszenieMieszkaniowe() {
	}
	
	OgloszenieMieszkaniowe(int id_ogloszenia, String tytul, String opis, int cena, int id_sprzedawcy, int id_ogl_sam,
			int id_ogl_miesz, String miejscowosc, Rodzaj rodzaj, int metraz, int ilosc_pokoi){
		super(id_ogloszenia, tytul, opis, cena, id_sprzedawcy, id_ogl_sam, id_ogl_miesz);
		this.miejscowosc = miejscowosc;
		this.rodzaj = rodzaj;
		this.metraz = metraz;
		this.ilosc_pokoi = ilosc_pokoi;
		
		
	}

	@Override
	public String toString() {
		return "OgloszenieMieszkaniowe [id_ogl_miesz=" + id_ogl_miesz + ", metraz=" + metraz + ", ilosc_pokoi="
				+ ilosc_pokoi + ", miejscowosc=" + miejscowosc + ", rodzaj=" + rodzaj + "]";
	}
	
	
	
	
}
