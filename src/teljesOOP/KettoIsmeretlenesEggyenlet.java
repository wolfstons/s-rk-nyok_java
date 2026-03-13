package teljesOOP;

public class KettoIsmeretlenesEggyenlet {

    private int a, b, c;

    public KettoIsmeretlenesEggyenlet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public boolean megoldasE(int x, int y) {
        return a * x + b * y == c;
    }
}
