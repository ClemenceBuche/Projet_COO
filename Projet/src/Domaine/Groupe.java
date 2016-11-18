package Domaine;

import java.util.ArrayList;
import java.util.Iterator;

//Groupe de personne avec un nom, un moderateur, et la liste des personnes du groupe
public class Groupe {
	String NomGroupe;
	Personne ModerateurGroupe;
	ArrayList<Personne> ListeGroupePers = new ArrayList<Personne>();
	
	//Constructeur par defaut : Nom du groupe, affectation moderateur, ajout du moderateur dans
	// le groupe
	public Groupe(String nomGroupe, Personne moderateurGroupe) {
		NomGroupe = nomGroupe;
		ModerateurGroupe = moderateurGroupe;
		ListeGroupePers.add(moderateurGroupe);
	}
	
	// affectation d'une personne a un groupe, si elle n y ait pas du tout
	public void AffecterPersGroupe(Personne p1 ){
		Iterator<Personne> it = ListeGroupePers.iterator() ;
		 while (it.hasNext()) {
			 Personne p = it.next() ; 
			 if(p.NomComptePers==p1.NomComptePers) return;
		}
		 ListeGroupePers.add(p1);
	}
}
