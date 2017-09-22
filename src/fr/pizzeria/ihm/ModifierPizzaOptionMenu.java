package fr.pizzeria.ihm;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaOptionMenu extends PizzeriaOptionMenu {

	
	IPizzaDao dao;
	
	public ModifierPizzaOptionMenu (IPizzaDao dao){
		
		this.dao = dao;
		
	}
	
	public void execute(Scanner sc){
		
		System.out.println("Mise à jour d’une pizza");
		
		for (Pizza pizza : dao.findAllPizzas()) {
			System.out.println(pizza);
		}
		
		System.out.println("99 pour abandonner");
		System.out.println("Veuillez choisir la pizza à modifier");
		
		int result = sc.nextInt();
	
		if(result != 99){
			System.out.println("Veuillez saisir le code de la pizza à modifier");
			String codeAModifier = sc.next();

			for (Pizza pizza : dao.findAllPizzas()) {

				if(codeAModifier.equals(pizza.getCode())){
					System.out.println("Veuillez saisir le code");
					String code = sc.next().trim().toUpperCase() ;
					System.out.println("Veuillez saisir le nom (sans espace)");
					String nom =  sc.next().trim();
					System.out.println("Veuillez saisir le prix");
					double prix = sc.nextDouble();
					Pizza p = new Pizza(code , nom, prix);
					dao.updatePizza(codeAModifier, p);
					
				}
			}
		
		}
	
	}
}
