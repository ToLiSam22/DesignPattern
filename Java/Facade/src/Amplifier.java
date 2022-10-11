public class Amplifier {
    private static final String TAG = "앰프";
    private static final String STEREO_MODE = "스테레오 모드";
    private static final String SURROUND_MODE = "써라운드 모드";
    private Tuner tuner;
    private StreamingPlayer player;
    private String mode = STEREO_MODE;
    private int volume;

    public void on() {
        System.out.println(TAG + " 켜기");
    }

    public void off() {
        System.out.println(TAG + " 끄기");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        this.player = player;
    }

    public void setStereoSound() {
        System.out.println(TAG + " " + STEREO_MODE);
    }

    public void setSurroundSound() {
        System.out.println(TAG + " " + SURROUND_MODE);
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(TAG + " 볼륨 " + volume + "(으)로 설정");
    }

    public String toString() {
        return TAG + "(" + mode + ", 볼륨 " + volume + ")";
    }
}
