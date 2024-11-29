/**
 * Author: Dawit Alem
 */
public class Television {
    // fields
    final private String MANUFACTURER; // The manufacturer of the TV
    final private int SCREEN_SIZE; // The size of the TV screen
    private boolean powerOn; // Indicates whether the TV is on or off
    private int channel; // The channel currently being displayed
    private int volume; // The current volume level of the TV

    /**
     * Parameterized constructor that creates a Television object.
     * Initializes the TV with the specified manufacturer and screen size.
     * The channel is set to 2 and volume is set to 20 by default.
     * @param manufacturer - The manufacturer of the TV
     * @param screenSize - The size of the TV screen
     */
    public Television(String manufacturer, int screenSize) {
        MANUFACTURER = manufacturer;
        SCREEN_SIZE = screenSize;
        powerOn = false;
        channel = 2;
        volume = 20;
    }

    /**
     * Retrieves the current volume level of the TV.
     * @return volume - The current volume level
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Retrieves the current channel displayed on the TV.
     * @return channel - The current channel
     */
    public int getChannel() {
        return channel;
    }

    /**
     * Retrieves the manufacturer of the TV.
     * @return MANUFACTURER - The brand of the TV
     */
    public String getManufacturer() {
        return MANUFACTURER;
    }

    /**
     * Retrieves the size of the TV screen.
     * @return SCREEN_SIZE - The screen size of the TV
     */
    public int getScreenSize() {
        return SCREEN_SIZE;
    }

    /**
     * Sets the TV to a new channel.
     * @param change - The desired channel
     */
    public void setChannel(int change) {
        channel = change;
    }

    /**
     * Toggles the power state of the TV.
     * Turns the TV on if it's off and off if it's on.
     */
    public void power() {
        powerOn = !powerOn;
    }

    /**
     * Increases the TV's volume by 1.
     */
    public void increaseVolume() {
        volume++;
    }

    /**
     * Decreases the TV's volume by 1.
     */
    public void decreaseVolume() {
        volume--;
    }
}
