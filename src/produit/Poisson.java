package produit;

public class Poisson extends Produit{
	String date;
	String nom = "poisson";
	
	
	@Override
	public String descriptionProduit() {
		return nom+" pêchés "+date+".";
		
	}

}
