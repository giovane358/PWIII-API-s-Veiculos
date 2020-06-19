package com.br.etec.gg.Veiculos.controller;


import com.br.etec.gg.Veiculos.model.Veiculo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @GetMapping
    public List<Veiculo> ListarTodos() {
        List<Veiculo> resultado = new ArrayList<Veiculo>();

        resultado.add(Veiculo.builder().id(1l).modelo("cruze hatch").placa("GGB1055").ano("2015").marca("GM- CHEVROLET").valor(50.726).build());
        resultado.add(Veiculo.builder().id(2l).modelo("new civic").placa("FUI2510").ano("2020").marca("Honda").valor(136.700).build());
        resultado.add(Veiculo.builder().id(3l).modelo("lamborghini urus").placa("HTA6558").ano("2015").marca("GM- CHEVROLET").valor(2400.00).build());

        return resultado;

    }

}
