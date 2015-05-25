package report02.framework;

public abstract class Player{
    protected String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract void show();
}
