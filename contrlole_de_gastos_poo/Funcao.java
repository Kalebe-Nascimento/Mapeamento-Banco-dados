/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name="funcao")

public class Funcao implements Serializable {
    
    @Id
    @Column (name = "cd_funcao")
    private Integer codFuncao;
    
     @Column (name = "tp_visivel")
    private boolean acessoRestrito;
    
    @Column (name = "ds_funcao")
    private String descricao;
    

    /**
     * @return the codFuncao
     */
    public Integer getCodFuncao() {
        return codFuncao;
    }

    /**
     * @param codFuncao the codFuncao to set
     */
    public void setCodFuncao(Integer codFuncao) {
        this.codFuncao = codFuncao;
    }
    
    
   

    /**
     * @return the acessoRestrito
     */
    public boolean isAcessoRestrito() {
        return acessoRestrito;
    }

    /**
     * @param acessoRestrito the acessoRestrito to set
     */
    public void setAcessoRestrito(boolean acessoRestrito) {
        this.acessoRestrito = acessoRestrito;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
 

}
