package com.chandu.design.patterns.singleton;

import java.io.Serializable;

public class SingletonUtil implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	// private instance static variable of type DateUtil to hold the reference
	private static volatile SingletonUtil instance;

	// Eager Initialization
	// private static DateUtil instance = new DateUtil();

	// Using the static method for creating the instance, Eager Initialization.
//	static {
//		instance = new DateUtil();
//	}
//	

	// private Constructor
	private SingletonUtil() {

	}

	// static method of type DateUtil to return the Instance of singleton
	// synchronized to avoid duplication of the object creation by mulitple threads
	public static SingletonUtil getInstance() {
		// lazy Initialization - we are creating object only when the getInstance method
		// is called.

		if (instance == null) {
			synchronized (SingletonUtil.class) {
				if (instance == null) {
					instance = new SingletonUtil();
				}

			}
		}

		return instance;
	}

//	protected Object readResolve()
//	
//	{
//		return instance;
//	}

	// if some other class tries to clone the object, it will get an exception
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
