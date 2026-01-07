package ch13_abstraction.interfaces;

public class TvRemoteController {
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    // field 자료형에 작성한 클래스가 들어갈 수 있다.
    // 그래서 딸린 메서드를 호출 할 수 있다.
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        System.out.println("Tv 리모컨 객체가 생성되었습니다.");
    }

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
        System.out.println("Tv 리모컨 객체가 생성되었습니다.");
    }

//    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton) {
//        this.powerButton = powerButton;
//        this.channelDownButton = channelDownButton;
//        this.channelUpButton = channelUpButton;
//        System.out.println("Tv 리모컨 객체가 생성되었습니다.");
//    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }
    /*
        onPressedChannelDownButton() 메서드와
        onDownChannelDownButton() 메서드를 정의하시오.,
        정의 방식을 이상을 참조할 것
        Main에서 tvRemoteController.onPressedChannelDown();
        Main에서 tvRemoteController.onDownChannelDown();
        메서들을 호출하시오.
        실행 예
        Tv 리모컨 객체가 생성되었습니다.
        전원을 켭니다.
        채널을 한 칸 내립니다.
        채널을 계속 내립니다.
        전원을 끕니다.

        Tv 리모컨 객체가 생성되었습니다.
        전원을 켭니다.
        채널을 한 칸 내립니다.
        채널을 계속 내립니다.
        채널을 한 칸 올립니다.
        채널을 계속 올립니다.
        전원을 끕니다.
     */
    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }

    public String onUpChannelUpButton1() {
        return channelUpButton.onUp();
    }

    public void onUpChannelUpButton2() {
        System.out.println(channelUpButton.onUp());
    }

    public void onPressedVolumeDown() {
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDown() {
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUp() {
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUp() {
        System.out.println(volumeUpButton.onUp());
    }
}
