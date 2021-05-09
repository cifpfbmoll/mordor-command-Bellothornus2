public class Oficina implements Procesador{
    Oficina(){}

    @Override
	public boolean procesa(TratamientoPedido tratamientoPedido) {
				
        return tratamientoPedido.tratar();        	
	}

	public String printarStatus(boolean status, Pedido pedido) {
        return status? 
				pedido.destino() + " " + Status.ACEPTADO.name():
				pedido.destino() + " " + Status.RECHAZADO.name();
    }
}
