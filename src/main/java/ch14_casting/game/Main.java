package ch14_casting.game;

import ch14_casting.game.items.*;
import ch14_casting.game.system.Inventory;

public class Main {
    public static void main(String[] args) {
        Inventory inventory1 = new Inventory(new Weapon[10]);
        Inventory inventory2 = new Inventory(15);
        Sword sword1 = new Sword();
        Bow bow1 = new Bow();
        Staff staff1 = new Staff();
        inventory1.addWeapon(sword1);   // inventory1.addWeapon(new Sword());
        inventory1.addWeapon(bow1);
        inventory1.addWeapon(staff1);
        inventory1.attackAll();
        inventory1.useSpecialAbilities();
        inventory1.deleteWeapon("Sword");
        inventory1.showInventory();
        inventory1.deleteWeapon2();

    }
}
