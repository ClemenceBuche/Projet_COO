package Domaine;

import java.util.ArrayList;

public abstract class Personne {
	// Informations de la personne
	String NomComptePers;
	String NomPers;
	String PrenomPers;
	String PasswordPers;
	//Liste de ses centres d interets et d amis
	ArrayList<CentreInteret> ListeCentreInteretPers = new ArrayList<CentreInteret>();
	ArrayList<Personne> ListeAmisPers = new ArrayList<Personne>();
	// Bool pour savoir si une personne est moderateur d un groupe ou non 
	Boolean isModerateur = false;
	
	
	//Constructeur par defaut
	public Personne(String NomComptePers,String NomPers,String PrenomPers,String PasswordPers){
		this.NomComptePers = NomComptePers;
		this.NomPers = NomPers;
		this.PrenomPers = PrenomPers;
		this.PasswordPers = PasswordPers;
	}
	
	//Get & Set
	public String getNomComptePers() {
		return NomComptePers;
	}

	public void setNomComptePers(String nomComptePers) {
		NomComptePers = nomComptePers;
	}

	public String getNomPers() {
		return NomPers;
	}

	public void setNomPers(String nomPers) {
		NomPers = nomPers;
	}

	public String getPrenomPers() {
		return PrenomPers;
	}

	public void setPrenomPers(String prenomPers) {
		PrenomPers = prenomPers;
	}

	public String getPasswordPers() {
		return PasswordPers;
	}

	public void setPasswordPers(String passwordPers) {
		PasswordPers = passwordPers;
	}

	public ArrayList<CentreInteret> getListeCentreInteretPers() {
		return ListeCentreInteretPers;
	}

	public void setListeCentreInteretPers(
			ArrayList<CentreInteret> listeCentreInteretPers) {
		ListeCentreInteretPers = listeCentreInteretPers;
	}
	

	public ArrayList<Personne> getListeAmisPers() {
		return ListeAmisPers;
	}

	public void setListeAmisPers(ArrayList<Personne> listeAmisPers) {
		ListeAmisPers = listeAmisPers;
	}

	//Affichage Personne
	public void AfficherPers(){
	System.out.println("Nom de Compte : "+ this.NomComptePers +", nom : " + this.NomPers + 
		" Prenom : " + this.PrenomPers );
	}
}
