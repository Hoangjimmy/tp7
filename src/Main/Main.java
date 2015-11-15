/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.lang.Thread;

/**
 *
 * @author Jean
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Vector<Etudiant> vect = new Vector<Etudiant>();
         Etudiant e = null;
         for (int i = 0; i <= 150000; ++i) {
         e = Etudiant.Generator();
         vect.add(e);
         System.out.println(e.toString());
         }*/
        Generator gen1 = new Generator();
        GenInterface ge = new GenInterface(gen1);
        Thread t = new Thread(ge);
        Thread t2 = new Thread(ge);
        Thread t3 = new Thread(ge);
        t.start();
        t2.start();
        t3.start();

        for (Etudiant s : ge.getGen().getArr()) {
            System.out.println(s.toString());
        }
        System.out.println();
    }
}
