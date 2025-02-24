import java.util.Scanner;

class elsegi4 {
    private double pjg;
    private double lbr; 

    public elsegi4(double pjg, double lbr) { 
        this.pjg = pjg;
        this.lbr = lbr;
    }

    public double getPJG(){
        return pjg;
    }
    public double getLBR(){
        return lbr;
    }

}

class elkeliling {
    public static double itung(elsegi4 segi4){
        return 2*(segi4.getPJG() + segi4.getLBR());
    }
}

class elluas {
    public static double itung(elsegi4 segi4){
        return segi4.getPJG() * segi4.getLBR();
    }
}

class eldiagonal {
    public static double itung(elsegi4 segi4){
        return Math.sqrt(Math.pow(segi4.getPJG(),2)+ Math.pow(segi4.getLBR(),2));
    }

}

public class elbunder {
    public static void main(String[] args) {
        Scanner el = new Scanner(System.in);
        boolean lanjut = true;

        System.out.println("=================== EL KALKULATOR HANDAL ===================");
        System.out.println("Yak trimakasih udh subscribe kalkulator handal versi 0.02.segiempat");

        while (lanjut) {
            System.out.println("\nMasukkan panjang segiempat: ");
            double panjang = el.nextDouble();
            System.out.println("Masukkan lebar segiempat: ");
            double lebar = el.nextDouble();

            elsegi4 segiempat = new elsegi4(panjang, lebar);

            System.out.println("\nPilih perhitungan yang ingin dilakukan:");
            System.out.println("1. Hitung Keliling");
            System.out.println("2. Hitung Luas");
            System.out.println("3. Hitung Panjang Diagonal");
            System.out.println("4. Keluar");

            System.out.print("Pilihanmu: ");
            int pilih = el.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Keliling: " + elkeliling.itung(segiempat));
                    break;
                case 2:
                    System.out.println("Luas: " + elluas.itung(segiempat));
                    break;
                case 3:
                    System.out.println("Panjang Diagonal: " + eldiagonal.itung(segiempat));
                    break;
                case 4:
                    lanjut = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
     }

            if (lanjut) {
                System.out.println("\nMau hitung lagi? (1. Yes King/ 2. Ga Deh)");
                String jawab = el.next();
                if (jawab.equalsIgnoreCase("2")) {
                    lanjut = false;
                }
            }
        }

        System.out.println("Okedeh makasih udh pake apk ini. Jangan lupa rate ya!");
        el.close();
    }
}



// class Bunder {
//     private double jari2;
//     public Bunder(double jari2){
//         this.jari2 = jari2;}

//     public double itungLuas(){
//         return Math.PI * jari2 * jari2;
//     }
// }

// public class elbunder {
//     public static void main(String[] args) {
//         Scanner bunder = new Scanner(System.in);

//         System.out.println("=================== EL KALKULATOR HANDAL ===================");
//         System.out.println("Yak trimakasih udh subscribe kalkulator handal versi 0.01.lingkaran");
//         System.out.println("Yok hitung luas lingkaranmu!");
//         System.out.println("1. Yok / 2. Gajadi deh");

//         String eljawab = bunder.nextLine();
        
//         if (eljawab.equals("1")){
//             System.out.println("Masukkan jari jarinya");
//             double jari2 = bunder.nextDouble();

//             Bunder yourbunder = new Bunder(jari2);
//             System.out.println("Luas lingkaranmu : " + yourbunder.itungLuas());
//         }

//         else {
//             System.out.println("Okedeh balik lagi kalo butuh bantuan yaa!");
//         }
//         bunder.close();
//     }
// }

