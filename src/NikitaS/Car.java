package NikitaS;

/**
 * Created by NikitaShuvalov on 10/11/16.
 */
public class Car {
    String mColor;
    String mBrand;
    int mTopSpeed;

    public Car(String color, String brand, int topSpeed){
        mColor = color;
        mBrand = brand;
        mTopSpeed= topSpeed;
    }

    public void go(){
        System.out.println("The "+mColor +" "+ mBrand + " is accelerating.");
    }
    public void slow(){
        System.out.println("The "+mColor +" "+ mBrand + " is deccelerating.");
    }
    public void stop(){
        if (Math.random()*100<(mTopSpeed-125)){
            System.out.println("The "+mColor +" "+ mBrand + " did not stop and ran the red light.");
        }else{
            System.out.println("The "+mColor +" "+ mBrand + " is stationary.");
        }
    }

    public String getColor(){
        return mColor;
    }
    public String getBrand(){
        return mBrand;
    }
    public int getTopSpeed(){
        return mTopSpeed;
    }
    public void setColor(String color){
        mColor = color;
    }
    public void setBrand(String brand){
        mBrand= brand;
    }
    public void setTopSpeed(int topSpeed){
        mTopSpeed=topSpeed;
    }
}
