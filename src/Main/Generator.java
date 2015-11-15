/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Jean
 */
public class Generator {

    private ArrayList<Etudiant> arr;

    public Generator() {
        this.arr = new ArrayList<Etudiant>(150000);
    }

    public static Etudiant genEtu() {

        String[] nom = {"Jackson", "Markson", "Alexanderson", "Richardson", "Michealson"};
        String[] prenom = {"Charles", "Henri", "Benoit", "Maxime", "Mathieu"};
        String[] ville = {"Paris", "Clermont-Ferrand", "Marseille", "Lille", "Lyon"};
        Etudiant e = new Etudiant();
        Random rand = new Random();
        long RandomyearMili = ((long) rand.nextInt(20) + 20) * (365L - (long) rand.nextInt(364)) * 24L * 60L * 60L * 1000;
        Date nai = new Date(System.currentTimeMillis() - RandomyearMili); //(rand.nextInt(10) + 1980, rand.nextInt(12) + 1, rand.nextInt(30) + 1);
        e.setIne_(rand.nextInt());
        e.setNom_(
                nom[rand.nextInt(3) + 1]);
        e.setPrenom_(
                prenom[rand.nextInt(3) + 1]);
        e.setDateNaissance_(nai);
        e.setLieuNaissance_(
                ville[rand.nextInt(3) + 1]);
        return e;
    }

    /**
     * @return the arr
     */
    public ArrayList<Etudiant> getArr() {
        return arr;
    }

    /**
     * @param arr the arr to set
     */
    public void setArr(ArrayList<Etudiant> arr) {
        this.arr = arr;
    }

    public void addEtud(Etudiant e) {
        this.arr.add(e);
    
    }

    Iterator<Etudiant> iterator() {
        return this.arr.iterator();
    }
}
