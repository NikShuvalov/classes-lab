package NikitaS;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static String[] carColors= {"Neon Yellow","Red", "White","Brown","Blue","Grey","Black","Sandstone","Metallic Blue","Forest Green", "Banana Yellow"};
    static String[] carBrands={"Oldsmobile", "Kia", "Toyota", "Honda", "Hyundai", "Chevrolet","Nissan","Ford","Volkswagen", "Lamborghini"};

    static ArrayList<Car> traffic= new ArrayList<>();
    public static void main(String[] args) {
        StopLight stopLight = new StopLight();
        Random ranGen = new Random();

        traffic.add(new Car("Brown", "Oldsmobile", 65));
        for (int i = 0; i < 20; i++) {
            traffic.add(new Car(carColors[ranGen.nextInt(carColors.length-1)],carBrands[ranGen.nextInt(carBrands.length-1)],ranGen.nextInt(100)+50));
        }

        for (int i = 0; i < 30; i++) {
            System.out.println("The stoplight is shining a bright "+stopLight.getLightColor()+"\n--------------------------");
            for (Car myCar:traffic) {
                if (stopLight.isGreen()) {
                    myCar.go();
                } else if (stopLight.isYellow()) {
                    myCar.slow();
                } else if (stopLight.isRed()) {
                    myCar.stop();
                } else {
                    System.out.println("There was a glitch in the matrix.");
                }
            }
            System.out.println("\n\n");
            if (stopLight.isGreen()){
                stopLight.setLightColor("yellow");
            }else if (stopLight.isYellow()){
                stopLight.setLightColor("red");
            }else if (stopLight.isRed()){
                stopLight.setLightColor("green");
            }else{
                System.out.println("There was a glitch in the matrix.");
            }
        }

    }
}
