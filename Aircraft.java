class Aircraft {
	
	//Variables to store current state and type of aircraft
	int speed;
	int direction;
	int altitude;
	String variant;

	//Aircraft methods
	
	void flapsFive() {
		System.out.println("*********************************");
		System.out.println("*****   Flaps are at 5 degrees   ******");
		System.out.println("*********************************");
		}
		
	void flapsTen() {
		System.out.println("*********************************");
		System.out.println("*****   Flaps are at 10 degrees   *****");
		System.out.println("*********************************");
		}
		
	void flapsFifteen() {
		System.out.println("*********************************");
		System.out.println("*****   Flaps are at 15 degrees   *****");
		System.out.println("*********************************");
		}
		
	void gearDown() {
		System.out.println("*********************************");
		System.out.println("*****   Gear in landing position   *****");
		System.out.println("*********************************");
		}
		
	void applyBrakes() {
		System.out.println("*********************************");
		System.out.println("*****   Reverse Thrust on - Air Brakes On - Wheel Brakes on   *****");
		System.out.println("*********************************");
		}

}	