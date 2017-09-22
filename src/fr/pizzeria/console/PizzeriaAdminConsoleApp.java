package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");
		
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

				System.out.println("Liste des pizzas");
				
		
				for (Pizza pizza : array) {
					System.out.println(pizza);
				}
				

			}else if (choix == 2){

				System.out.println("Ajout d’une nouvelle pizza");
				
				
				System.out.println("Veuillez saisir le code");
				String code = sc.next() ;
				System.out.println("Veuillez saisir le nom (sans espace)");
				String nom =  sc.next();
				System.out.println("Veuillez saisir le prix");
				double prix = sc.nextDouble();
				Pizza p = new Pizza(code , nom, prix);
				array.add(p);
				System.out.println(p);

				
				 
			}else if (choix == 3){

				System.out.println("Mise à jour d’une pizza");
					for (Pizza pizza : array) {
						System.out.println(pizza);
					}
				System.out.println("99 pour abandonner");
				System.out.println("Veuillez choisir la pizza à modifier");
				int result = sc.nextInt();
				
				if(result != 99){
					System.out.println("Veuillez saisir le code de la pizza à modifier");
					String result1 = sc.next();
					
					
					
					System.out.println("Veuillez saisir le code");
					String code = sc.next() ;
					System.out.println("Veuillez saisir le nom (sans espace)");
					String nom =  sc.next();
					System.out.println("Veuillez saisir le prix");
					double prix = sc.nextDouble();
					
					Pizza p = new Pizza(code , nom, prix);
					array.set(result ,p);
					
					for (Pizza pizza : array) {
						System.out.println(pizza);
					}
					
				}
				
				
			}else if (choix == 4){

				System.out.println("Suppression d’une pizza");
				for (Pizza pizza : array) {
					System.out.println(pizza);
				}
				
				System.out.println("99 pour abandonner");
				System.out.println("Veuillez choisir la pizza à supprimer");
				int result = sc.nextInt();
				if(result != 99){
					array.remove(result);
				}
				for (Pizza pizza : array) {
					System.out.println(pizza);
				}

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

}
