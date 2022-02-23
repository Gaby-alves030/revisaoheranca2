public class Principal {
    public static void main(String[] args) {
        
        Imovel i = new Imovel();
        Novo n = new Novo();
        Velho v = new Velho();

        i.setEndereco("Rua da Pamonha");
        i.setPreco(150000);
        n.setPrecoadicional(i.getPreco()+50000);
        v.setPrecovelho(i.getPreco()-50000);

        System.out.println("Endereco: "+i.getEndereco());
        System.out.println("Preço: "+i.getPreco());
        System.out.println("Preco adicional: "+n.getPrecoadicional());
        System.out.println("Preco antigo: "+v.getPrecovelho());
        
    }
}
