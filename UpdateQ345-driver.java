class gasTank{
	private static double amount = 0;
	
	public gasTank(double amount){
		gasTank.amount = amount;
	}
	public void addGas(double amount){
		gasTank.amount+=amount;
	}
	public void useGas (double amount){
		gasTank.amount -= amount;
	}
	public double getGasLevel(){
	return  amount;	
	}	
}
class Car{
	private double minimumAmount;
	private double MPG;
	gasTank Tank = new gasTank(20);
	
	public Car (double minimumAmount,double MPG){
    Tank.getGasLevel();
	this.minimumAmount = minimumAmount;
	this.MPG = MPG;
	}

	public double getminimumAmount(){
		return minimumAmount;
	}
	
	public double getMPG(){
	return MPG;
	}
	
	public double MaximumDistance(){
		return MPG*(Tank.getGasLevel()-minimumAmount);
	}
	
}
class Driver{
	private double MaximumDistance;
	private double milesOfdestination;
    Car car =  new Car(1.5, 18); //the required minimum gas amount is 1.5 gallon,
                                 //MPG of this car is 18;
	public Driver(double milesOfdestination){
		MaximumDistance=car.MaximumDistance();
		System.out.println("MaximumDistance of this car is : "+MaximumDistance);
		this.milesOfdestination = milesOfdestination;
	}
	public double getmilesOfdestination(){
		return milesOfdestination;
	}
	public double MaximumDistance(){
		return MaximumDistance;
	}
	
	public boolean isAmountcheck(){
		  // check the destination if within the distance that
		 // gas amount can support based on current gas amount and MPG;
			if (milesOfdestination < MaximumDistance ){
				return true;
			}
			else 
				return false;
	 }
	public void DriveCar(){
		if (isAmountcheck( )){
			System.out.println("Gas is enough to destination");	
		}
		else 
			System.out.println("Gas is not enough to destination");
	}
}
public class DriveCar{
	public static void main (String[] args){//Test based on distance that driver wants to go.
	Driver A = new Driver(50);
	A.DriveCar();
	Driver B = new Driver(350);
	B.DriveCar();
	}
}

