public abstract class Card {
    private String name;
    private int HP;
    private int magic;
    private int acc;
    private int str;
    private int sneak;

    public abstract String playAgainst(Card c);

    public static void main(String[] args) {
        Warrior w = new Warrior("Aragon", 7, 1, 6, 9, 2);
        Mage m = new Mage("Gandalf", 4, 8, 7, 3, 5);
        Archer a = new Archer("Legolas", 5, 4, 9, 6, 7);
        Thief t = new Thief("Smeagol", 4, 2, 5, 4, 7);

        System.out.println(w.getName() + " " + w.playAgainst(m) + " AGAINST " + m.getName());
        System.out.println(a.getName() + " " + a.playAgainst(t) + " AGAINST " + t.getName());

    }

    public Card(String name, int HP, int magic, int acc, int str, int sneak) {
        this.name = name;
        this.HP = HP;
        this.magic = magic;
        this.acc = acc;
        this.str = str;
        this.sneak = sneak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getSneak() {
        return sneak;
    }

    public void setSneak(int sneak) {
        this.sneak = sneak;
    }
}
