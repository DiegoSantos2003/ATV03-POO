package model;

public class Animal {
    private String nome;
    private int comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private float velocidade;

    public Animal() {
        this.patas = 4; // Padrão: 4 patas
        this.ambiente = "Terra"; // Padrão: Terra
    }

    public void alteraNome(String nome) {
        this.nome = nome;
    }

    public void alteraComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void alteraPatas(int patas) {
        this.patas = patas;
    }

    public void alteraCor(String cor) {
        this.cor = cor;
    }

    public void alteraAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void alteraVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void dados() {
        System.out.println("Animal: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Patas: " + patas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade: " + velocidade + " m/s");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
}