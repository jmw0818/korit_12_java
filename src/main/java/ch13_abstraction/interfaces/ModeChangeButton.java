package ch13_abstraction.interfaces;

public class ModeChangeButton extends Button{
    private boolean hotmode;
    boolean mode = false;

    @Override
    public void onPressed() {
        if (mode) {
            mode = false;
            System.out.println("냉방으로 바뀝니다.");
        } else {
            mode = !mode;
            System.out.println("난방으로 바뀝니다.");
        }
    }
}
