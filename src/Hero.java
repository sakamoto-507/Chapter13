public class Hero {
    private int hp;
    private String name;
    private Sword sword;

    Matango m = new Matango();

    public String getName(){// 追加
        return this.name;
    }
    public void setName(String name) {// 妥当性チェック
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
        }
        this.name = name;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public int getHp(){
        return this.hp;
    }
    public void bye() {
        System.out.println("勇者は別れを告げた");
    }
    private void die() {
        System.out.println(this.getName() + "は死んでしまった！");
        System.out.println("GAME OVERです。");
    }
    public void seppuku() {
        System.out.println(this.getName() + "は切腹した！");
        this.die();
    }
    void sleep() {
        this.setHp(100);
        System.out.println(this.getName() + "の現在のHP: " + hp);
        System.out.println(this.getName() + "は眠って回復した！");
    }
    public void attack(Matango m) {
        System.out.println(this.getName() + "の攻撃！");
        System.out.println(m.getName() + m.suffix + "から100ポイントの反撃を受けた");
        this.setHp(this.getHp() - 100);
        if (this.getHp() <= 0 ) {
            this.die();
        }
    }
}