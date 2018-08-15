/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author User
 */
 @Entity
  @Table(name = "ordem_servico")
public class OrdemServico implements Serializable {

    /**
     * @return the Date
     */
    public Integer getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(Integer Date) {
        this.Date = Date;
    }

    /**
     * @return the CodFuncionario
     */
    public Integer getCodFuncionario() {
        return CodFuncionario;
    }

    /**
     * @param CodFuncionario the CodFuncionario to set
     */
    public void setCodFuncionario(Integer CodFuncionario) {
        this.CodFuncionario = CodFuncionario;
    }
    @Id
    @Column (name = "dt_ordem_servico")
      private Integer Date;
        
    @Column (name = "vl_total numeric")
    private double valorTotal;
    
    @Column (name = "cd_funcionario")
    private Integer CodFuncionario;
    
    @Column (name = "cliente_cd_cliente")
    @OneToOne(targetEntity = Endereco.class,
             cascade = CascadeType.REMOVE,
             fetch = FetchType.EAGER)
    private Cliente cliente;
    
    @Column (name = "funcionario_cd_funcionario")
    @OneToOne(targetEntity = Endereco.class,
             cascade = CascadeType.REMOVE,
             fetch = FetchType.EAGER)
    private Funcionario funcionario;
    private Date data;

    /**
     * @return the data
     */
    public Date getData() {
        Date data = null;
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        Funcionario funcionario = null;
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
