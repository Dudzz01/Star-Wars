import java.util.ArrayList;

public class Jedi extends Force implements Weapon_Use{

    private String nome;

    private String titulo;

    private ArrayList<Weapon> weapon = new ArrayList<Weapon>();

    private Saber sabre_azul = new Saber();
    

    private Blast blaster_laser = new Blast();

    public Jedi(String nome, String titulo, ArrayList<Weapon> weapon) {
        this.nome = nome;
        this.titulo = titulo;
        this.weapon = weapon;
    }
    public Jedi(){

    }
    public Jedi(String nome)
    {
          this.nome = nome;
    }

    public Jedi(String nome, String titulo){
        this.nome = nome;
        this.titulo = titulo;
    }

    public Blast getBlaster_laser() {
        return blaster_laser;
    }
    public void setBlaster_laser(Blast blaster_laser) {
        this.blaster_laser = blaster_laser;
    }


    public Saber getSabre_azul() {
        return sabre_azul;
    }
    public void setSabre_azul(Saber sabre_azul) {
        this.sabre_azul = sabre_azul;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapon;
    }

    public void setWeapons(ArrayList<Weapon> weapon) {
        this.weapon = weapon;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void patience() {
         System.out.println("Paciencia!");
    }

    public void AttackJedi(Weapon weapon){
            if(weapon.getDescricao() == "Sabre Azul")
            {
                   System.out.println(sabre_azul.slash());
            }
            else if(weapon.getDescricao() == "Blaster")
            {
                    System.out.println(blaster_laser.shoot());
            }
            else
            {
                System.out.println("Ataque nao disponivel");
            }
    }

    @Override
    public void mindControl() {
        // TODO Auto-generated method
        System.out.println("Do what I wish");

    }

    @Override
    public void farseeing() {
        // TODO Auto-generated method stub
        System.out.println("Além da visão");

    }

    @Override
    public void telepath() {
        // TODO Auto-generated method stub
        System.out.println("Telepatia!");

    }

    @Override
    public void levitation() {
        // TODO Auto-generated method stub
        System.out.println("Levitating Something");

    }

    @Override
    public void drop(Weapon weapon) {
        // TODO Auto-generated method stub
        this.weapon.remove(weapon);
        
    }

    @Override
    public void pickup(Weapon weapon, String nome_arma) {
        // TODO Auto-generated method stub

        if (nome_arma == "sabre azul") {
            weapon.setDescricao("Sabre Azul");
            weapon.setDano(10);

            sabre_azul.slash();
            this.weapon.add(weapon);

        }
        if (nome_arma == "blaster") {

            weapon.setDescricao("Blaster");
            weapon.setDano(20);
            

            
            this.weapon.add(weapon);
        }
        
    }

    

}
