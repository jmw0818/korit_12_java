package ch14_casting.centralcontrol;

public class CentralControl  {
    // field 선언
    private Power[] deviceArray;     //

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    /*
        deviceArray에 element를 추가하는 메서드를 작성할건데,
        배열의 특성 상 lastIndex+1 개의 방을 가지게 될것임.
        그런데 5개의 방을 가지고 있는데 6개째의 Power 하위 클래스의 객체를 집어넣게 되면
        오류가 발생하기 때문에
        배열에 비어있는 곳이 있는지 체크하는 메서드를 먼저 만들 것이다.
        1. deviceArray 필드 내에 비어있는 방이 있는지 체크
        2. 비어있다면 추가
        3. 없다면 거절
     */

    public void addDevice(Power device) {
        // 1. 비어있는지 체크
        int emptyIndex = checkEmpty();
//        int emptyIndex = 0;
//        for (int i = 0; i < devicArray.length; i++ ) {
//            if (devicArray[i] == null) {
//                emptyIndex = i;
//            } else {
//                emptyIndex = -1;
//            }
//        }

        // 2. 비어있으면 추가, 없다면 거절 (조건문)
        if (emptyIndex == -1) {
            System.out.println("더이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 추가되었습니다.");
        /*
            .getClass() : 클래스명을 return하는 method -> 패키지명.클래스 형태로 return
            .getclass().getSimpleName() : 클래스명만 return
         */
    }

    private int checkEmpty() {
        for (int i = 0; i < deviceArray.length; i++ ) {
            if (deviceArray[i] == null) return i;
        }
        return -1;
    }
    /*
        Java의 index 넘버에는 음수값이 없기때문에 (Python 에는 있지만)
        실패를 나타낼 때는 -1을 쓰는 경우가 많다. 하지만 0과 가까운 수이다보니
        조직에 따라서 -100이라든지 return이 나올 수 없을 만한 음수값을 지정하는 경우도 있다.
     */

    /*
        deviceArray는 Power[] 배열로 이루어져 있다.
        -> 그렇다면 interface Power 내부에 .on()이라는 메서드가 있으므로
        Power[] 배열 내에 있는 element들은 전부 .on() 메서드를 강제로 구현해야 한다.
        객체명.on();을 호출해주기만 한다면 deviceArray() 내부에 있는 element들은 전부 전원이 켜지겠다.
     */
    public void powerOn() {
        for (int i = 0; i < deviceArray.length; i++ ) {
//          if (deviceArray[i] instanceof Power)   // 신경 쓸 필요는 없음
            if (deviceArray[i] == null ) {
                System.out.println("장치가 없어 실행하지 못했습니다.");
                continue;   // break;는 반복문을 즉시 종료하는 명령어
                            // return;은 method를 즉시 종료하는 명령어
                            // continue;는 '현재 반복만' 종료하고 다음 반복으로 넘어감
            } deviceArray[i].on();
        }
    }
    /*
        powerOff() 메서드를 정의하고, Main에서 호출하시오.
        단 배열 내부를 탐색할 때 향상된 for문으로 작성하시오.
        장치가 없어 전원을 끌 수 없습니다.

     */
    public void powerOff() {
        for (Power device : deviceArray) {
            if (device == null ) {
                System.out.println("장치가 없어 전원을 끌 수 없습니다.");
                continue;
            }
            device.off();
        }
    }

    public void showInfo() {
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null ) {
                System.out.println("슬롯 [ " + (i+1)  + " ] 번 : Empty" );
            } else
                System.out.println("슬롯 [ " + (i+1)  + " ] 번 : " + deviceArray[i].getClass().getSimpleName());
        }
    }

    // 다운캐스팅 관련 - 즉 Power[]의 내부 element의 고유 메서드 호출
    public void performSpecificMethod() {
        for (Power device : deviceArray) {
            if (device instanceof AirConditioner) {
                AirConditioner airConditioner = (AirConditioner) device;    // 다운캐스팅
                airConditioner.changeMode();
            } else if (device instanceof Computer){
                Computer computer = (Computer) device;
                computer.compute();
            } else if (device instanceof LED) {
                LED led = (LED) device;
                led.changeColor();
            } else if (device instanceof Mouse){
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            } else if (device instanceof Printer) {
                Printer printer = (Printer) device;
                printer.print();
            } else if (device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            }
            else if (device == null) {
                System.out.println("연결되어 있지 않습니다.");
            }
            else {
                System.out.println("아직 지원되지 않는 전자기기입니다.");
            }
        }
    }

    public void deleteDevice1(String deviceName) {
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) continue;
            if (deviceArray[i].getClass().getSimpleName().equals(deviceName)) {
                System.out.println("슬롯 [ " + (i+1) + " ] 번 " + deviceArray[i].getClass().getSimpleName() + "이(가) 삭제되었습니다.");
                deviceArray[i] = null;
//                break;   // 먼저 나오는거 하나만 없앨 거면
            }
        }
    }

    public void deleteDevice2(int number) {
        if (deviceArray[number-1] == null) {
            System.out.println("연결되어 있지 않습니다.");
        } else {
            System.out.println("슬롯 [ " + (number) + " ] 번 " + deviceArray[number-1].getClass().getSimpleName() + "이(가) 삭제되었습니다.");
            deviceArray[number-1] = null;
        }
    }

    /*
        Printer 클래스와 Speaker 클래스를 생성하고 Power를 implement하시오.
        Printer의 고유 메서드는 print() - 프린터가 인쇄를 합니다.
        Speaker의 고유 메서드는 changeEqual() - 스피커의 이퀄라이저를 변경합니다.

        Main에서 Printer / Speaker 인스턴스를 deviceArray에 추가하고
        .powerOn()
        .powerOff()
        .showInfo()
        .performSpecificMethod()
     */

}
