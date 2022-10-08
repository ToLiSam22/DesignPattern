public class Projector {
    private static final String TAG = "프로젝터";
    private static final String TV_MODE = "TV 모드";
    private static final String WIDESCREEN_MODE = "와이드스크린 모드";
    private StreamingPlayer player;
    private String mode;

    public void on() {
        System.out.println(TAG + " 켜기");
    }

    public void off() {
        System.out.println(TAG + " 끄기");
    }

    public void setInput(StreamingPlayer player) {
        this.player = player;
    }

    public void tvMode() {
        mode = TV_MODE;
        System.out.println(TAG + " " + TV_MODE);
    }

    public void wideScreenMode() {
        mode = WIDESCREEN_MODE;
        System.out.println(TAG + " " + WIDESCREEN_MODE);
    }

    public String toString() {
        return TAG + "(" + mode + ")";
    }

}
