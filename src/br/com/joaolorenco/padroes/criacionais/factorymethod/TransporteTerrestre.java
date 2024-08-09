/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.joaolorenco.padroes.criacionais.factorymethod;

/**
 *
 * @author joao-
 */
public class TransporteTerrestre implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entregando por transporte Terrestre");
    }
    
}
