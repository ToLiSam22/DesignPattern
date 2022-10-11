public class Screen {
    private static final String TAG = "스크린";
    private boolean isDown = false;

    public void up() {
        isDown = false;
        System.out.println(TAG + " 올리기");
    }

    public void down() {
        isDown = true;
        System.out.println(TAG + " 내리기");
    }

    public String toString() {
        return TAG;
    }
}
