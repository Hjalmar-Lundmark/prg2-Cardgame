public class Archer extends Card{

    public Archer(String name, int HP, int magic, int acc, int str, int sneak) {
        super(name, HP, magic, acc, str, sneak);
    }

    public String playAgainst(Card c) {
        if (this.getAcc() >= c.getHP()) {
            return "WIN";
        } else if (this.getHP() <= c.getMagic() || this.getHP() <= c.getAcc() || this.getHP() <= c.getStr() || this.getHP() <= this.getSneak()) {
            return "LOSE";
        } else {
            return "DRAW";
        }
    }
}
