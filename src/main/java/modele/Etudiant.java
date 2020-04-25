package modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity()
@Table(name = "TAB_ETU")
public class Etudiant {

	@Id
	@GeneratedValue(
		    strategy = GenerationType.AUTO,
		    generator = "sequence-generator"
		)
	@SequenceGenerator(
		    name = "sequence-generator",
		    sequenceName = "etud_seq",
		    allocationSize = 1
		)
	private long id;
	
	@Column(name="nom", nullable = false, length = 80)
	private String nom;
	
	@Column(name="prenom", nullable = false, length = 80)
	private String prenom;
	
	@Column(name="adresse", nullable = false, length = 280)
	private String adresse;

	public Etudiant(String nom, String prenom, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public Etudiant() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
