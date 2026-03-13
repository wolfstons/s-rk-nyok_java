package teljesOOP;

public class program {

    public static void main(String[] args) {
        KettoIsmeretlenesEggyenlet egyenlet
                = new KettoIsmeretlenesEggyenlet(7, 11, 145);

        BruteForceMegoldo megoldo
                = new BruteForceMegoldo(egyenlet);

        megoldo.megoldo(20, 20);
        
        Megoldas[] m =megoldo.getMegoldasok();
        
        for (int i = 0; i < megoldo.getDb(); i++) {
            System.out.println(m[i].allapot());
        }

    }
}
