public class Principal {
    public static void main(String[] args) {
        Novo imovelNovo=new Novo();
        imovelNovo.setEndereco("Pompeia");
        imovelNovo.setPreco(1000);
        imovelNovo.setAdicional(200);
        double imovelNovoValor=imovelNovo.getPreco()+imovelNovo.getAdicional();

        System.out.println(imovelNovo.getEndereco());
        System.out.println(imovelNovoValor);
    }
    
}
