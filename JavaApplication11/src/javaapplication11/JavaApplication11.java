/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author mjose
 */
public class JavaApplication11 {

   public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Maria Jose Teruel","1000-2365-85-1230456789",9999,0);
        operativa_cuenta(cuenta1, null);
    }

    private static void operativa_cuenta(CCuenta cuenta1, java.lang.Float cantidad) {
        double saldoActual;
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    
}
