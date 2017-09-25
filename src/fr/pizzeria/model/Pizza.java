package fr.pizzeria.model;

public class Pizza {

	public Integer id;
	public String code;
	public String nom;
	public double prix;
	public CategoriePizza categoriePizza ;

	static Integer increment = 0;
	
	public Pizza (){
		
	}
	
	public Pizza ( String code , String nom , double prix ,CategoriePizza categoriePizza){
		
		setId(increment);
		setCode(code);
		setNom(nom);
		setPrix(prix);
		setCategoriePizza(categoriePizza) ;
		increment++;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public CategoriePizza getCategoriePizza() {
		return categoriePizza;
	}

	public void setCategoriePizza(CategoriePizza categoriePizza) {
		this.categoriePizza = categoriePizza;
	}

	@Override
	public String toString() {
		return "Pizza : " + code + "->" + nom + "(" + prix + ")" + " type : " + categoriePizza;
	}

	
	
}
