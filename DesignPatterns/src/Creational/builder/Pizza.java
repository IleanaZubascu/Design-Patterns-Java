package builder;

public class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public Pizza(String dough, String sauce, String topping)
    {
        this.dough=dough;
        this.sauce=sauce;
        this.topping=topping;
    }
    public String toString()
    {
        return "{Pizza:"+
                "dough="+dough+"\n"+
                ",sauce="+sauce+"\n"+
                ",topping="+topping+"\n";
    }
}
