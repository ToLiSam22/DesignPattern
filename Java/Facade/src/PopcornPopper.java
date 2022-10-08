public class PopcornPopper {
    private static final String TAG = "팝콘기계";
    private boolean isOn = false;

    public void on() {
        isOn = true;
        System.out.println(TAG + " 켜기");
    }

    public void off() {
        isOn = false;
        System.out.println(TAG + " 끄기");
    }

    public void pop() {
        if (isOn) {
            System.out.println("팝콘 튀기기");
        } else {
            System.out.println(TAG + " no response");
        }
    }

    public String toString() {
        return TAG;
    }
}
