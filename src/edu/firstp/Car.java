package myproject;

public class Car {
	private int wheelCount;
	private boolean roundS;
	private String name;
	
	public Car(String name) {
		this.name=name;
		this.wheelCount=4;
		this.roundS=true;
	}
	
	private int maxSpeed() {
		if(this.name.startsWith("Maruti")) {
			return 80;
		}else if(this.name.startsWith("Tata")) {
			return 120;
		}else if(this.name.startsWith("Mahindra")) {
			return 140;
		}
		
		return 60;
	}

	public static void main(String[] args) {
		Car maruti=new Car("Maruti Wagnor");
		System.out.println("MaxSpeed="+maruti.maxSpeed());
		
		Car mahindra=new Car("Mahindra XUV 700");
		
		System.out.println("MaxSpeed="+mahindra.maxSpeed());
	}
}
