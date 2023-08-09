package model;


import java.util.Objects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Achat {
	// Properties
	private int ref;
	private String libelle;
	private String prix;
	private String description;

	// Constructors
	public Achat() {
		super();
	}

	public Achat(int ref, String libelle, String prix, String description) {
		super();
		this.ref = ref;
		this.libelle = libelle;
		this.prix = prix;
		this.description = description;
	}

	
	// Getters and setters
	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	// Equal and hash
	@Override
	public int hashCode() {
		return Objects.hash(description, libelle, prix, ref);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Achat other = (Achat) obj;
		return Objects.equals(description, other.description) && Objects.equals(libelle, other.libelle)
				&& Objects.equals(prix, other.prix) && ref == other.ref;
	}
	
	

}