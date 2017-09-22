package fr.pizzeria.model;

import java.util.ArrayList;
import java.util.Scanner;

public class SupprimerPizzaOptionMenu {
	
	public ArrayList <Pizza> array = new ArrayList<>();
	
	public SupprimerPizzaOptionMenu(ArrayList <Pizza> array){
		
		
		this.array = array;
		
	}
	
	public void execute (Scanner sc){
		
		System.out.println("Suppression d’une pizza");
		
		for (Pizza pizza : array) {
			System.out.println(pizza);
		}
		System.out.println("1 pour supprimer");
		System.out.println("99 pour abandonner");
		System.out.println("Veuillez siasir vote choix");
		
		int choix1 = sc.nextInt();
		
		if(choix1 != 99){
			System.out.println("Veuillez choisir la pizza à supprimer en indiquent son code");
			
			String codeASupprimmer = sc.next().trim().toUpperCase();
			System.out.println(codeASupprimmer);
			
			for (Pizza pizza : array) {
				
				if(codeASupprimmer.equals(pizza.getCode())){
					
					array.remove(pizza);
					
				}
				
			}
			
		}

	}

}
