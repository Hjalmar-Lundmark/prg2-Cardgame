public class Card {
    private String name;
    private int HP;
    private int magic;
    private int acc;
    private int str;

    //public String playAgainst(Card c);

    public static void main(String[] args) {
        Warrior w = new Warrior("Aragon", 7, 1, 6, 9);
        Mage m = new Mage("Gandalf", 4, 8, 7, 3);
        Archer a = new Archer("Legolas", 5, 4, 9, 6);
        Thief t = new Thief("Smeagol", 4, 3, 6, 6);

        System.out.println(w.getName() + " " + w.playAgainst(m) + " AGAINST " + m.getName());


    }

    public Card(String name, int HP, int magic, int acc, int str) {
        this.name = name;
        this.HP = HP;
        this.magic = magic;
        this.acc = acc;
        this.str = str;
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
}
