public class Texnikalar {
    public static void main(String[] args) {
        
    }
    
}


 abstract class Texnika{
    abstract void yonish();
    abstract void uchish();
 }


 abstract class Maishiy extends Texnika{
    String nomi;
    public abstract void xizmatKursatadi();
    public abstract void vaqtniTejaydi();
    public abstract void qulKuchiniKamaytiradi();
    
}


 abstract class Moshina extends Texnika{
     String rusumi;
     public abstract void yuradi();
     public abstract void yonadi();
     public abstract void ovozChiqaradi();
     
 }



 abstract class YukMashina extends Moshina{
     String rusumi;
     public abstract void yukTashiydi();
     public abstract void odamTashimaydi();
     public abstract void odamTashiydi();
     public abstract void kuzoviKutariladi();
     public abstract void kuzoviKutarilmaydi();
 }

 abstract class Samasvol extends YukMashina{
     public abstract void qumtashiydi();
     public abstract void toshTashiydi();
 }

 abstract class Bartovoy extends YukMashina{
     public abstract void odamTashimaydi();
 }

 


 class KirYuvishMoshin extends Maishiy{

     @Override
     public void xizmatKursatadi(){

     }

     @Override
     public void vaqtniTejaydi(){
         
     }

    @Override
    void yonish() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void uchish() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void qulKuchiniKamaytiradi() {
        // TODO Auto-generated method stub
        
    }
 }


 class GazPlita extends Maishiy{

    @Override
    public void xizmatKursatadi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void vaqtniTejaydi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void yonish() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void uchish() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void qulKuchiniKamaytiradi() {
        // TODO Auto-generated method stub
        
    }
     
 }


 class  Gax53  extends Samasvol{

    @Override
    public void qumtashiydi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void toshTashiydi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void yukTashiydi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void odamTashimaydi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void odamTashiydi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void kuzoviKutariladi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void kuzoviKutarilmaydi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void yuradi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void yonadi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ovozChiqaradi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void yonish() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void uchish() {
        // TODO Auto-generated method stub
        
    }
     
 }


 class Zil extends Bartovoy{

    @Override
    public void odamTashimaydi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void yukTashiydi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void odamTashiydi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void kuzoviKutariladi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void kuzoviKutarilmaydi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void yuradi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void yonadi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ovozChiqaradi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void yonish() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void uchish() {
        // TODO Auto-generated method stub
        
    }
     
 }