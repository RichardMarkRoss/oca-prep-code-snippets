package oca.junk;

class baseClass{
    public String baseMethod(){
        return "i am base";
    }
}
abstract class InitClass extends baseClass{
    abstract public void println();
}

class underClass extends InitClass{

    @Override
    public void println() {
        System.out.println ("abstract Extended");
    }
}

public class WorkingWithAbstract {
    public static void main(String[] args) {
        underClass baseClass = new underClass();
        baseClass.println();
        System.out.print(baseClass.baseMethod());
    }
}
