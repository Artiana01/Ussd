package org.example.allFunctions.orangeMoney;

public class mobileAccount {
     String username;
     double solde;

    public mobileAccount(String username, double soldeInitial) {
        this.username = username;
        this.solde = soldeInitial;
    }

    public String getUsername() {
        return username;
    }

    public double getSolde() {
        return solde;
    }

    public void depot(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Depot" + montant + " ok , sole : " + solde);
        } else {
            System.out.println("erreur !");
        }
    }

    public boolean retrait(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Retrait " + montant + "ok. N solde : " + solde);
            return true;
        } else {
            System.out.println("Retrait impossible : solde insuffisant !");
            return false;
        }
    }
}