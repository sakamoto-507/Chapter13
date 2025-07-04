public class Matango {
    private int hp;
    private String name;
    final int LEVEL = 10;
    char suffix;
    public void setStatus(String n,int h,char c) {
        name = n;
        hp = h;
        suffix = c;
    }
    public String getName(){
        return this.name;
    }
    public void run() {
        System.out.println(this.name + this.suffix + "は逃げ出した！");
    }
}
