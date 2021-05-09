public class TratamientoPedidoInternacional implements TratamientoPedido{
    PedidoInternacional pedidoInternacional;
    TratamientoPedidoInternacional(PedidoInternacional pedidoInternacional){
        this.pedidoInternacional = pedidoInternacional;
    }

    public boolean tratar(){

    }
    public PedidoInternacional getPedido(){
        return this.pedidoInternacional;
    }
}
