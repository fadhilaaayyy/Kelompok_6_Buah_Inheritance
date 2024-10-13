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
    }
}
