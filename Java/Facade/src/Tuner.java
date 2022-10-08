public class Tuner {
    private static final String TAG = "튜너";
    private static final String AM_MODE = "AM모드";
    private static final String FM_MODE = "FM모드";
    private Amplifier amplifier;
    private String mode = AM_MODE;
    private double frequency;
    
    public void on() {
        System.out.println(TAG + " 켜기");
    }

    public void off() {
        System.out.println(TAG + " 끄기");
    }

    public void setAm() {
        System.out.println(TAG + " " + AM_MODE);
    }

    public void setFm() {
        System.out.println(TAG + " " + FM_MODE);
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
        System.out.println(TAG + " 주파수 " + frequency + "(으)로 설정");
    }

    public String toString() {
        return TAG + "(" + mode + ", 주파수 " + frequency + ")";
    }

}
