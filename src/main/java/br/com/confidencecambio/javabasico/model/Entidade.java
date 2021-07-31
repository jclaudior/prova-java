package br.com.confidencecambio.javabasico.model;

import br.com.confidencecambio.javabasico.exceptions.EntidadeException;

import java.util.Locale;

public abstract class Entidade {
    private String nome;

    public void setNome(String nome) throws EntidadeException {
       if(nome == null){
           throw new EntidadeException("O Nome não pode ser Null!");
       }else if (nome.isEmpty()){
           throw new EntidadeException("O Nome não pode ser Vazio!");
       }else if(nome.charAt(0) == ' ' || nome.charAt(nome.length() -1) == ' '){
           throw new EntidadeException("O Nome não pode conter espaços no inicio e no final!");
       }
       else {
           this.nome = nome;
       }
    }

    public String getPrimeiroNome(){
        return nome.split(" ")[0];
    }

    public String getUltimoNome(){
        int position = this.nome.indexOf(" ");
        return this.nome.substring(position+1);
    }

    public String getNomeMaiusculo(){
        return this.nome.toUpperCase(Locale.ROOT);
    }

    public String getNomeAbrevia(){
        String[] nomeRepartido = this.nome.split(" ");
        String nomeAbreviado="";
        for (int i = 0; i < nomeRepartido.length; i++) {
            if(i > 0 && (nomeRepartido.length == 2 || i != nomeRepartido.length-1)){
                nomeAbreviado += nomeRepartido[i].substring(0,1)+". ";
            }else {
                if(i != nomeRepartido.length-1) {
                    nomeAbreviado += nomeRepartido[i] + " ";
                }else{
                    nomeAbreviado += nomeRepartido[i];
                }
            }
        }
        return nomeAbreviado;
    }





}