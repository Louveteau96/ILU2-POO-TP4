package produit;
import personnages.Gaulois;

public class Sanglier extends Produit {
	int poids;
	Gaulois chasseur;
	String nom = "sanglier";

	@Override
	public String descriptionProduit() {
		return nom+" de "+poids+" kilos chassé par "+chasseur.getNom()+".";
		
	}

}
