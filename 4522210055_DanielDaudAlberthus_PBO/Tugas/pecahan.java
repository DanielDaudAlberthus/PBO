package Tugas;

public class pecahan {
    public static void main(String[] args) {
        int pemb1, peny1, pemb2, peny2, oper, xpeny;
        int xpemb1, xpemb2, tambah, kurang, kali, bagi1, bagi2;

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Masukkan Pembilang 1 : ");
        pemb1 = input.nextInt();

        System.out.print("Masukkan Penyebut 1 : ");
        peny1 = input.nextInt();

        System.out.print("Masukkan Pembilang 2 : ");
        pemb2 = input.nextInt();

        System.out.print("Masukkan Penyebut 2 : ");
        peny2 = input.nextInt();

        System.out.print("Masukkan Operasi | 1 = + | 2 = - | 3 = x | 4 = / | : ");
        oper = input.nextInt();

        xpeny = peny1 * peny2;
        xpemb1 = (xpeny / peny1) * pemb1;
        xpemb2 = (xpeny / peny2) * pemb2;
        tambah = xpemb1 + xpemb2;
        kurang = xpemb1 - xpemb2;
        kali = pemb1 * pemb2;
        bagi1 = pemb1 * peny2;
        bagi2 = pemb2 * peny1;

        if (oper == 1) {
            System.out.println(pemb1 + "   " + pemb2 + "   " + tambah);
            System.out.println("- + - = -");
            System.out.println(peny1 + "   " + peny2 + "   " + xpeny);
        }

        else if (oper == 2) {
            System.out.println(pemb1 + "   " + pemb2 + "   " + kurang);
            System.out.println("- - - = -");
            System.out.println(peny1 + "   " + peny2 + "   " + xpeny);
        }

        else if (oper == 3) {
            System.out.println(pemb1 + "   " + pemb2 + "   " + kali);
            System.out.println("- x - = -");
            System.out.println(peny1 + "   " + peny2 + "   " + xpeny);
        }

        else if (oper == 4) {
            System.out.println(pemb1 + "   " + pemb2 + "   " + bagi1);
            System.out.println("- / - = -");
            System.out.println(peny1 + "   " + peny2 + "   " + bagi2);
        }

        else {
            System.out.println("INPUT YANG ANDA MASUKKAN SALAH!");
        }
    }
}
