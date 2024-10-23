package com.example.produtoapp4.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.produtoapp4.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
