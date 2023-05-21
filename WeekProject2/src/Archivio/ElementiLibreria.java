package Archivio;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ElementiLibreria {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "codice_isbn")
	private int ISBN;
	@Column(nullable = false)
	private String titolo;
	@Column(nullable = false)
	private int anno;
	@Column(nullable = false)
	private int pagine;

	public ElementiLibreria() {
		super();
	}

	public ElementiLibreria(String titolo, int anno, int pagine) {
		this.titolo = titolo;
		this.anno = anno;
		this.pagine = pagine;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	@Override
	public String toString() {
		return "ElementiLibreria [ISBN=" + ISBN + ", titolo=" + titolo + ", anno=" + anno + ", pagine=" + pagine + "]";
	}

}
