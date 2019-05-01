/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Objects;

/**
 *
 * @author bruno
 */
public class Cidade {
    
   private int id;  
   private String nome;
   private String estado;
   private String  pais;
   private int populacao;

    public Cidade() {
    }

    public Cidade(int id, String nome, String estado, String pais, int populacao) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
        this.pais = pais;
        this.populacao = populacao;
    }
   
   

 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cidade{" + "id=" + id + ", nome=" + nome + ", estado=" + estado + ", pais=" + pais + ", populacao=" + populacao + '}';
    }

   
   
   
           
            
    
}
