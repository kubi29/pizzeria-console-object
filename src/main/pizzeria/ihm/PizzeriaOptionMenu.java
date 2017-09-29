package main.pizzeria.ihm;

import java.util.Scanner;

import main.pizzeria.exception.DeletePizzaException;
import main.pizzeria.exception.SavePizzaException;
import main.pizzeria.exception.UpdatePizzaException;

public abstract  class PizzeriaOptionMenu {
	
	
	public PizzeriaOptionMenu(){
		
	}
	
	public abstract void execute(Scanner sc) throws SavePizzaException, UpdatePizzaException, DeletePizzaException;
	

}
