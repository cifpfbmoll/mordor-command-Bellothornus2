public class PedidoNacional implements Pedido{
    private final String id;
    private String destino = "";
    private int peso = 0;

    PedidoNacional(String destino, int peso){
        this.destino = destino;
        this.peso = peso;
    }

    public int peso(){
        return this.peso;
    }

    public String destino(){
        return this.destino;
    }

    public String getId(){
        return this.id;
    }
}
