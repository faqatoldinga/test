public class Main{
    public static void main(String[] args) {
      
        Hayvon  h = new Ayiq();
        Mushuk m = new Mushuk();
    }

    public static void ovozQani(Hayvon hayvon){
        hayvon.ovoz();
    }
}
class Ayiq extends YirtqichHayvon{
    @Override
    public void ovQilish(){

    }

    @Override
    public void ovoz(){
        
    }

    @Override
    public void ov() {
        
    }
}

class Mushuk extends UyHayvon{

    @Override
    public void uynash() {
        
    }
}

abstract class Hayvon{
     
    String rang;
    String hajm;
    public void ovoz() {
    }
    
}


abstract class UyHayvon extends Hayvon{
    public abstract void uynash();
}


abstract class YirtqichHayvon extends Hayvon{
    public abstract void ov();
    public abstract void ovQilish();
    public abstract void ovoz();
}

