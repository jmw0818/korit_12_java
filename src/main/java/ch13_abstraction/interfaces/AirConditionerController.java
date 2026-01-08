package ch13_abstraction.interfaces;

public class AirConditionerController {
    private PowerButton powerButton;
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;
    private ModeChangeButton modeChangeButton;

    public AirConditionerController(PowerButton powerButton, TemperatureDownButton temperatureDownButton, TemperatureUpButton temperatureUpButton, ModeChangeButton modeChangeButton) {
        this.powerButton = powerButton;
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
        this.modeChangeButton = modeChangeButton;
        System.out.println("에어컨 리모컨 객체가 생성되었습니다.");
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedtemperatureDownButton() {
        temperatureDownButton.onPressed();
    }

    public void onDowntemperatureDownButton() {
        temperatureDownButton.onDown();
    }

    public void onPressedtemperatureUpButton() {
        temperatureUpButton.onPressed();
    }

    public void onUptemperatureUpButton() {
        System.out.println(temperatureUpButton.onUp());
    }

    public void onPressedModeChangeButton() {
        modeChangeButton.onPressed();
    }
}