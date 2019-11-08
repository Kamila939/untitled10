public abstract class Labrodor extends Dog {
    private String eyecolor;
    public Labrodor(String name, String eyecolor) {
        super(name);
        this.eyecolor = eyecolor;
    }

    public Labrodor(String name){
        super(name);
        this.eyecolor = "Green";
    }

    @Override
    public void Animal() {
        System.out.println(this.eyecolor +" " + this.name);
    }
}
