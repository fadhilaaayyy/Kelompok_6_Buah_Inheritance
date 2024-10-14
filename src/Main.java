/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Main {

    public static void main(String[] args) {
        Kelengkeng fr = new Kelengkeng();

        fr.setNama("Kelengkeng");
        fr.setWarna("kuning");
        fr.setBentuk("bulat");
        fr.setRasa("manis");
        fr.setUkuran("kecil");
        fr.setSimbolis("Lambang Negara");

        System.out.println("\n\t\t\tKelengkeng");
        System.out.println("Nama              : " + fr.getNama());
        System.out.println("Warna             : " + fr.getWarna());
        System.out.println("Bentuk            : " + fr.getBentuk());
        System.out.println("Rasa              : " + fr.getRasa());
        System.out.println("Ukuran            : " + fr.getUkuran());
        System.out.println("Simbolis          : " + fr.getSimbolis());
        
        Apel ap = new Apel();

        ap.setNama("Apel");
        ap.setWarna("merah");
        ap.setBentuk("bulat");
        ap.setRasa("manis");
        ap.setUkuran("sedang segenggam tangan");
        ap.setTekstur_kulit("halus dan bisa dimakan");

        System.out.println("\n\t\t\tApel");
        System.out.println("Nama              : " + ap.getNama());
        System.out.println("Warna             : " + ap.getWarna());
        System.out.println("Bentuk            : " + ap.getBentuk());
        System.out.println("Rasa              : " + ap.getRasa());
        System.out.println("Ukuran            : " + ap.getUkuran());
        System.out.println("halus dan bisa dimakan         : " + ap.getTekstur_kulit());
        
        Pisang ps = new Pisang();

        ps.setNama("Pisang");
        ps.setWarna("kuning");
        ps.setBentuk("melengkung");
        ps.setRasa("manis");
        ps.setUkuran("bervariasi, sekitar 10-20 cm");
        ps.setBentuk_kulit("berbentuk panjang dan melengkung");

        System.out.println("\n\t\t\tPisang");
        System.out.println("Nama              : " + ps.getNama());
        System.out.println("Warna             : " + ps.getWarna());
        System.out.println("Bentuk            : " + ps.getBentuk());
        System.out.println("Rasa              : " + ps.getRasa());
        System.out.println("Ukuran            : " + ps.getUkuran());
        System.out.println("Bentuk Kulit     : " + ps.getBentuk_kulit());
        
        JambuGelas jm = new JambuGelas();

        jm.setNama("JambuGelas");
        jm.setWarna("merah");
        jm.setBentuk("lonjong");
        jm.setRasa("segar, berair");
        jm.setUkuran("sekitar 5-8 cm");
        jm.setTiada_biji("kadang ada bijinya");

        System.out.println("\n\t\t\tJambuGelas");
        System.out.println("Nama              : " + jm.getNama());
        System.out.println("Warna             : " + jm.getWarna());
        System.out.println("Bentuk            : " + jm.getBentuk());
        System.out.println("Rasa              : " + jm.getRasa());
        System.out.println("Ukuran            : " + jm.getUkuran());
        System.out.println("kadang ada bijinya            : " + jm.getTiada_biji());
        
        Melon ml = new Melon();

        ml.setNama("Melon");
        ml.setWarna("hijau kekuningan");
        ml.setBentuk("bulat");
        ml.setRasa("manis, segar");
        ml.setUkuran("besar");
        ml.setTekstur_buah("tebal dan berair");

        System.out.println("\n\t\t\tMelon");
        System.out.println("Nama              : " + ml.getNama());
        System.out.println("Warna             : " + ml.getWarna());
        System.out.println("Bentuk            : " + ml.getBentuk());
        System.out.println("Rasa              : " + ml.getRasa());
        System.out.println("Ukuran            : " + ml.getUkuran());
        System.out.println("tebal dan berair            : " + ml.getTekstur_buah());
        
        Kedondong kd = new Kedondong();

        kd.setNama("kedondong");
        kd.setWarna("hijau");
        kd.setBentuk("bulat");
        kd.setRasa("manis - manis asem");
        kd.setUkuran("sedang");
        kd.setBentuk_Biji("besar dan bergerigi");

        System.out.println("\n\t\t\tkedondong");
        System.out.println("Nama              : " + kd.getNama());
        System.out.println("Warna             : " + kd.getWarna());
        System.out.println("Bentuk            : " + kd.getBentuk());
        System.out.println("Rasa              : " + kd.getRasa());
        System.out.println("Ukuran            : " + kd.getUkuran());
        System.out.println("besar dan bergerigi            : " + kd.getBentuk_Biji());
        
        BuahNaga bn = new BuahNaga();

        bn.setNama("BuahNaga");
        bn.setWarna("merah muda");
        bn.setBentuk("oval dengan tonjolan kulit");
        bn.setRasa("manis");
        bn.setUkuran("besar");
        bn.setBentuk_kulit("tebal dengan sisik seperti naga");

        System.out.println("\n\t\t\tBuahNaga");
        System.out.println("Nama              : " + bn.getNama());
        System.out.println("Warna             : " + bn.getWarna());
        System.out.println("Bentuk            : " + bn.getBentuk());
        System.out.println("Rasa              : " + bn.getRasa());
        System.out.println("Ukuran            : " + bn.getUkuran());
        System.out.println("tebal dengan sisik seperti naga            : " + bn.getBentuk_kulit());
        
        Semangka sk = new Semangka();

        sk.setNama("semangka");
        sk.setWarna("hijau");
        sk.setBentuk("bulat");
        sk.setRasa("manis");
        sk.setUkuran("besar");
        sk.setCorak_kkulit("garis hijau gelap");

        System.out.println("\n\t\t\tsemangka");
        System.out.println("Nama              : " + sk.getNama());
        System.out.println("Warna             : " + sk.getWarna());
        System.out.println("Bentuk            : " + sk.getBentuk());
        System.out.println("Rasa              : " + sk.getRasa());
        System.out.println("Ukuran            : " + sk.getUkuran());
        System.out.println("garis hijau gelap            : " + sk.getCorak_kkulit());
}
}
