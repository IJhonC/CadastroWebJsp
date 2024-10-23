package com.example.produtoapp4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.produtoapp4.model.Pedido;
import com.example.produtoapp4.repository.PedidoRepository;
import com.example.produtoapp4.repository.ProdutoRepository;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public String listarPedidos(Model model) {
        model.addAttribute("pedidos", pedidoRepository.findAll());
        model.addAttribute("produtos", produtoRepository.findAll());
        // model.addAttribute("novoPedido", new Pedido());
        return "index"; // O caminho para o JSP
    }

    @PostMapping
    public String salvarPedido(@ModelAttribute Pedido pedido) {
        pedidoRepository.save(pedido);
        return "redirect:/pedido"; // Redireciona para a lista de pedidos
    }
}
