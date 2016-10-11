package NikitaS;

/**
 * Created by NikitaShuvalov on 10/11/16.
 */
public class StopLight {
    String mLightColor;

    public StopLight(){
        mLightColor = "green";
    }
    public boolean isRed(){
        if (mLightColor.equals("red")){
            return true;
        }
        return false;
    }
    public boolean isGreen(){
        if (mLightColor.equals("green")){
            return true;
        }
        return false;
    }
    public boolean isYellow(){
        if (mLightColor.equals("yellow")){
            return true;
        }
        return false;
    }
    public String getLightColor(){
        return mLightColor;
    }
    public void setLightColor(String color){
        if(color.equals("red")||color.equals("green")||color.equals("yellow")){
            mLightColor=color;
        }else{
            System.out.println("Not a valid traffic light color.");
        }
    }
}

//    Define a StopLight class that includes the following:
//
//        Member variables - just one: mLightColor
//        Constructor: takes no input and sets mLightColor to whatever default value you choose
//        Methods:
//        Three that take no input and return a boolean based on the current value of mLightColor: isRed(), isYellow(), isGreen()
//        One setter method named setLightColor() that takes an input, and assigns the value of that input to the mLightColor variable. Make sure to handle when invalid input is provided in a call to this method.
//        Car Class