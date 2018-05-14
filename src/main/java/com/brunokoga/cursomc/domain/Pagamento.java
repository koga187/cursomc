package com.brunokoga.cursomc.domain;

import com.brunokoga.cursomc.domain.enums.EstadoPagamento;

import java.io.Serializable;
import java.util.Objects;

public class Pagamento implements Serializable {

    private static final long SerialVersionUID = 1L;

    private Integer Id;

    private EstadoPagamento estadoPagamento;

    private Pedido pedido;

    public Pagamento() {}

    public Pagamento(Integer id, EstadoPagamento estadoPagamento, Pedido pedido) {
        Id = id;
        this.estadoPagamento = estadoPagamento;
        this.pedido = pedido;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public EstadoPagamento getEstadoPagamento() {
        return estadoPagamento;
    }

    public void setEstadoPagamento(EstadoPagamento estadoPagamento) {
        this.estadoPagamento = estadoPagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pagamento)) return false;
        Pagamento pagamento = (Pagamento) o;
        return Objects.equals(getId(), pagamento.getId());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }
}
