package model;

public class Peixe extends Animal {
    private String caracteristica;

    public Peixe() {
        this.setPatas(0); // Peixe tem 0 patas
        this.setAmbiente("Mar"); // Padrão: Mar
        this.setCor("Cinzento"); // Padrão: Cinzento
    }

    public void alteraCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String caracteristica() {
        return caracteristica;
    }

    public void dados() {
        super.dados();
        System.out.println("Característica: " + caracteristica);
    }
}
