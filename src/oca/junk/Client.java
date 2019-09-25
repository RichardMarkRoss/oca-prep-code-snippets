package oca.junk;

class ToplevelClass {
    private String headlines = "Shine the inner light";

    public NonStaticMemberClass makeInstance() {
        return new NonStaticMemberClass();
    }

    public class NonStaticMemberClass {
//      static int sf = 2003;
        final static int fsf = 2003;
        private String banner;
        public NonStaticMemberClass() { banner = headlines; }
        public void print(String prefix) {
            System.out.println(prefix + banner + " in " + fsf);}
    }
}

public class Client {
    public static void main(String[] args) {
        ToplevelClass topRef = new ToplevelClass();

        ToplevelClass.NonStaticMemberClass innerRef1 = topRef.makeInstance();
        innerRef1.print("innerRef1: ");
        //  ToplevelClass.NonStaticMemberClass innerRef2 = new ToplevelClass.NonStaticMemberClass();
        ToplevelClass.NonStaticMemberClass innerRef3 = topRef.new NonStaticMemberClass();
        innerRef3.print("innerRef3: ");
    }
}
