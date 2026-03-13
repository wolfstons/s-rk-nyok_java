package main.OOP;

public class MegoldasKereso {

    private int osszFej;
    private int max7;
    private int max11;

    private Sarkany hetFeju;
    private Sarkany tizenegyFeju;

    public MegoldasKereso(int osszFej, int max7, int max11) {
        this.osszFej = osszFej;
        this.max7 = max7;
        this.max11 = max11;

        hetFeju = new Sarkany(7);
        tizenegyFeju = new Sarkany(11);
    }

    public void keres() {

        for (int hefdb = 1; hefdb <= max7; hefdb++) {
            for (int tefdb = 1; tefdb <= max11; tefdb++) {

                int osszeg = hefdb * hetFeju.getFejekSzama()
                        + tefdb * tizenegyFeju.getFejekSzama();

                if (osszeg == osszFej) {
                    System.out.println("7 fejű sárkány: " + hefdb);
                    System.out.println("11 fejű sárkány: " + tefdb);
                    System.out.println("----------------------");
                }
            }
        }
    }
}