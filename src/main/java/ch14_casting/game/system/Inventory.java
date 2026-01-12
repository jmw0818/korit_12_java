package ch14_casting.game.system;

import ch14_casting.game.items.*;       // * 의 발음은 에스터리스크(asterisk 라고 하고, all의 의미를 가짐)
import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class Inventory {
    private Weapon[] weaponSlots;

//    public Inventory(Weapon[] weaponSlots) {
//        this.weaponSlots = weaponSlots;
//    }
    public Inventory(int capacity) {
        this.weaponSlots = new Weapon[capacity];
    }

    public void addWeapon(Weapon weapon) {
        for (int i = 0; i < weaponSlots.length; i++) {
            if (weaponSlots[i] == null) {
                weaponSlots[i] = weapon;
                System.out.println("무기를 추가하였습니다.");
                return;
            }
        }
        System.out.println("인벤토리가 가득 찼습니다.");
    }

    public void deleteWeapon(String weaponName) {
        for (int i = 0; i < weaponSlots.length; i++) {
            if (weaponSlots[i].getClass().getSimpleName().equals(weaponName)) {
                weaponSlots[i] = null;
                System.out.println(weaponName + " 무기를 삭제하였습니다.");
                return;
            }
        }
        System.out.println(weaponName + " 무기가 존재하지 않습니다.");
    }
    public void deleteWeapon2() {
        Scanner scanner = new Scanner(System.in);
        showInventory();
        System.out.print("몇번 무기를 삭제하시겠습니까? >>> ");
        int num = scanner.nextInt();
        if (weaponSlots[num-1] == null) {
            System.out.println("삭제할 무기가 없습니다.");
        } else {
            weaponSlots[num-1] = null;
            System.out.println(num + "번 무기를 삭제하였습니다.");
            showInventory();
        }
    }

    public void attackAll() {
        for (Weapon weapon : weaponSlots) {
            if (weapon != null) {
                weapon.attack();
            }
        }
    }

    public void useSpecialAbilities() {
        for (Weapon weapon : weaponSlots) {
            if (weapon instanceof Sword) {
                ((Sword) weapon).parry();
            }
            else if (weapon instanceof Bow) {
                ((Bow) weapon).snipe();
            }
            else if (weapon instanceof Staff) {
                ((Staff) weapon).castSpell();
            }
        }
    }

    public void showInventory() {
        int num = 1;
        System.out.println(" [ " + this.getClass().getSimpleName() + " ] ");
        for (Weapon weapon : weaponSlots) {
            if (num < 10) {
                if (weapon == null) {
                    System.out.print(" [" + num + "] ...  ");
                } else if (weapon.getClass().getSimpleName().equals("Bow")) {
                    System.out.print(" [" + num + "] " + weapon.getClass().getSimpleName() + "  ");
                } else {
                    System.out.print(" [" + num + "] " + weapon.getClass().getSimpleName());
                }
            } else {
                if (weapon == null) {
                    System.out.print(" [" + num + "] ... ");
                } else if (weapon.getClass().getSimpleName().equals("Bow")) {
                    System.out.print(" [" + num + "] " + weapon.getClass().getSimpleName() + " ");
                } else {
                    System.out.print(" [" + num + "] " + weapon.getClass().getSimpleName());
                }
            }
            if (num % 5 == 0) {
                System.out.println();
            }
            num++;
        }
    }
}
