//Barrington Thorpe
// Lab 6

public class Television {
	private String MANUFACTURER; // the maker of the television
	private int SCREEN_SIZE; // the size of the television
	private boolean powerOn; // contains true if the TV power is on
	private int channel; // the numeric station setting
	private int volume; // the numeric level of the sound

	/**
	 * Constructor creates a television with given brand and size
	 * 
	 * @param brand The manufacturer of the television
	 * @param size  The size of the screen
	 */
	public Television(String brand, int size) {
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;
		// To do - Task 1 step 4
	}

	/**
	 * accessor method returns the current volume
	 * 
	 * @return the current volume
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * accessor method returns the current channel
	 * 
	 * @return the current channel
	 */
	// To do - Add code here
	public int getChannel() {
		return channel;
	}

	/**
	 * accessor method returns the manufacturer's name
	 * 
	 * @return the television manufacture's name
	 */
	// To do - Add code here
	public String getManufacturer() {
		return MANUFACTURER;
	}

	/**
	 * accessor method returns the size of the screen
	 * 
	 * @return the size of the screen
	 */
	// To do - Add code here
	public int getScreenSize() {
		return SCREEN_SIZE;
	}

	/**
	 * mutator method stores the desired station in the channel field
	 * 
	 * @param station the desired television channel
	 */
	public void setChannel(int station) {
		channel = station;
	}

	/** toggles the power on and off */
	public void power() {
		powerOn = !powerOn;
	}

	/** increases the volume by one */
	public void increaseVolume() {
		volume++;
	}

	/** decreases the volume by one */
	// To do - Add code here
	public void decreaseVolume() {
		volume--;
	}
}
