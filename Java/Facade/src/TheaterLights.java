public class TheaterLights {
    private static final String TAG = "조명";
    private boolean isOn = false;
    private int dim = 5;

    public void on() {
        isOn = true;
        System.out.println(TAG + " 켜기");
    }

    public void off() {
        isOn = false;
        System.out.println(TAG + " 끄기");
    }

    public void dim(int dim) {
        if (isOn) {
            this.dim = dim;
            System.out.println(TAG + " 밝기" + dim + "(으)로 설정");    
        } else {
            System.out.println(TAG + " no response");
        }
    }

    public String toString() {
        return TAG + "(밝기 " + dim + ")";
    }

}
