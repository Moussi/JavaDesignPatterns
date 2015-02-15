package com.moussi.singleton;

/**
 * Design PAttern Test Class
 * @author Aymen
 *
 */
public class Main {

	public static void main(String[] args) {

		/* this expression is wrong because our constructor is private and we can create only one intance 
		 * using getInstance methode
		SingletonDemo singletonDemo=new SingletonDemo();	
		*/
		SingletonDemo singletonDemo=SingletonDemo.getInstance();
		singletonDemo.printhello();
		
	}

}
