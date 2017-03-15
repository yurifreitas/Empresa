/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author yuri
 */
public class dados_comuns {
    
    private int id;
    private int data_aq;
    private int valor;
    private String nome_autor;
    private String nome;


// GET
   
    
    public int getId() {
        return id;
    }

    public int getData_aq() {
        return data_aq;
    }

    public int getValor() {
        return valor;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public String getNome() {
        return nome;
    }

    //SET
    
    public void setId(int id) {
        this.id = id;
    }

    public void setData_aq(int data_aq) {
        this.data_aq = data_aq;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   //CONSTRUTORES
    
    public dados_comuns(int id, int data_aq, int valor, String nome_autor, String nome) {
        this.id = id;
        this.data_aq = data_aq;
        this.valor = valor;
        this.nome_autor = nome_autor;
        this.nome = nome;
    }
    
}
