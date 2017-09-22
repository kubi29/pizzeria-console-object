package fr.pizzeria.ihm;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.model.Pizza;

public class AjouterPizzaOptionMenu extends PizzeriaOptionMenu{

	
	
	IPizzaDao dao;
	
	public AjouterPizzaOptionMenu(IPizzaDao dao){
		
		this.dao = dao;
	}
	
	public void execute(Scanner sc) throws SavePizzaException{
		
		System.out.println("Ajout d’une nouvelle pizza");
		
		
		System.out.println("Veuillez saisir le code");
		String code =  sc.next().toUpperCase() ;
		
		if( code.trim().isEmpty() || code.length() != 3){
				
			throw new SavePizzaException("Le code doit faire 3 caractère");
				
		}
		System.out.println("Veuillez saisir le nom (sans espace)");
		String nom =  sc.next();
		if(nom.trim().isEmpty()){
			throw new SavePizzaException("Le nom doit étre renseigner");
		}
		System.out.println("Veuillez saisir le prix");
		double prix = sc.nextDouble();
	
		if(prix == 0){
			throw new SavePizzaException("Le prix doit étre renseigner");
		}
		
		if(!dao.saveNewPizza(new Pizza(code.toUpperCase(), nom, prix))){

			throw new SavePizzaException("Code déjà existant");
		}		
		
	}
}
