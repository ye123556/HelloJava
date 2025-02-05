package chapter07.lecture;
// 20250205
import chapter07.RemoteControl;

public class Television extends RemoteControlDevice {

    // 필드
    private  int volume;

    // 추상 메소드들의 실체 메소드들
    @Override
    public void turnOn() { System.out.println("TV를 켭니다."); }

    @Override
    public void turnOff() { System.out.println("TV를 끕니다."); }

    // 인터페이스 상수를 이용해서 volum 필드의 값을 제한
    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VOLUME)
            this.volume=MAX_VOLUME;
        else if(volume < MIN_VOLUME)
            this.volume = volume;
        else
            this.volume = volume;

            System.out.println("현재 TV 볼륨 : " + this.volume);
    }
}
