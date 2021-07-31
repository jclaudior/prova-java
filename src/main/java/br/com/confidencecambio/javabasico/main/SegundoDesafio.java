package br.com.confidencecambio.javabasico.main;

import br.com.confidencecambio.javabasico.exceptions.EntidadeException;
import br.com.confidencecambio.javabasico.model.Cliente;
import br.com.confidencecambio.javabasico.model.Entidade;
import br.com.confidencecambio.javabasico.model.Gerente;
import br.com.confidencecambio.javabasico.model.Robo;

public class SegundoDesafio {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        try {
            cliente.setNome(null);
        } catch (EntidadeException e) {
            System.out.println(e.getMessage());
        }
        try {
            cliente.setNome("");
        } catch (EntidadeException e) {
            System.out.println(e.getMessage());
        }
        try {
            cliente.setNome(" Joao");
        } catch (EntidadeException e) {
            System.out.println(e.getMessage());
        }
        try {
            cliente.setNome("Joao Claudio ");
        } catch (EntidadeException e) {
            System.out.println(e.getMessage());
        }
        try {
            cliente.setNome("João Claudio Ribeiro");
            print(cliente);

            Gerente gerente = new Gerente();
            gerente.setNome("Nikola Tesla");
            print(gerente);


            Robo robo = new Robo();
            robo.setNome("Alberto Santos Dumont Silva");
            print(robo);
        } catch (EntidadeException e) {
            System.out.println(e.getMessage());
        }

    }

    
    public static void print(Entidade entidade){
        System.out.println(entidade.getPrimeiroNome());
        System.out.println(entidade.getUltimoNome());
        System.out.println(entidade.getNomeMaiusculo());
        System.out.println(entidade.getNomeAbrevia());
    }
}
