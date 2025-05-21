package com.fatecrl.mvc.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatecrl.mvc.Models.Transacoes;

@RestController
@RequestMapping("/api/transacoes")
public class ApiController {
    List<Transacoes> transacoes = new ArrayList<>();

    public ApiController() {
        transacoes.add(new Transacoes(1, "Depósito", "Claudio", "19/03/2024", 150));
        transacoes.add(new Transacoes(2, "Saque", "José", "05/08/2023", 200));
        transacoes.add(new Transacoes(3, "Pagamento", "Vanuza", "06/04/2025",1350));
    }

    @GetMapping
    public List<Transacoes> listarTransacoes(){
        return transacoes;
    }

}
