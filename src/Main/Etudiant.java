/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Date;

public class Etudiant extends Thread {

    private int ine_;
    private String nom_;
    private String prenom_;
    private Date dateNaissance_;
    private String lieuNaissance_;
    private String parcours_;

    /**
     * @return the ine_
     */
    public int getIne_() {
        return ine_;
    }

    /**
     * @param ine_ the ine_ to set
     */
    public void setIne_(int ine_) {
        this.ine_ = ine_;
    }

    /**
     * @return the nom_
     */
    public String getNom_() {
        return nom_;
    }

    /**
     * @param nom_ the nom_ to set
     */
    public void setNom_(String nom_) {
        this.nom_ = nom_;
    }

    /**
     * @return the prenom_
     */
    public String getPrenom_() {
        return prenom_;
    }

    /**
     * @param prenom_ the prenom_ to set
     */
    public void setPrenom_(String prenom_) {
        this.prenom_ = prenom_;
    }

    /**
     * @return the dateNaissance_
     */
    public Date getDateNaissance_() {
        return dateNaissance_;
    }

    /**
     * @param dateNaissance_ the dateNaissance_ to set
     */
    public void setDateNaissance_(Date dateNaissance_) {
        this.dateNaissance_ = dateNaissance_;
    }

    /**
     * @return the lieuNaissance_
     */
    public String getLieuNaissance_() {
        return lieuNaissance_;
    }

    /**
     * @param lieuNaissance_ the lieuNaissance_ to set
     */
    public void setLieuNaissance_(String lieuNaissance_) {
        this.lieuNaissance_ = lieuNaissance_;
    }

    /**
     * @return the parcours_
     */
    public String getParcours_() {
        return parcours_;
    }

    /**
     * @param parcours_ the parcours_ to set
     */
    public void setParcours_(String parcours_) {
        this.parcours_ = parcours_;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder = builder.append("INE =").append(ine_).append("\n")
                .append("Nom = ").append(nom_).append("\n")
                .append("Prenom = ").append(prenom_).append("\n")
                .append("Date de Naissance = ").append(dateNaissance_).append("\n")
                .append("Lieu de Naissance = ").append(lieuNaissance_).append("\n")
                .append("Parcours = ").append(parcours_).append("\n");

        return builder.toString();
    }
}
