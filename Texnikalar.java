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


 class YukMashina extends Moshina{
     @Override
     public void yuradi(){

     }

     @Override
     public void yonadi(){

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
    public void ovozChiqaradi() {
        // TODO Auto-generated method stub
        
    }
 }

 class Samasvol extends YukMashina{
    @Override
    public void yonadi(){
        
    }

    @Override
    public void odamTashimaydi{

    }

    @Override
    public void kuzoviKutariladi{

    }

    @Override
    public void yukTashiydi{

    }
 }

 class  bartovoy extends YukMashina{
     
     @Override
     public void kuzoviKutarilmaydi{

     }

     @Override
     public void odamTashiydi{

     }
     @Override
     public void yukTashiydi{

     }
 }