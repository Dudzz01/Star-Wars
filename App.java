import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        ArrayList<Weapon> weapon_jedi = new ArrayList<Weapon>();
        ArrayList<Weapon> weapon_sith = new ArrayList<Weapon>();

        Saber sabre_azul = new Saber();
        Blast blaster_laser = new Blast();
        Saber sabre_vermelho = new Saber();

        Pessoa leia_organa = new Pessoa();
        Pessoa luke_skywalker = new Pessoa("Luke", "Skywalker", 'm');
        Jedi Obi_Wan_Kenobi = new Jedi("Obi Wan Kenobi", "Mestre", weapon_jedi);
        Sith Darth_Vader = new Sith("Darth Vader", "Darth", weapon_sith);    

        leia_organa.setNome("Leia");
        leia_organa.setSobrenome("Organa");
        leia_organa.setSexo('f');

        pessoas.add(luke_skywalker); 
        pessoas.add(leia_organa);
        // Exercicio 9
        Obi_Wan_Kenobi.farseeing();
        Obi_Wan_Kenobi.telepath();
        Obi_Wan_Kenobi.mindControl();
        Obi_Wan_Kenobi.levitation();
        Darth_Vader.mindControl();
        Darth_Vader.levitation();
        Darth_Vader.farseeing();
        Darth_Vader.telepath();

        //Exercicio 13
        Obi_Wan_Kenobi.mindControl();
        Obi_Wan_Kenobi.levitation();
        Darth_Vader.mindControl();
        Darth_Vader.levitation();

        Darth_Vader.pickup(sabre_vermelho,"sabre vermelho");
        Darth_Vader.AttackSith(sabre_vermelho);
        Obi_Wan_Kenobi.pickup(sabre_azul,"sabre azul");
        Obi_Wan_Kenobi.pickup(blaster_laser,"blaster");
        Obi_Wan_Kenobi.AttackJedi(blaster_laser);

        Obi_Wan_Kenobi.drop(blaster_laser);

        for (Weapon wep : Darth_Vader.getWeapons()) {
            System.out.println("Arma do Darth Vader: " + wep.getDescricao());
        }

        for (Weapon wep : Obi_Wan_Kenobi.getWeapons()) {
            System.out.println("Arma do Obi Wan: " + wep.getDescricao());
        }

    }
}
