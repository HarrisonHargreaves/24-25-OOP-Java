package code.week5_6;

public class Bulb
{

    private boolean isOn;

    public Bulb() {
    }

    public void turnOn() {

            isOn = true;
            System.out.println("The bulb is now on");
        }

    public void turnOff() {
        isOn = false;
        System.out.println("The bulb is now off");
    }

    public void getStatus() {
        if (isOn) {
            System.out.println("Light is on");
        } else  {
            System.out.println("Light is not on");
        }
    }

}
