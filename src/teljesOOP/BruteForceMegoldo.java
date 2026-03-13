package teljesOOP;

public class BruteForceMegoldo {

    private KettoIsmeretlenesEggyenlet eggyenlet;
    private Megoldas[] megoldasok;
    int db;

    public BruteForceMegoldo(KettoIsmeretlenesEggyenlet eggyenlet) {
        this.eggyenlet = eggyenlet;
        megoldasok= new Megoldas[100];
        db=0;
    }

    public void megoldo(int maxX, int maxY) {

        for (int x = 0; x <= maxX; x++) {
            for (int y = 0; y <= maxY; y++) {

                if (eggyenlet.megoldasE(x, y)) {

                    megoldasok[db] = new Megoldas(x, y);
                    db++;
                }

            }
        }
    }
    public Megoldas[] getMegoldasok(){
        return megoldasok;
    }
    
    public int getDb(){
        return  db;
    }
}