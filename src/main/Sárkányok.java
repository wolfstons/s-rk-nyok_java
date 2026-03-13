package main;

public class Sárkányok {

    public static void main(String[] args) {
        int max7Feju=19;
        int max11Feju=13;
        int oszfej=145;
        int fej7=7;
        int fej11=11;
        for(int hefdb=1;hefdb<=19;hefdb++){
            for(int tefdb=1;tefdb<=13;tefdb++){
                if(hefdb*fej7+tefdb*fej11==145){
                    System.out.println("7feju"+hefdb);
                    System.out.println("10feju"+tefdb);
                    System.out.println("----------------------");
                }
            }
        }
        
        

    }

}
