class BulbExecutor{
	
	public static void main (String[] bulbstatus){
		
		boolean on = Bulb.onOrOff();
		
		System.out.println("The bulb is currently turned On : "+on);
		
		Bulb.increaseIntensity();
		Bulb.increaseIntensity();
		Bulb.increaseIntensity();
		Bulb.increaseIntensity();
		Bulb.increaseIntensity();
		Bulb.decreaseIntensity();
		Bulb.decreaseIntensity();
		Bulb.decreaseIntensity();
		Bulb.decreaseIntensity();
		Bulb.decreaseIntensity();
		
		boolean off = Bulb.onOrOff();
		
		System.out.println("The bulb is currently turned On : "+off);
	}
}