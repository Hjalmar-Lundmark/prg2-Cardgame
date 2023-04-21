import java.util.ArrayList;

public abstract class Card {
    private String name;
    private int HP;
    private int magic;
    private int acc;
    private int str;
    private int sneak;

    public abstract String playAgainst(Card c);

    public static void main(String[] args) {
        Warrior Aragon = new Warrior("Aragon", 8, 1, 6, 9, 2);
        Mage Gandalf = new Mage("Gandalf", 4, 8, 7, 3, 5);
        Archer Legolas = new Archer("Legolas", 5, 4, 9, 6, 7);
        Thief Frodo = new Thief("Frodo", 4, 2, 5, 4, 7);

        System.out.println(Aragon.getName() + " " + Aragon.playAgainst(Gandalf) + " AGAINST " + Gandalf.getName());
        System.out.println(Frodo.getName() + " " + Frodo.playAgainst(Aragon) + " AGAINST " + Aragon.getName());


        System.out.println("\nRandom battle between the Fellowship and the Bad guys");
        ArrayList<Card> fellowship = new ArrayList<>();
        fellowship.add(Aragon);
        fellowship.add(Gandalf);
        fellowship.add(Legolas);
        fellowship.add(Frodo);

        Warrior Gothmog = new Warrior("Gothmog", 8, 1, 4, 6, 2);
        Mage Sauron = new Mage("Sauron", 6, 7, 5, 3, 4);
        Archer Lurtz = new Archer("Lurtz", 7, 3, 6, 4, 3);
        Thief Smeagol = new Thief("Smeagol", 3, 2, 4, 4, 6);
        ArrayList<Card> BadGuys = new ArrayList<>();
        BadGuys.add(Gothmog);
        BadGuys.add(Sauron);
        BadGuys.add(Lurtz);
        BadGuys.add(Smeagol);

        Card GoodGuy = fellowship.get((int) (Math.random()*fellowship.size()));
        Card BadGuy = BadGuys.get((int) (Math.random()*fellowship.size()));
        System.out.println(GoodGuy.getName() + " " + GoodGuy.playAgainst(BadGuy) + " AGAINST " + BadGuy.getName());
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
