public class Robot {
    int batteryLevel = 100; // Battery level percentage(0 to 100)
    int speed =0; // current
    String name="Robo";// Name of the Robo
    String Color="Red" ;// Color of the Robot
    // Method 1: Move
    public void move() {
        speed=5;
        System.out.println(name+" is moving at speed "+speed+" mph");
    }
    // Method 2: Stop
    public void stop() {
        speed = 0;
        System.out.println(name + " has Stopped ");
    }
    // Method 3: Charge Battery
    public void changeBattery() {
        batteryLevel=100;
        System.out.println(name+ "'s battery fully charged.");
    }
    // Method 4: Check Battery Level
    public void checkBatteryLevel(){
        System.out.println(name+"'s current battery level is "+batteryLevel+" %");
    }
    // Challenge Step: DisplayInfo

    public void displayInfo(){
        System.out.println("Robot Name: "+name);
        System.out.println("Robot Color: "+ Color);
        System.out.println("Battery Level: "+batteryLevel+"%");
        System.out.println("Current Speed: "+speed);

    }

}
