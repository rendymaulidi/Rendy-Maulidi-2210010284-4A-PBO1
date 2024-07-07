package uas;

import java.util.Scanner;

public class RtxBeraksi {
    public static void main(String[] args) {
        //error handling
        try{
            //io sederhana
            Scanner scanner = new Scanner(System.in);

            //array
            RtxDetail[] rtx = new RtxDetail[2];

            //perulangan biasa
            for(int i=0; i<rtx.length; i++){
                System.out.print("Masukkan Nama VGA "+(i+1)+": ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Seri VGA "+(i+1)+": ");
                String seri = scanner.nextLine();

                //objek
                rtx[i] = new RtxDetail(nama, seri);
            }

            //perulangan
            for(RtxDetail data: rtx){
                System.out.println("====================");
                System.out.println("Detail VGA: ");
                System.out.println(data.displayInfo());
            }
        } catch (NumberFormatException e){
            System.out.println("Kesalahan format nomor: "+e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan format Seri: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Kesalahan umum: "+e.getMessage());
        }
    }
}