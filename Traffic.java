class TrafficLight{
    String Light;
    int duration;
    private long startTime;

    TrafficLight(String light, int duration){
        this.Light=light;
        this.duration=duration;
        this.startTime=System.currentTimeMillis();
    }

    void updateColor(String color,int duration){
        this.Light=color;
        this.duration=duration;
        this.startTime=System.currentTimeMillis();
        System.out.println("Light changed to "+ color +" for "+duration+" seconds");
    }

    long passedDuration(){
        long currentTime=System.currentTimeMillis();
        return (currentTime-startTime)/1000;
    }
    void printMsg(){
        long remainingDuration=passedDuration();
        if(remainingDuration<duration){
            System.out.println("The " + Light + " light is still active. " + (duration - remainingDuration) + " seconds left.");
        }else{
            System.out.println("The " + Light + " light has expired.");
        }
    }

}

public class Traffic  {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight light=new TrafficLight("red",10);

        for(int i=0;i<11;i++){
            Thread.sleep(1000);
            light.printMsg();
        }

        light.updateColor("green",15);
        for(int i=0;i<16;i++){
            Thread.sleep(1000);
            light.printMsg();
        }


        light.updateColor("yellow",5);
        for(int i=0;i<6;i++){
            Thread.sleep(1000);
            light.printMsg();
        }
        System.out.println("Traffic light simulation finished.");
    }

}
