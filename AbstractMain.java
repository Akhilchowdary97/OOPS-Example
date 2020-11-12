package OOPS;

import OOPS.Abstract.Car;

public class AbstractMain {
	abstract class Car
	{
	 Car()
	 {
	  System.out.println("Car is built. ");
	 }
	 abstract void drive();
	 void gearChange()
	 {
	  System.out.println("Gearchanged!!");
	 }
	} 

	class Tesla extends Car
	 {
	  void drive()
	  {
	   System.out.println("Drive Safely");
	  }
	 }
	}
	