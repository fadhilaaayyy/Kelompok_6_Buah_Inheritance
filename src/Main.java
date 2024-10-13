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

        System.out.println("\n\t\t\tKelengkeng");
        System.out.println("Nama              : " + ap.getNama());
        System.out.println("Warna             : " + ap.getWarna());
        System.out.println("Bentuk            : " + ap.getBentuk());
        System.out.println("Rasa              : " + ap.getRasa());
        System.out.println("Ukuran            : " + ap.getUkuran());
        System.out.println("halus dan bisa dimakan         : " + ap.getTekstur_kulit());
    }
}
