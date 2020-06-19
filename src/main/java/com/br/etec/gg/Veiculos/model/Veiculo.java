package com.br.etec.gg.Veiculos.model;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Builder
public class Veiculo {

    private long id;
    private String modelo;
    private String placa;
    private String ano;
    private String marca;
    private double valor;



}
