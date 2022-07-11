import java.util.ArrayList;

public class Sith extends Force implements Weapon_Use{
    private String nome;
    private String titulo;
    private ArrayList<Weapon> weapon = new ArrayList<Weapon>();
    private Saber sabre_vermelho = new Saber();

    public Sith(String nome, String titulo, ArrayList<Weapon> weapon) {
        this.nome = nome;
        this.titulo = titulo;
        this.weapon = weapon;
    }

    public Sith(String nome)
    {
        this.nome = nome;
    }
    
    public Sith(String nome, String titulo)
    {
        this.nome = nome;
        this.titulo = titulo;
    }
    public Sith()
    {
        
    }
    

    public void AttackSith(Weapon weapon)
    {
        if(weapon.getDescricao() == "Sabre de Luz Vermelho")
        System.out.println(sabre_vermelho.slash());
    }
    
    public Saber getSabre_vermelho() {
        return sabre_vermelho;
    }



    public void setSabre_vermelho(Saber sabre_vermelho) {
        this.sabre_vermelho = sabre_vermelho;
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

    public void lightning() {
            System.out.println("Skills de um sabre luminoso");
    }

    @Override
    public void mindControl() {
        // TODO Auto-generated method stub
        System.out.println("Do what I wish");
    }

    @Override
    public void farseeing() {
        // TODO Auto-generated method stub
        System.out.println("Além da Visão!");
    }

    @Override
    public void telepath() {
        // TODO Auto-generated method stub
        System.out.println("Telepatia");

    }

    @Override
    public void levitation() {
        // TODO Auto-generated method stub
        System.out.println("Levitating Something");

    }

    @Override
    public void drop(Weapon weapon) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void pickup(Weapon weapon, String nome_arma) {
        // TODO Auto-generated method stub

        if (nome_arma == "sabre vermelho") {
            weapon.setDescricao("Sabre de Luz Vermelho");
            weapon.setDano(12);
            this.weapon.add(weapon);

        }

        this.getWeapons();
        
    }

    /*public void drop() {

    }

    public void pickup(Weapon weapon, Sith obj, String nome_arma) {

        if (nome_arma == "sabre vermelho") {
            weapon.setDescricao("Sabre de Luz Vermelho");
            weapon.setDano(12);
            obj.weapon.add(weapon);

        }

        obj.getWeapons();
    }*/

}
