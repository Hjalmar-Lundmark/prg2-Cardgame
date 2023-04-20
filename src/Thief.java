public class Thief extends Card {

    public Thief(String name, int HP, int magic, int acc, int str) {
        super(name, HP, magic, acc, str);
    }

    public String playAgainst(Card c) {
        if (this.getStr() > c.getHP()) {
            return "WIN";
        } else if (this.getStr() < c.getMagic()) {
            return "LOSE";
        } else {
            return "DRAW";
        }
    }
}
