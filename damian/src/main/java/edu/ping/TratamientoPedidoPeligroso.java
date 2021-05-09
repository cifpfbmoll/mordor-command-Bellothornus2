package edu.ping.damian;


public class TratamientoPedidoPeligroso implements TratamientoPedido{
    private PedidoPeligroso pedidoPeligroso;

    TratamientoPedidoPeligroso(PedidoPeligroso pedidoPeligroso){
        this.pedidoPeligroso = pedidoPeligroso;
    }

    public boolean tratar(){

    }

    public PedidoPeligroso getPedido(){
        return this.pedidoPeligroso;
    }
}
