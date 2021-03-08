package com.chandu.design.patterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		// This doesn't work as we created the singleton class with the private
		// Constructor
		// DateUtil singletonUtil = new DateUtil();

		// Calling the static getInstance method of type SingletonUtil that returns the
		// Singleton Object
		SingletonUtil singletonUtil1 = SingletonUtil.getInstance();
		SingletonUtil singletonUtil2 = SingletonUtil.getInstance();
		System.out.println(singletonUtil1);
		System.out.println(singletonUtil2);

		// Testing the serialization of the singleton objects.

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				new File("/Users/swathireddy/swathireddyy/Chandu/Java-workspace/Testfiles/dateUtil.ser")));
		oos.writeObject(singletonUtil1);

		SingletonUtil singletonUtil3 = null;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				new File("/Users/swathireddy/swathireddyy/Chandu/Java-workspace/Testfiles/dateUtil.ser")));
		singletonUtil3 = (SingletonUtil) ois.readObject();

		oos.close();
		ois.close();

		boolean result = singletonUtil1 == singletonUtil2;
		boolean result1 = singletonUtil1 == singletonUtil3;

		System.out.println("Comparing the Singleton Objects: " + result);// Returns True as both are same.

		// Returns False as we are serializing and de-serializing the objects and
		// comparing them.
		// In order to resolve this issue uncomment the protected Object readResolve()
		// in the SingletonUtil class
		// which will be used when de-serializing the object.
		System.out.println("Comparing the Singleton Objects with Serailization: " + result1);

	}

}
