
public class Ogloszenie {
	
	private String tytul, opis;
	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	@Override
	public String toString() {
		return "Ogloszenie [tytul=" + tytul + ", opis=" + opis + ", id_ogloszenia=" + id_ogloszenia + ", cena=" + cena
				+ ", id_sprzedawcy=" + id_sprzedawcy + ", id_ogl_sam=" + id_ogl_sam + ", id_ogl_miesz=" + id_ogl_miesz
				+ "]";
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

	private int id_ogloszenia, cena, id_sprzedawcy, id_ogl_sam, id_ogl_miesz;
	
	public Ogloszenie() {
		
	}
	
	public Ogloszenie(int id_ogloszenia, String tytul, String opis, int cena, int id_sprzedawcy, int id_ogl_sam, int id_ogl_miesz) {
			this.id_ogloszenia = id_ogloszenia;
			this.tytul = tytul;
			this.opis = opis;
			this.cena = cena;
			this.id_sprzedawcy = id_sprzedawcy;
			this.id_ogl_sam = id_ogl_sam;
			this.id_ogl_miesz = id_ogl_miesz;
			
	}
}
