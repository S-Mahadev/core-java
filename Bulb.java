class Bulb{
	
	static boolean isTurnedOn;
	
	static int currentIntensity;
	static int maxIntensity = 10;
	static int minIntensity = 0;
	
	static boolean onOrOff(){
		
		if (isTurnedOn == false){
			isTurnedOn = true;
			System.out.println("The Bulb is turned on ..");
		}else{
			isTurnedOn = false;
			System.out.println("The Bulb is turned off ..");
		}
		
		return isTurnedOn;
	}
	
	static void increaseIntensity(){
		System.out.println("increaseIntensity is invoked...");
		System.out.println("number of args :" +0);
		if(isTurnedOn == true){
			if(currentIntensity < maxIntensity){
				currentIntensity = currentIntensity+1;
				System.out.println("The current Intensity value is : " + currentIntensity);}
			else{
					System.out.println("The maximum value is reached");
				}
			
			
		}else{
			System.out.println("First Turn on the Bulb");
		}
		
	}
	
	static void decreaseIntensity(){
		System.out.println("decreaseIntensity is invoked...");
		System.out.println("number of args :" +0);
		if(isTurnedOn == true){
			if(currentIntensity > minIntensity){
				currentIntensity = currentIntensity-1;
				System.out.println("The current Intensity value is : " + currentIntensity);
			}else{
					System.out.println("The minimum value is reached");
				}
			
			
		}else{
			System.out.println("First Turn on the Bulb");
		}
		
	}



}