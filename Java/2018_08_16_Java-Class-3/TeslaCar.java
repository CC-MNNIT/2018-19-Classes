/**
 * This program demonstrate Concrete SubClasses of Car Abstract Class.
 * @version 1.01- 17-08-2018
 * @author Abhey Rana
 */

class TeslaCar extends Car{

	public TeslaCar(String modelName, int passengerCapacity, double topSpeed){
		super(modelName, passengerCapacity, topSpeed);
	}

	// Overriding Abstract methods

	public void accelerate(){
		System.out.println("Tesla's specialized acceleration system");
	}

	public void brake(){
		System.out.println("Tesla's specialized braking system");
	}

	public String getDescription(){
		return "Tesla Car, Model Name: " + this.getModelName() + ", Top Speed: " + this.getTopSpeed();
	}

}