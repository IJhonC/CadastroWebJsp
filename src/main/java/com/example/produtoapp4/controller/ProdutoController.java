package com.example.produtoapp4.controller;

import com.example.produtoapp4.model.Produto;
import com.example.produtoapp4.repository.ProdutoRepository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        model.addAttribute("pedidos", new ArrayList<>());
        //model.addAttribute("novoProduto", new Produto());
        System.out.println("AQUI");
        return "index"; // O caminho para o JSP
    }

    @PostMapping
    public String salvarProduto(@ModelAttribute Produto produto) {
        produtoRepository.save(produto);
        return "redirect:/produto"; // Redireciona para a lista de produtos
    }
}
