package oca.javaApi;
public class StringApi {
    public static void main(String[] args) {
        String name = "richard";
        name.concat(" ross");// string concat is ignored
//        name += " ross";
        System.out.println(name);
        String name1 = "richard";
        System.out.println(name==(name1));

        System.out.println(name.startsWith("r"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("r")); // unknown values will return -1
        System.out.println(name.replace("richard","richard"));
        System.out.println(name.length());
    }
}
