/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.dainf.if62c.pratica;

import java.util.HashMap;

/**
 *
 * @author Cliente
 */
public class Time {
    private HashMap<String, Jogador> jogadores ;
    public Time(){
        jogadores = new HashMap<>();
    }
    public HashMap<String, Jogador> getJogadores(){
        return jogadores;
    }
    public void addJogador(String nome, Jogador n){
         jogadores.put(nome, n);
    } 
}
