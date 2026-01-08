package ch13_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton  channelUpButton = new ChannelUpButton();
//        powerButton.onPressed();
        /*
            버튼들을 만들어서 Main에서 객체 생성을 한 후에
            메서드를 호출하는 것은 가능하다.
            그런데 Main에서 매번 객체를 생성해줘야 한다는 문제점이 있다.

         */

        TvRemoteController tvRemoteController1 = new TvRemoteController(
                new PowerButton(),
                new ChannelDownButton(),
                new ChannelUpButton()
        );      // 선언 하는 방법 생각하기

        /*
            리모컨 객체의 argument로 PowerButton 생성자를 넣었다.
            생성자의 정의 : 객체를 생성할 때 호출되는 특별한 메서드
            new PowerButton()을 통해서 객체가 생성되었다.
            -> 하지만 객체명이 없는 상태

            리모컨 클래스를 확인해보면
            this.powerButton = powerButton이라고 되어있다.
            그 말은 argument로 들어온 new PowerButton()이
            매개변수인 PowerButton powerButton으로 치환되고,
            그것이 리모컨의 field인 powerButton에
            대입된다는 것을 확인할 수 있다.
         */

        // tvRemoteController.powerButton.onPressed();     // chaning (private가 없을 때 가능)

        tvRemoteController1.onPressedPowerButton();      // private이지만 클래스 내부에서 접근하여 onPressed()가 호출됨.
        tvRemoteController1.onPressedChannelDownButton();
        tvRemoteController1.onDownChannelDownButton();
        tvRemoteController1.onPressedChannelUpButton();
        System.out.println(tvRemoteController1.onUpChannelUpButton1());
        tvRemoteController1.onUpChannelUpButton2();
        tvRemoteController1.onPressedPowerButton();

        System.out.println("----------------------------------------------------");

        /*
            VolumeDownButton 클래스 정의하시오
            VolumeUpButton 클래스를 정의하시오

            그리고 Main에서
            tvRemoteController.onPressedVolumeDown(); 을 호출하면
            볼륨을 한 칸 내립니다. 가 출력

            실행 예
                Tv 리모컨 객체가 생성되었습니다.
                전원을 켭니다.
                채널을 한 칸 내립니다.
                채널을 계속 내립니다.
                채널을 한 칸 올립니다.
                채널을 계속 올립니다.
                볼륨을 한 칸 내립니다.
                볼륨을 계속 내립니다.
                볼륨을 한 칸 올립니다.
                볼륨을 계속 올립니다.
                전원을 끕니다.
         */
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChannelDownButton(),
                new ChannelUpButton(),
                new VolumeDownButton(),
                new VolumeUpButton()
        );
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onUpChannelUpButton2();
        tvRemoteController.onPressedVolumeDown();
        tvRemoteController.onDownVolumeDown();
        tvRemoteController.onPressedVolumeUp();
        tvRemoteController.onUpVolumeUp();
        tvRemoteController.onPressedPowerButton();

        System.out.println("-------------------------------------------");
        AirConditionerController airConditionerController = new AirConditionerController(
                new PowerButton(),
                new TemperatureDownButton(),
                new TemperatureUpButton(),
                new ModeChangeButton()
        );
        airConditionerController.onPressedPowerButton();
        airConditionerController.onPressedtemperatureDownButton();
        airConditionerController.onDowntemperatureDownButton();
        airConditionerController.onPressedtemperatureUpButton();
        airConditionerController.onUptemperatureUpButton();
        airConditionerController.onPressedModeChangeButton();
        airConditionerController.onPressedModeChangeButton();
        airConditionerController.onPressedPowerButton();

    }
}
