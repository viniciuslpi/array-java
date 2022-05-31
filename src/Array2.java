public class Array2 {

    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[10];

        for (int i = 0; i < clientes.length; i++){
            clientes[i] = new Cliente();
            clientes[i].nome = "Mario";
        }

        for (Cliente i : clientes) {
            System.out.println(i.nome);

        }

        Cliente clientes2[] = new Cliente[5];
        clientes2[0] =  new Cliente();
        clientes2[1] =  new ClienteEspecial();
        Cliente g = new Cliente();
        g.nome = "Guilherme";

        clientes2[0] = g;

        System.out.println(g.nome);
    }

}

class Cliente {
    String nome;
}

class ClienteEspecial extends Cliente {

}