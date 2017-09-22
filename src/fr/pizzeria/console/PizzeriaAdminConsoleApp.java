package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.model.AjouterPizzaOptionMenu;
import fr.pizzeria.model.ListerPizzasOptionMenu;
import fr.pizzeria.model.ModifierPizzaOptionMenu;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.model.SupprimerPizzaOptionMenu;

public class PizzeriaAdminConsoleApp {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu();
		
		int choix = sc.nextInt();
		
		Pizza p1 = new Pizza("PEP" , "Pépéroni", 12.50);
		Pizza p2 = new Pizza( "MAR" , "Margherita " , 14.00 );
		Pizza p3 = new Pizza( "REIN", "La Reine " , 11.50 );
		Pizza p4 = new Pizza( "FRO" , "La 4 fromages" , 12.00);
		Pizza p5 = new Pizza( "CAN" , "La cannibale" , 12.50);
		Pizza p6 = new Pizza("SAV" , "La savoyarde" , 13.00);
		Pizza p7 = new Pizza( "ORI" , "L’orientale" , 13.50);
		Pizza p8 = new Pizza( "IND" , "L'indienne" , 14.00);

		ArrayList <Pizza> array = new ArrayList<>();
		array.add(p1);
		array.add(p2);
		array.add(p3);
		array.add(p4);
		array.add(p5);
		array.add(p6);
		array.add(p7);
		array.add(p8);
		
		
		do{
			
		
			if(choix == 1){

				
				ListerPizzasOptionMenu lister = new ListerPizzasOptionMenu(array);
				
				lister.execute();
				
				
			}else if (choix == 2){

				AjouterPizzaOptionMenu ajouter = new AjouterPizzaOptionMenu(array);
				ListerPizzasOptionMenu lister = new ListerPizzasOptionMenu(array);
				
				ajouter.execute();
				
				lister.execute();
				
				 
			}else if (choix == 3){
				
				ModifierPizzaOptionMenu modifier = new ModifierPizzaOptionMenu(array);
				ListerPizzasOptionMenu lister = new ListerPizzasOptionMenu(array);
				
				modifier.execute();
				
				lister.execute();
				
				
			}else if (choix == 4){
				
				SupprimerPizzaOptionMenu supprimer = new SupprimerPizzaOptionMenu(array);
				ListerPizzasOptionMenu lister = new ListerPizzasOptionMenu(array);
				
				supprimer.execute(sc);
				lister.execute();
				
			/*	System.out.println("Suppression d’une pizza");
				
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
				
				for (Pizza pizza : array) {
					System.out.println(pizza);
				}*/

			}else {

				System.out.println("Erreure de saisie");

			}

			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			choix = sc.nextInt();
		
		}while(choix != 99);
		
		System.out.println("Aurevoir ");
		
		
	}
	private static void menu(){
		
		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");
		
	}
	
	

}
