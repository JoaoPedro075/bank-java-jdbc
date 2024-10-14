package br.sesi.bank.bank_java_jdbc.domain.conta;

import br.sesi.bank.bank_java_jdbc.domain.cliente.Cliente;

import java.math.BigDecimal;

public class Conta {
        private Integer numero;
        private BigDecimal saldo;
        private Cliente titular;

        public Conta(Integer numero, BigDecimal saldo, Cliente titular){
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;

        }
        public boolean possuiSaldo(){

            return this.saldo.compareTo(BigDecimal.ZERO) != 0;
        }

        public void sacar(BigDecimal valor){


        }

        public void depositar(BigDecimal valor){


        }

        public Integer getNumero(){

            return 0;
        }

        public BigDecimal getSaldo(){

            return BigDecimal.ZERO;
        }

        public Cliente getTitular(){

            return titular;

        }

        public boolean equals(Object o){

            return true;
        }

        public int hashCode(){

            return 0;
        }
}
