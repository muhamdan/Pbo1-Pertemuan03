/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

/**
 *
 * @author user
 */
public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs   : \"Terima kasih pak\"");
                System.out.println("Dosen   : \"Selamat Ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs   : \"Kenapa ulun kada dapat A, pak?\"");
                System.out.println("Dosen   : \"@#$!#\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen   : \"Tapi bisa lah menjawab ujian?\"");
                System.out.println("Mhs   : \"hihihi..\"");
                break;
            default:
                System.out.println("Mhs     : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen   : \"Bujur jua kah ?\"");
                System.out.println("Dosen   : \"memeriksa berkas\"");
                System.out.println("Dosen   : \"*mencelang\"");
                System.out.println("Mhs     : \"Kabur..\"");
                break;
            }
    }
}
