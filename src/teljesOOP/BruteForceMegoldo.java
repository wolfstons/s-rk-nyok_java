package teljesOOP;

public class BruteForceMegoldo {

    private KettoIsmeretlenesEggyenlet eggyenlet;

    public BruteForceMegoldo(KettoIsmeretlenesEggyenlet eggyenlet) {
        this.eggyenlet = eggyenlet;
    }

    public void megoldo(int maxX, int maxY) {

        for (int x = 0; x <= maxX; x++) {
            for (int y = 0; y <= maxY; y++) {

                if (eggyenlet.megoldasE(x, y)) {

                    Megoldas m = new Megoldas(x, y);
                    System.out.println(m.allapot());

                }

            }
        }
    }
}