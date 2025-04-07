package intermediario.generics;

public class EquipamentoMain {
    public static void main(String[] args) {
        Equipamentos computado = new Equipamentos("Computador");
        Equipamentos celular = new Equipamentos("Celular");
        Equipamentos tablet = new Equipamentos("Tablet");

        Mochila<Equipamentos> mochilaGenerica = new Mochila<Equipamentos>();
        mochilaGenerica.adicionarEquipamento( computado );
        mochilaGenerica.adicionarEquipamento( celular );
        mochilaGenerica.adicionarEquipamento( tablet );

        System.out.println(mochilaGenerica);


    }
}
