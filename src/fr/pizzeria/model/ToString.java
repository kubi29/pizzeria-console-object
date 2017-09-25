package fr.pizzeria.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ToString {

	boolean uppercase()  default false;

	

	
}


