public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.setName("ミナト");
        h.setHp(40);
        Matango m = new Matango();
        m.setStatus("お化けキノコ",20,'A');


        System.out.println(h.getName() + "の現在のHP: " + h.getHp());
        King k = new King();
        k.talk(h);
        Inn i = new Inn();
        System.out.println("宿屋で回復中...");
        i.checkIn(h);
        h.attack(m);
    }
}