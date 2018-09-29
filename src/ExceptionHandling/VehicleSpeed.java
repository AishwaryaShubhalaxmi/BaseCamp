package ExceptionHandling;
class Vehicle{
	int currentSpeed;
	int maximumSpeed;
    public Vehicle(){}
    public Vehicle(int currentSpeed, int maximumSpeed){
    	this.currentSpeed= currentSpeed;
    	this.maximumSpeed= maximumSpeed;
    }
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public int getMaximumSpeed() {
		return maximumSpeed;
	}
	public void setMaximumSpeed(int maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}
    
    	
    }
	

public class VehicleSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
