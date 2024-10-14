package br.sesi.bank.bank_java_jdbc.controller;

import br.sesi.bank.bank_java_jdbc.domain.cliente.DadosCadastroCliente;
import br.sesi.bank.bank_java_jdbc.domain.conta.Conta;
import br.sesi.bank.bank_java_jdbc.exceptions.RegraDeNegocioException;
import br.sesi.bank.bank_java_jdbc.service.ContaService;

import java.sql.SQLException;
import java.util.Scanner;

public class BankJavaController {
    ContaService service;
    Scanner teclado;

    public BankJavaController(){
        this.service = new ContaService();
        this.teclado = new Scanner(System.in).useDelimiter("\n");
    }

    public static void main(String[] args) throws SQLException {
        BankJavaController controller = new BankJavaController();
        controller.start();
    }

    public void start() throws SQLException{
        int opcao = exibirMenu();
        while (opcao != 8) {
            try {
                switch (opcao) {
                    case 1:
                    listarContas();
                    break;
                    case 2:
                        abrirConta();
                        break;
                    case 3:
                        encerrarConta();
                        break;
                    case 4:
                        consultarSaldo();
                        break;
                    case 5:
                        realizarSaque();
                        break;
                    case 6:
                        realizarDeposito();
                        break;
                    case 7:
                        realizarTransferencia();
                        break;
                }
            } catch (RegraDeNegocioException e) {
                System.out.println("Erro: " +e.getMessage());
                System.out.println("Pressione qualquer tecla e de Enter para voltar ao menu");
                teclado.next();
            }
            opcao = exibirMenu();
        }
        System.out.println("Finalizando a aplicação.");

    }

    public int exibirMenu(){

        return 0;
    }

    public void listarContas(){


    }

    public void abrirConta(){


    }

    public void encerrarConta(){


    }

    public void consultarSaldo(){


    }

    public void realizarSaque(){


    }

    public void realizarDeposito(){


    }

    public void realizarTransferencia(){


    }
}
