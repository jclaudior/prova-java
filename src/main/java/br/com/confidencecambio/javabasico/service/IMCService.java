package br.com.confidencecambio.javabasico.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class IMCService {

    public BigDecimal calculaIMC(BigDecimal peso, BigDecimal altura){
        BigDecimal IMC = peso.divide(altura.multiply(altura),2, RoundingMode.HALF_EVEN);
        return IMC;
    }
}
