package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoImpl;
import fr.pizzeria.ihm.AjouterPizzaOptionMenu;
import fr.pizzeria.ihm.ListerPizzasOptionMenu;
import fr.pizzeria.ihm.ModifierPizzaOptionMenu;
import fr.pizzeria.ihm.SupprimerPizzaOptionMenu;

public class PizzeriaAdminConsoleApp {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		menu();
		
		int choix = sc.nextInt();
		
		PizzaDaoImpl array = new PizzaDaoImpl();
		
		
		do{
			
		
			if(choix == 1){

				
				
			}else if (choix == 2){

				AjouterPizzaOptionMenu ajouter = new AjouterPizzaOptionMenu(array);
				
				ajouter.execute(sc);
				
				 
			}else if (choix == 3){
				
				ModifierPizzaOptionMenu modifier = new ModifierPizzaOptionMenu(array);
				
				modifier.execute(sc);
				
				
			}else if (choix == 4){
				
				SupprimerPizzaOptionMenu supprimer = new SupprimerPizzaOptionMenu(array);
				
				supprimer.execute(sc);
				
				

			}else {

				System.out.println("Erreure de saisie");

			}
			
			ListerPizzasOptionMenu lister = new ListerPizzasOptionMenu(array);
			
			lister.execute(sc);

			menu();

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
