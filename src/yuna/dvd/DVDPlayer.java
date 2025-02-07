package yuna.dvd;

public class DVDPlayer extends Player {

    public DVDPlayer(String media) {
        super(media);
    }

    @Override
    public void play() {
        if(!isPlaying) {
            isPlaying = true;
            System.out.println("DVD 플레이: " + currentMedia);
            currentTime += 30;
        } else {
            System.out.println("DVD가 이미 플레이 중입니다.");
        }
    }

    @Override
    public void pause() {
        if(isPlaying) {
            isPlaying = false;
            System.out.println("DVD 일시정지: " + currentTime + " sec:" + currentMedia);
        } else {
            System.out.println("DVD가 플레이 중이 아닙니다.");
        }
    }

    @Override
    public void resume() {
        if(!isPlaying) {
            isPlaying = true;
            System.out.println("DVD 재개: " + currentTime + " sec:" + currentMedia);
            currentTime += 30;
        } else {
            System.out.println("DVD가 이미 플레이 중입니다.");
        }
    }
}
