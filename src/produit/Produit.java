package produit;

public abstract class Produit implements IProduit {
	private String nom;
	private String unite;
	
	private String getNom() {
		return this.nom;
	}
	
	@Override
	public abstract String descriptionProduit();



}
