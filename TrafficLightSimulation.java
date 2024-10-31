//class TrafficLight {
//    private String color;
//    private long startTime;
//    private int duration;  // duration in seconds
//
//    public TrafficLight(String initialColor, int initialDuration) {
//        this.color = initialColor;
//        this.duration = initialDuration;
//        this.startTime = System.currentTimeMillis();
//    }
//
//    // Method to change the color of the traffic light
//    public void changeColor(String newColor, int newDuration) {
//        this.color = newColor;
//        this.duration = newDuration;
//        this.startTime = System.currentTimeMillis();
//        System.out.println("Light changed to: " + color + " for " + duration + " seconds.");
//    }
//
//    // Method to check if the light is red
//    public boolean isRed() {
//        return color.equalsIgnoreCase("red");
//    }
//
//    // Method to check if the light is green
//    public boolean isGreen() {
//        return color.equalsIgnoreCase("green");
//    }
//
//    // Method to check how much time has passed since the light was changed
//    public long getElapsedTime() {
//        long currentTime = System.currentTimeMillis();
//        return (currentTime - startTime) / 1000;  // return elapsed time in seconds
//    }
//
//    // Method to print a message based on the current state
//    public void printMessage() {
//        long elapsedTime = getElapsedTime();
//        if (elapsedTime >= duration) {
//            System.out.println("The " + color + " light has expired.");
//        } else {
//            System.out.println("The " + color + " light is still active. " + (duration - elapsedTime) + " seconds left.");
//        }
//    }
//}
//
//public class TrafficLightSimulation {
//    public static void main(String[] args) throws InterruptedException {
//        // Initialize traffic light to Red with a duration of 10 seconds
//        TrafficLight trafficLight=new TrafficLight("red", 10);
//
//        // Simulate checking the light status every 2 seconds
//        for (int i = 0; i < 12; i++) {
//            Thread.sleep(2000);  // Sleep for 2 seconds
//            trafficLight.printMessage();
//        }
//
//        // Change to Green light after 12 seconds
//        trafficLight.changeColor("Green", 15);
//
//        // Simulate checking the light status every 3 seconds
//        for (int i = 0; i < 6; i++) {
//            Thread.sleep(3000);  // Sleep for 3 seconds
//            trafficLight.printMessage();
//        }
//
//        // Change to Yellow light after 18 seconds
//        trafficLight.changeColor("Yellow", 5);
//
//        // Simulate checking the light status every 1 second
//        for (int i = 0; i < 6; i++) {
//            Thread.sleep(1000);  // Sleep for 1 second
//            trafficLight.printMessage();
//        }
//
//        System.out.println("Traffic light simulation finished.");
//    }
//}
