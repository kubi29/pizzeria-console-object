package main.java.fr.pizzeria.ihm;

import java.util.Scanner;

import main.java.fr.pizzeria.dao.IPizzaDao;
import main.java.fr.pizzeria.model.Pizza;

public class ListerPizzasOptionMenu extends PizzeriaOptionMenu {
	
	IPizzaDao dao;
	
	
	public ListerPizzasOptionMenu (IPizzaDao dao){
		
		
		this.dao = dao;
		
	}
	
	
	public void execute(Scanner sc){
		
		System.out.println("Liste des pizzas");
		
		for (Pizza pizza : dao.findAllPizzas()) {
			System.out.println(pizza);
		}
		
	}

}
