
package pkg2120180179.sk02.pbo.ti20192020.pkg3.pkg4.pkg02;
public class SK02PBOTI201920203402 {
    public static void main(String[] args){
        aplikasi Instagram = new aplikasi();
        Instagram.chat=150;        
        Instagram.videocall=20;        
        Instagram.telefon=30;        
        System.out.println(Instagram.nama);
        System.out.println("Chat anda sekarang "+Instagram.chat);
        System.out.println("Anda tidak menjawab "+Instagram.telefon);
        System.out.println("Video call dari pacar anda "+Instagram.videocall);
        Instagram.mengirim_gambar();
        Instagram.mengirim_pesan();
        Instagram.group();
    }
}