package report02.front;

import report02.framework.Player;


class RPGPlayer extends Player{
   protected RPGPlayer(String name){
       super.name = name;
   }

   public void show(){
       System.out.println("NAME: " + this.name);
   }
}
