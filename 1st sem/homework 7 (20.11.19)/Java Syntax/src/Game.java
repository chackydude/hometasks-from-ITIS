import com.danay.Healer;
import com.danay.ITIS.Fighter;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Game begins!");
        Fighter fighter1 = new Fighter("John", "Prepare for die!");
        Fighter fighter2 = new Fighter("Sam", "Stfu bastard!");
        Healer healer = new Healer("Mercy", "I will heal u!");
        fighter1.shoutBattleCry();
        fighter2.shoutBattleCry();
        Scanner  input = new Scanner(System.in);
        while (fighter1.hp > 0 && fighter2.hp > 0) {
            System.out.println("Enter power of fighter1:");
            int powerF1 = input.nextInt();
            fighter1.kick(fighter2, powerF1);
            if (fighter2.checkStatus() == "hurt") {
                fighter2.callHealer();
                healer.heal(fighter2);
            }
            System.out.println("Enter power of fighter2:");
            int powerF2 = input.nextInt();
            fighter2.kick(fighter1, powerF2);
            if (fighter1.checkStatus() == "hurt") {
                fighter1.callHealer();
                healer.heal(fighter1);
            }
            if (fighter1.hp <= 0) {
                System.out.println("Fighter2 win!");
                fighter2.shoutBattleCry();
            } else if (fighter2.hp <= 0) {
                System.out.println("Fighter1 win!");
                fighter1.shoutBattleCry();
            }
        }
    }
}
