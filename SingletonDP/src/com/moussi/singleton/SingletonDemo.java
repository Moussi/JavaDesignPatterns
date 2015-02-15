package com.moussi.singleton;

/**
 * 
 * @author Aymen
 * This design pattern insures that only one instance of class is created
 */
public class SingletonDemo {
	private static SingletonDemo instance;
	
	/**
	 * constructor must be private
	 */
	private SingletonDemo() {
	}

	/**
	 * synchronized to prevent thread safe issues in multi-thread envirment
	 * @return instance
	 */
	public synchronized static SingletonDemo getInstance()
	{
		if(instance==null)
		{
			instance = new SingletonDemo();
		}
		return instance;
	}
	
	public void printhello()
	{
		System.out.println("Hello Singleton");
	}
	
	/**
	 * prevent anyone to clone our singleton class and create another instance of it
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
	}
}
