public class Diner {
    private String RName;
    private String RTagline;

    public Diner(String newName, String newTagline){
        RName = newName;
        RTagline = newTagline;
    }
    public void setRName(String newName){
        this.RName = newName;
    }
    public String getRName(){
        return RName;
    }
    public void setRTagline(String newTagline){
        this.RTagline = newTagline;
    }
    public String getRTagline(){
        return RTagline;
    }


}