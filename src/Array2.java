public class Array2 {

    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[10];

        for (int i = 0; i < clientes.length; i++){
            clientes[i] = new Cliente();
            clientes[i].nome = "Mario";
        }

        for (Cliente i : clientes) {
           // System.out.println(i.nome);

        }

        Cliente clientes2[] = new Cliente[5];
        clientes2[0] =  new Cliente();
        clientes2[1] =  new ClienteEspecial();
        Cliente g = new Cliente();
        g.nome = "Guilherme";

        clientes2[0] = g;

        //System.out.println(g.nome);

        //int[] valores = new new int[10];
        //long numeros[] = (long[]) valores;

        String[] nomes = {"Mario", "Guilherme"};
        Object[] objetos;
        objetos = nomes;
        for (Object o : objetos){
            System.out.println(o);
        }

    }

}

class Cliente {
    String nome;
}

class ClienteEspecial extends Cliente {

}