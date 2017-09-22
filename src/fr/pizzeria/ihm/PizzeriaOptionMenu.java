package fr.pizzeria.ihm;

import java.util.Scanner;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.UpdatePizzaException;

public abstract  class PizzeriaOptionMenu {
	
	
	public PizzeriaOptionMenu(){
		
	}
	
	public abstract void execute(Scanner sc) throws SavePizzaException, UpdatePizzaException, DeletePizzaException;
	

}
