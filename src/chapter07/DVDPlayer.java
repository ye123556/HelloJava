package chapter07;

public class DVDPlayer implements Playable {

// 필드

    boolean pause; // 일시정지
    int currentPos; // 현재 플레이어되고있는 위치
    protected String title;
    protected int volume;
    protected int load;
    // 생성자

    public DVDPlayer(boolean pause, int currentPos) {
        this.pause = false;
        this.currentPos = 0;
    }

    public DVDPlayer(String title) {
        this.title = title;

    }



    public int getVolume() {
        return volume;
    }



    public String getTitle() {
        return title;
    }

    public void setLoad(int load) {
        if (load >= 0 && load <= 100) { // 0~100%
            this.load = load;
            System.out.println("로딩이 " + load + "% 입니다.");
        }
    }

    public void setPause(boolean pause) { // ?엥?
        /*if(pause == false) {
            System.out.println("동영상이 재생됩니다.");
            play();
        } else{
            System.out.println("동영상이 멈춤니다.");
            stop();
        }*/
            this.pause = pause;
    }

    public void setCurrentPos(int currentPos) {
        this.currentPos = currentPos;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("볼륨이 " + volume + "으로 설정되어있습니다.");
        }
    }

    @Override
    public void play() {
        if (currentPos > 0) {
            System.out.println(getTitle() + "영상이 재생되었습니다.");
        } else
            System.out.println("재생할 영상이 없습니다.");
    }

    @Override
    public void stop() {
        setLoad(100);
        System.out.println("영상이 끝났습니다.");

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

}
