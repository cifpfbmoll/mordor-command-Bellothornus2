package edu.ping.damian;

public class TratamientoPedidoMultiple implements TratamientoPedido{
    private Integer pesoTotal = 0;
    private Long numBultos = 0;
    private Set<Pedido> numPedidos = new Set<Pedido>;

    TratamientoPedidoMultiple(Set<Pedido> setPedido){
        this.numPedidos = numPedidos;
    }

    public boolean tratar(){

    }

    public Integer getPesoTotal(){
        return this.pesoTotal;
    }

    public Long getNumBultos(){
        return this.numBultos;
    }
}
