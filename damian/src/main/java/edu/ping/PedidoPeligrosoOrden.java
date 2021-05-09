public class PedidoPeligrosoOrden implements PedidoPeligroso{
    private final String id;
    private String destino = "";
    private int peso = 0;
    private String instrucciones = "";

    PedidoPeligrosoOrden(String destino, String descripcion){
        this.destino = destino;
        this.descripcion = descripcion;
    }

    public int peso(){
        return this.peso;
    }
    public String instrucciones(){
        return this.instrucciones;
    }

    public String destino(){
        return this.destino;
    }
    public String getId(){
        return this.id;
    }
}
