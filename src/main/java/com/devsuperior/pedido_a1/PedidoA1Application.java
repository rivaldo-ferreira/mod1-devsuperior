package com.devsuperior.pedido_a1;

import com.devsuperior.pedido_a1.entities.Order;
import com.devsuperior.pedido_a1.services.OrderService;
import com.devsuperior.pedido_a1.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class PedidoA1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(PedidoA1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("***** sistema pedidos *****".toUpperCase());
		System.out.println();

		Locale.setDefault(Locale.US);
		Scanner dg = new Scanner(System.in);
		System.out.print("Código: ");
		int codigo = dg.nextInt();
		System.out.print("Valor: R$ ");
		double valor = dg.nextDouble();
		System.out.print("Desconto(%): ");
		double desconto = dg.nextInt();
		Order order = new Order(codigo,valor,desconto);

		System.out.println("-----------------------------");
		System.out.println("Código do pedido: " + order.getOrder());
		System.out.println("Valor Total: R$ " + String.format("%.2f",orderService.total(order)));

		dg.close();

	}
}
