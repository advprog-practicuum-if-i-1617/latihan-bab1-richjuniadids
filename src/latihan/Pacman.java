package latihan;

/**
 *
 * @author richjuniadi
 */
public class Pacman {
    
    private int x1,y1;
    private int x,y = 0;
    private int langkah = 10;
    private int poin = 0;
    private String s;
    
    public void setLangkah(){
        x1 += x;
        y1 += y;
        x = 0;
        y = 0;
    }
    
    public void setLangkah(String s) {
        if (s.equalsIgnoreCase("w")) {
            x--;
        } else if (s.equalsIgnoreCase("s")) {
            x++;
        } else if (s.equalsIgnoreCase("d")) {
            y++;
        } else if (s.equalsIgnoreCase("a")) {
            y--;
        }
    }
    
    public void displayMessage(){
        System.out.println("Jumlah Langkah" + langkah);
        System.out.print("(w,a,s,d)>>  ");
        System.out.println("poin : " + poin);
        System.out.println("=================================");
        setLangkah(s);
        setLangkah();
    }
    
    public void poinLangkah(){
           langkah--;
            if (poin == 3) {
                System.out.println("YOU WIN!!");
            }
            if (langkah== 0) {
                System.out.println("Jumlah Langkah = 0");
                System.out.println("YOU LOSE!!");
            }
    }
    
    int[][] peta = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                   {1, 0, 0, 0, 3, 0, 0, 0, 2, 1},
                   {1, 1, 0, 0, 3, 1, 1, 1, 1, 1},
                   {1, 0, 0, 3, 0, 0, 0, 0, 0, 1},
                   {1, 1, 0, 3, 0, 1, 0, 0, 1, 1},
                   {1, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                   {1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                   {1, 0, 0, 1, 1, 0, 0, 0, 0, 1},
                   {1, 0, 0, 0, 1, 1, 0, 0, 0, 1},
                   {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

    public void karakter() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (peta[i][j] == 1) {
                    System.out.print("#");
					} else if (peta[i][j] == 2) {
                    System.out.print("☺");
					} else if (peta[i][j] == 3) {
                    System.out.print("*");
					} else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

    public void cekposisi() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (peta[i][j] == 2) {
                    x1 = i;
                    y1 = j;
                    break;
                }
            }
        }
    }

    public void shift() {
          if (peta[x1][y1] == 1) {
        } else {            
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (peta[i][j] == 2) {
                        peta[i][j] = 0;
                        break;
                    }                    
                }
            }
            
            if (peta[x1][y1] == 3) {
                langkah++;
                poin++;                          
            }                
            peta[x1][y1] = 2;
        }
    }
        
    

     
}
    
    
    

