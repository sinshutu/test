package report02.framework;

public abstract class Factory{
    public final Player create(String owner){
        Player p = createPlayer(owner);
        this.postprocess(p);
        return p;
    }

    protected abstract Player createPlayer(String owner);

    protected abstract void postprocess(Player p);
}
