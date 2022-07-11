public class Blast extends Weapon {

    private String frase = "Shoot";

    public Blast(String frase)
    {
        this.frase = frase;
    }

    public Blast()
    {
        
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }



    public String shoot() {
       return frase;
    }

}
