package ba.unsa.etf.rpr;


public class Main {

    public static void main(String[] args) {

        Sati s = new Sati(15,30,45);
        System.out.println(s.Ispisi());
        s.Sljedeci();
        System.out.println(s.Ispisi());
        s.PomjeriZa(-48);
        System.out.println(s.Ispisi());
        s.Postavi(0,0,0);

        System.out.println(s.Ispisi());


    }
}