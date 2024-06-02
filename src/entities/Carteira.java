/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;


public class Carteira {
    private String email;
    private float saldo;
    
    public Carteira(String email, float saldo){
        this.email = email;
        this.saldo = saldo;
    }
    
    public void depositar(float valor){
        saldo+=valor;
        
    }
    
    public void retirar(float valor){
        saldo-=valor;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public String getEmail(){
        return email;
    }
}
