public class Saber extends Weapon {
    private String frase = "";

    public Saber() {
    }

    public Saber(String frase)
    {
        this.frase = frase;
    }

    public String slash() {
         frase = "Slash";
        
         return frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }


}
