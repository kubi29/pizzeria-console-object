package fr.pizzeria.model;

import java.util.ArrayList;

import fr.pizzeria.console.PizzeriaAdminConsoleApp;

public class AjouterPizzaOptionMenu {

	
	
	public ArrayList <Pizza> array = new ArrayList<>();
	
	public AjouterPizzaOptionMenu(ArrayList <Pizza> array){
		
		this.array = array;
	}
	
	public void execute(){
		
		System.out.println("Ajout d’une nouvelle pizza");
		
		
		System.out.println("Veuillez saisir le code");
		String code =  PizzeriaAdminConsoleApp.sc.next() ;
		System.out.println("Veuillez saisir le nom (sans espace)");
		String nom =  PizzeriaAdminConsoleApp.sc.next();
		System.out.println("Veuillez saisir le prix");
		double prix = PizzeriaAdminConsoleApp.sc.nextDouble();
		Pizza p = new Pizza(code , nom, prix);
		array.add(p);
		
		
	}
}
