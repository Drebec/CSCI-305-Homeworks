/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

/**
 *
 * @author Drew
 */
public class Driver {
    public static void main(String[] args) {
        C1 c1;
        C2 c2;
        C3 c3;
        I1 i1;
        I2 i2;
        
        c1 = i2;
        i1 = c1;
        c1 = c2;
        c3 = i1;
        c2 = c3;
    }
}
