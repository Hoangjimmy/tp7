/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Jean
 */
public class GenInterface implements Runnable {

    private Generator gen;

    public GenInterface(Generator gen) {
        this.gen = gen;
    }

    public void run() {
        Etudiant e = null;
        while (this.getGen().getArr().size() < 50000) {
            e = Generator.genEtu();
            this.getGen().addEtud(e);
        }
    }

    /**
     * @return the gen
     */
    public Generator getGen() {
        return gen;
    }

    /**
     * @param gen the gen to set
     */
    public void setGen(Generator gen) {
        this.gen = gen;
    }
}
