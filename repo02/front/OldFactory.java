package report02.front;

import report02.framework.Factory;
import report02.framework.Player;

public class OldFactory extends Factory{

	@Override
	protected Player createPlayer(String owner) {
		return new RPGPlayer(owner);
	}

	@Override
	protected void postprocess(Player p) {
		p.setName(p.getName().substring(0, 4));
	}

}
