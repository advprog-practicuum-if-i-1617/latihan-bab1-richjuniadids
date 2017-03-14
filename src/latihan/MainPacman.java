package latihan;

/**
 *
 * @author richjuniadi
 */
import java.util.Scanner;
public class MainPacman {
public static void main(String[] args) 
    {
        Pacman pacman1 = new Pacman ();
        Scanner a = new Scanner (System.in);
        String pilihan="m";
        while (pilihan.equals("m")){
            System.out.print("Masukkan m untuk memulai k keluar : ");
            pilihan = a.next();
            if (pilihan.equals("m"))
            {
                pacman1.cekposisi();
                pacman1.karakter();
                pacman1.shift();
                pacman1.poinLangkah();
                pacman1.displayMessage();
                }
            }
        }
    }    
