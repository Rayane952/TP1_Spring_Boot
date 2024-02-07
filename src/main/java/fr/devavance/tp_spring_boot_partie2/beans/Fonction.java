package fr.devavance.tp_spring_boot_partie2.beans;

public enum Fonction {
    CHEF_PROJET("blue"),
    DEV_OPS("green"),
    DEV_WEB("purple"),
    DEV_AI("yellow"),
    SOFTWARE_ARCHITECT("orange");
    private final String codeCouleur;


    Fonction(String codeCouleur) {
        this.codeCouleur = codeCouleur;
    }

    public String getCodeCouleur() {
        return this.codeCouleur;
    }

}
