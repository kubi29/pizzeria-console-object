package fr.pizzeria.ihm;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

public class AjouterPizzaOptionMenu extends PizzeriaOptionMenu{

	
	
	IPizzaDao dao;
	
	public AjouterPizzaOptionMenu(IPizzaDao dao){
		
		this.dao = dao;
	}
	
	public void execute(Scanner sc){
		
		System.out.println("Ajout d’une nouvelle pizza");
		
		
		System.out.println("Veuillez saisir le code");
		String code =  sc.next() ;
		System.out.println("Veuillez saisir le nom (sans espace)");
		String nom =  sc.next();
		System.out.println("Veuillez saisir le prix");
		double prix = sc.nextDouble();
		Pizza p = new Pizza(code , nom, prix);
		dao.saveNewPizza(p);
		
		
	}
}
