package uas;

//inheritance
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