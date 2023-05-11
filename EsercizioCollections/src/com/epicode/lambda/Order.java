package com.epicode.lambda;
import java.time.LocalDate;
import java.util.List;




public class Order {
	//Logger log = LoggerFactory.getLogger(MainProject.class);
	
	long id;
	String status;
	LocalDate orderdate;
	LocalDate deliveryDate;
	List<Product> product;
	Cliente cliente;
	
	public Order(long id, String status, List<Product> product, Cliente cliente) {
		super();
		this.id = id;
		this.status = status;
		//this.orderdate = orderdate;
		//this.deliveryDate = deliveryDate;
		this.product = product;
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Ordine [id=" + id + ", status=" + status + ", ordered=" + orderdate + ", delivery date=" + deliveryDate +", products=" + product + ", cliente=" + cliente + "]";
	}
}
