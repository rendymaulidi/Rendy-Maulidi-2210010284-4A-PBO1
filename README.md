# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Rtx menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan Seri vga, dan memberikan output berupa informasi detail dari Seri tersebut seperti seri vga, model, dan varian.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Rtx`, `RtxDetail`, dan `RtxBeraksi` adalah contoh dari class.

```bash
public class Rtx {
// atribut dan enkapsulasi
    private String nama;
    private String seri;
    
    // konstruktor
    public Rtx(String nama, String seri) {
        this.nama = nama;
        this.seri = seri;
    }

    // mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    // accessor
    public String getNama() {
        return nama;
    }

    public String getSeri() {
        return seri;
    }
    
    // polimorfisme overloading
    public String displayInfo() {
        return "Nama: " + getNama() + "\nSeri: " + getSeri();
    }
}
    ...

public class RtxDetail extends Rtx {
//overriding
    public RtxDetail(String nama, String seri) {
        super(nama, seri);
    }
    
    public int getSeriVga(){
        return Integer.parseInt(getSeri().substring(0, 1));
    }
    
    public String getModel(){
        String seriModel = getSeri().substring(2, 4);
            //seleksi switch
        switch(seriModel){
            case "50":
                return "Kelas Rendah";
            case "60":
                return "Kelas Menengah";
            case "80":
                return "Kelas Atas";
            default:
                return "Tidak Ada Model";
        }
    }
    public String getVarian(){
        String labelVarian = getSeri().substring(5);
        //seleksi switch
        switch(labelVarian){
            case "Ti":
                return "Ti (Lebih Cepat)";
            case "Super":
                return "Super (Peningkatan minor)";
            default:
                return "Non-Ti (Normal)";
        }
    }
    
    //polimorfisme overriding
    @Override
    public  String displayInfo(){
        return super.displayInfo()+
                "\nSeri Vga: "+getSeriVga()+"000"+
                "\nModel: "+getModel()+
                "\nVarian: "+getVarian();
    }
}
    ...

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
    ...
```

2. **Object** adalah instance dari class. Pada kode ini, `rtx[i] = new RtxDetail(nama, seri);` adalah contoh pembuatan object.

```bash
rtx[i] = new RtxDetail(nama, seri);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `seri` adalah contoh atribut.

```bash
String nama;
String seri;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Rtx` dan `RtxDetail`.

```bash
public Rtx(String nama, String seri) {
    this.nama = nama;
    this.seri = seri;
}

public RtxDetail(String nama, String seri) {
    super(nama, seri);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setSeri` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setSeri(String seri) {
    this.seri = seri;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getSeri`, `getSeriVga`, `getModel`, dan `getVarian` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getSeri() {
    return seri;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `seri` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String seri;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `RtxDetail` mewarisi `Rtx` dengan sintaks `extends`.

```bash
public class RtxDetail extends Rtx {
    //overriding
    public RtxDetail(String nama, String seri) {
        super(nama, seri);
    }
    
    public int getSeriVga(){
        return Integer.parseInt(getSeri().substring(0, 1));
    }
    
    public String getModel(){
        String seriModel = getSeri().substring(2, 4);
            //seleksi switch
        switch(seriModel){
            case "50":
                return "Kelas Rendah";
            case "60":
                return "Kelas Menengah";
            case "80":
                return "Kelas Atas";
            default:
                return "Tidak Ada Model";
        }
    }
    public String getVarian(){
        String labelVarian = getSeri().substring(5);
        //seleksi switch
        switch(labelVarian){
            case "Ti":
                return "Ti (Lebih Cepat)";
            case "Super":
                return "Super (Peningkatan minor)";
            default:
                return "Non-Ti (Normal)";
        }
    }
    
    //polimorfisme overriding
    @Override
    public  String displayInfo(){
        return super.displayInfo()+
                "\nSeri Vga: "+getSeriVga()+"000"+
                "\nModel: "+getModel()+
                "\nVarian: "+getVarian();
    }
}
    ...
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo()` di `Rtx` merupakan overloading method `displayInfo` dan `displayInfo` di `RtxDetail` merupakan override dari method `displayInfo` di `Rtx`.

```bash
public String displayInfo() {
        return "Nama: " + getNama() + "\nSeri: " + getSeri();
    }


@Override
    public  String displayInfo(){
        return super.displayInfo()+
                "\nSeri Vga: "+getSeriVga()+"000"+
                "\nModel: "+getModel()+
                "\nVarian: "+getVarian();
    }
    ...
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getModel` dan seleksi `switch` dalam method `getVarian`.

```bash
public String getModel(){
        String seriModel = getSeri().substring(2, 4);
            //seleksi switch
        switch(seriModel){
            case "50":
                return "Kelas Rendah";
            case "60":
                return "Kelas Menengah";
            case "80":
                return "Kelas Atas";
            default:
                return "Tidak Ada Model";
        }
    }
    public String getVarian(){
        String labelVarian = getSeri().substring(5);
        //seleksi switch
        switch(labelVarian){
            case "Ti":
                return "Ti (Lebih Cepat)";
            case "Super":
                return "Super (Peningkatan minor)";
            default:
                return "Non-Ti (Normal)";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<rtx.length; i++){
  System.out.print("Masukkan Nama VGA "+(i+1)+": ");
  String nama = scanner.nextLine();
  System.out.print("Masukkan Seri VGA "+(i+1)+": ");
  String seri = scanner.nextLine();
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama VGA "+(i+1)+": ");
String nama = scanner.nextLine();
System.out.print("Masukkan Seri VGA "+(i+1)+": ");
String seri = scanner.nextLine();

System.out.println("====================");
System.out.println("Detail VGA: ");
System.out.println(data.displayInfo());

```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `RtxDetail[] rtx = new RtxDetail[2];` adalah contoh penggunaan array.

```bash
RtxDetail[] rtx = new RtxDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try{

} catch (NumberFormatException e){
    System.out.println("Kesalahan format nomor: "+e.getMessage());
}catch (StringIndexOutOfBoundsException e){
    System.out.println("Kesalahan format Seri: "+e.getMessage());
} catch (Exception e){
    System.out.println("Kesalahan umum: "+e.getMessage());
}
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Rendy Maulidi
NPM: 2210010284
