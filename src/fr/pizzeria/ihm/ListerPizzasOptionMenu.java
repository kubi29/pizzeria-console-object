package fr.pizzeria.ihm;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

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
