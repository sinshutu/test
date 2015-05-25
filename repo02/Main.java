package report02;

import report02.framework.Factory;
import report02.framework.Player;
import report02.front.OldFactory;
//import report02.front.RetroFactory;

public class Main{
    public static void main(String[] args){
        Factory factory = new OldFactory();

        Player p1 = factory.create("いのうえあきふみ");
        Player p2 = factory.create("Akifumi INOUE");
        p1.show();
        p2.show();
    }
}
