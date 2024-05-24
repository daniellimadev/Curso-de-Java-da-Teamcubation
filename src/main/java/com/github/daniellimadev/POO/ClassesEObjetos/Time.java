package com.github.daniellimadev.POO.ClassesEObjetos;


public class Time {
    private String nome;
    private int gols;

   public Time(String nome, int gols) {
        this.nome = nome;
        this.gols = gols;
   }

   public String getNome() {
       return nome;
   }

   public int getGols() {
       return gols;
   }

   public void setGols(int gols) {
       this.gols = gols;
   }

   public String getInformacoes() {
       return this.getNome() + ": " + this.getGols();
   }
   // Sobrecarga de Métodos
   /*
   public void setDados(String nome) {
       this.nome = nome;
       gols = 0;
   }

   public void setDados(String nome, int gols) {
       this.nome = nome;
       this.gols = gols;
   }
   */
}
