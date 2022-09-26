public class StreamingPlayer {
    private static final String TAG = "플레이어";
    private Amplifier amplifier;

    public void on() {
        System.out.println(TAG + " 켜기");
    }

    public void off() {
        System.out.println(TAG + " 끄기");
    }

    public void pause() {
        System.out.println(TAG + " 일시정지");
    }

    public void play(String contents) {
        System.out.println(TAG + "로 " + contents + " 재생");
    }

    public void setSurroundAudio() {
        System.out.println(TAG + " 써라운드 오디오");
    }

    public void setTwoChannelAudio() {
        System.out.println(TAG + " 투채널 오디오");
    }

    public void stop() {
        System.out.println(TAG + " 정지");
    }

    public String toString() {
        return TAG;
    }

}
