package com.sgp.util;

public class Validacoes {
    
    private Validacoes() {}
    
    //  nome do personagem (não pode ser nulo ou vazio)
    public static boolean isNomePersonagemValido(String nomePersonagem) {
        return nomePersonagem != null && !nomePersonagem.trim().isEmpty();
    }
    
    // nível (não pode ser negativo)
    public static boolean isNivelValido(int nivel) {
        return nivel >= 1;
    }
    
    // vida (não pode ser negativa)
    public static boolean isVidaValida(int vida) {
        return vida >= 0;
    }
    
    // nível máximo (exemplo de limite)
    public static boolean isNivelMaximoValido(int nivel) {
        return nivel <= 100;
    }
    
    // vida máxima (entre 0 e 100)
    public static boolean isVidaMaximaValida(int vida) {
        return vida >= 0 && vida <= 100;
    }
    
    public static boolean isObjetoValido(Object obj) {
        return obj != null;
    }
}