package br.com.alura.screenmatch.models;

public class Movie {
    private String name;
    private int realizeYear;
    private boolean haveInPlan;
    private double somaDasAvaliacoes;
    private int totalOfRate;
    private int timeInMinutes;


    public String getName() {
        return name;
    }

    public int getRealizeYear() {
        return realizeYear;
    }

    public boolean isHaveInPlan() {
        return haveInPlan;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public int getTotalOfRate(){
        return totalOfRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRealizeYear(int realizeYear) {
        this.realizeYear = realizeYear;
    }

    public void setHaveInPlan(boolean haveInPlan) {
        this.haveInPlan = haveInPlan;
    }

    public void setTimeInMinutes(int timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

    public void showDetais(){
        System.out.println("Nome do filme: " +name);
        System.out.println("Ano de lançamento: " +realizeYear);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalOfRate++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalOfRate;
    }
}