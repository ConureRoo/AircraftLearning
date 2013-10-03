public class AircraftApproach {
	public static void main(String[] args) {
	
		//Initalise aircraft object
		Aircraft Boeing = new Aircraft();
		Boeing.speed = 300;
		Boeing.direction = 89;
		Boeing.altitude = 2500;
		Boeing.variant = "Boeing 737";
		
		//Initalise airport object	
		Airport Gatwick = new Airport();
		Gatwick.distance = 20;
		Gatwick.runway = 89;
		Gatwick.identifier = "EGKK Gatwick Airport";
		
		//Initiatiation script and introduce initial states	
			System.out.println("This aircraft is a " + Boeing.variant);	
			System.out.println("Our current heading is " + Boeing.direction + " degrees");
			System.out.println("Our aircraft's current speed is " + Boeing.speed + " knots");
			System.out.println("We are " + Gatwick.distance + " miles from " + Gatwick.identifier + " at an altitude of " + Boeing.altitude + " feet");
		
		
		//While loop that determines program continues to run until aircraft is on the ground
		while(Gatwick.distance > 0) {
			System.out.println(Boeing.variant + " is currently " + Gatwick.distance + " miles from " + Gatwick.identifier + " runway " + Gatwick.runway + " at " + Boeing.altitude + "ft" + " at a speed of " + Boeing.speed + " knots");
			
			Gatwick.distance = (Gatwick.distance - 1);
			Boeing.altitude = (Boeing.altitude - 125);
			Boeing.speed = (Boeing.speed - 15);
			
		//If logic determines state of flaps / gear	/ with request to land aircraft method
		if(Gatwick.distance == 18) {
			Boeing.flapsFive();
			}
			
		if(Gatwick.distance == 14) {
			Gatwick.requestToLand();
			Boeing.flapsTen();
			}
			
		if(Gatwick.distance == 6) {
			Boeing.flapsFifteen();
			Boeing.gearDown();
			}
		
		//If logic determines actions upon landing	
		if(Gatwick.distance == 0) {
			System.out.println(Boeing.variant + " has landed at " + Gatwick.identifier);
			Boeing.applyBrakes();
			Gatwick.taxiTerminal();
			}	
		
		} //loop
	} //end method
} // end class

	