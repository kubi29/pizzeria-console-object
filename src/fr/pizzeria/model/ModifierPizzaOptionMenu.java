package fr.pizzeria.model;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.console.PizzeriaAdminConsoleApp;

public class ModifierPizzaOptionMenu {

	
	public ArrayList <Pizza> array = new ArrayList<>();
	
	public ModifierPizzaOptionMenu (ArrayList <Pizza> array){
		
		this.array = array;
		
	}
	
	public void execute(){
		
		System.out.println("Mise à jour d’une pizza");
		
		for (Pizza pizza : array) {
			System.out.println(pizza);
		}
		
		System.out.println("99 pour abandonner");
		System.out.println("Veuillez choisir la pizza à modifier");
		
		int result = PizzeriaAdminConsoleApp.sc.nextInt();
	
		if(result != 99){
			System.out.println("Veuillez saisir le code de la pizza à modifier");
			String result1 = PizzeriaAdminConsoleApp.sc.next();

			for (Pizza pizza : array) {

				if(result1.equals(pizza.getCode())){
					System.out.println("Veuillez saisir le code");
					String code = PizzeriaAdminConsoleApp.sc.next() ;
					System.out.println("Veuillez saisir le nom (sans espace)");
					String nom =  PizzeriaAdminConsoleApp.sc.next();
					System.out.println("Veuillez saisir le prix");
					double prix = PizzeriaAdminConsoleApp.sc.nextDouble();
					pizza.setCode(code);
					pizza.setNom(nom);
					pizza.setPrix(prix);

				}
			}
		
		}
	
	}
}
