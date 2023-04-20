public class Archer extends Card{

    public Archer(String name, int HP, int magic, int acc, int str) {
        super(name, HP, magic, acc, str);
    }

    public String playAgainst(Card c) {
        if (this.getAcc() > c.getHP()) {
            return "WIN";
        } else if (this.getHP() < c.getMagic()) {
            return "LOSE";
        } else {
            return "DRAW";
        }
    }
}
