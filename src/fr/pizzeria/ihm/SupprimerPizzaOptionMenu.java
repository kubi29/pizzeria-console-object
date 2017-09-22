package fr.pizzeria.ihm;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

public class SupprimerPizzaOptionMenu extends PizzeriaOptionMenu{
	
	IPizzaDao dao;
	
	public SupprimerPizzaOptionMenu(IPizzaDao dao){
		
		
		this.dao = dao;
		
	}
	
	public void execute (Scanner sc){
		
		System.out.println("Suppression d’une pizza");
		
		for (Pizza pizza : dao.findAllPizzas()) {
			System.out.println(pizza);
		}
		System.out.println("1 pour supprimer");
		System.out.println("99 pour abandonner");
		System.out.println("Veuillez siasir vote choix");
		
		int choix1 = sc.nextInt();
		
		if(choix1 != 99){
			System.out.println("Veuillez choisir la pizza à supprimer en indiquent son code");
			
			String codeASupprimmer = sc.next().trim().toUpperCase();
			
			dao.deletePizza(codeASupprimmer);
		
		}
	}
}
