package ti_regsore.pkg22205039.latihan30.cakep;
/*
NAMA    : Syahrul Izzazi
NIM     : 22205039
PRODI   : TI RegSore
DESKRIPSI : Cakep
*/
import java.util.Scanner;
public class TI_RegSore22205039Latihan30Cakep {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\u001b[31mKamu \u001b[32mNgerjain Sendiri \u001b[33mLatihan \u001b[34m17 Sampai 30 \u001b[36mIni ? ");
        System.out.print("\u001b[33mJawab \u001b[32m(Yoi/Engga ) : ");
        String Jawab = input.nextLine();
        if (Jawab.equalsIgnoreCase("yoi")){
            System.out.println("");
            System.out.println("\u001b[33mCakep Bener, \u001b[32mGod Job");
        }else {
            System.out.println("\u001b[33mTetep \u001b[32mCakep Sih");
        }
    }
}