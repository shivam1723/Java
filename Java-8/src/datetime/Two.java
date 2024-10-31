package datetime;

import java.time.Year;

public class Two {
    public static void main(String[] args) {
        // 2) Write a java program to find whether the current year is a leap year. 
        Year year=Year.now();
        if(year.isLeap()){
            System.out.println(year+" is Leap year");
        }
        else{
            System.out.println("Not leap year");
        }

        int y=2024;
        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
            System.out.println("Leap");
        } else {
            System.out.println("Not Leap");
        }
        
    }
}
