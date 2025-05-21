package com.fatecrl.mvc.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fatecrl.mvc.Models.Transacoes;

@Controller
@RequestMapping("/transacoes")
public class TransacoesController {

    List<Transacoes> transacoes = new ArrayList<>();

    public TransacoesController() {
        transacoes.add(new Transacoes(1, "Depósito", "Claudio", "19/03/2024", 150));
        transacoes.add(new Transacoes(2, "Saque", "José", "05/08/2023", 200));
        transacoes.add(new Transacoes(3, "Pagamento", "Vanuza", "06/04/2025",1350));
    }

    @GetMapping
    public String Listar(Model model){
        model.addAttribute("transacoes", transacoes);
        return "transacoes";
    }
}
