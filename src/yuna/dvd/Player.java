package yuna.dvd;


public abstract class Player implements Playable {
    protected String currentMedia;
    protected boolean isPlaying;
    protected int currentTime;
    // protected int length;

    // region 생성자, getter
    public Player(String media) {
        this.currentMedia = currentMedia;
        this.isPlaying = false;
        this.currentTime = 0;
    }

    public String getCurrentMedia() {
        return currentMedia;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public int getCurrentTime() {
        return currentTime;
    }
    // endregion

    @Override
    public void stop() {
        isPlaying = false;
        currentTime = 0; // 정지 시 초기화
        System.out.println("Stopped: " + currentMedia);
    }
}
