package report02.front;

import report02.framework.Factory;
import report02.framework.Player;
//import report02.front.RetroFactory;
import front.RetroFactory;

public class Main{
    public static void main(String[] args){
        Factory factory = new RetroFactory();

        Player p1 = factory.create("いのうえあきひみ");
        Player p2 = factory.create("Akifumi INOUE");
        p1.show();
        p2.show();
    }
}
