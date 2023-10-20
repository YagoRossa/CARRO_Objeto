/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carros;

/**
 *
 * @author aluno
 */
public class Carro {
    
    private int idCarro;
    private String nome;
    private String marca;
    private int potencia;
    private int ano;
    
    
    //construtor de inicialização
    public Carro(int idCarro, String nome, String marca, int potencia, int ano) {
        this.idCarro = idCarro;
        this.nome = nome;
        this.marca = marca;
        this.potencia = potencia;
        this.ano = ano;
    }
    
    
    // contrutor padrão
    public Carro() {
    
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" + "idCarro=" + idCarro + ", nome=" + nome + ", marca=" + marca + ", potencia=" + potencia + ", ano=" + ano + '}';
    }
    
    
    

    
}
