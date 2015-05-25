package report02.front;

import report02.framework.Factory;
import report02.framework.Player;

public class RetroFactory extends Factory{
	@Override
	protected Player createPlayer(String owner){
        return new RPGPlayer(owner);
    }

	@Override
    protected void postprocess(Player p){
    	p.setName(p.getName().toUpperCase());
    }
}
