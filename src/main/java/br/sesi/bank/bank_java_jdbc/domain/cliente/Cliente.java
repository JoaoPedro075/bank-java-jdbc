package br.sesi.bank.bank_java_jdbc.domain.cliente;

import java.util.Objects;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;

    public Cliente(DadosCadastroCliente dados){
        this.nome = dados.nome;
        this.cpf = dados.cpf;
        this.email = dados.email;
    }

    public String getNome() {
            return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public int hashcode(){
        return Objects.hash(cpf);
    }
    @Override
    public boolean equals(Object o){
       if (this == o) return true ;
       if (o == null || getClass() != o.getClass()) return false;
       Cliente cliente = (Cliente) o;
       return cpf.equals(cliente.cpf);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='"  + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
         '}';

    }

    }


