package fr.pizzeria.model;

import java.util.ArrayList;

public class ListerPizzasOptionMenu {
	
	public ArrayList <Pizza> array = new ArrayList<>();
	
	
	public ListerPizzasOptionMenu (ArrayList <Pizza> array){
		
		
		this.array = array;
		
	}
	
	
	public void execute(){
		
		System.out.println("Liste des pizzas");
		
		for (Pizza pizza : array) {
			System.out.println(pizza);
		}
		
	}

}
