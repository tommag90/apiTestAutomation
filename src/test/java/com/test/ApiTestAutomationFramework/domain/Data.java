package com.test.ApiTestAutomationFramework.domain;

public class Data {
    private String iD_Nation;
    private String nation;
    private int iD_Year;
    private int year;
    private int population;
    private String slug_Nation;

    public Data(String iD_Nation, String nation, int iD_Year, int year, int population, String slug_Nation) {
        this.iD_Nation = iD_Nation;
        this.nation = nation;
        this.iD_Year = iD_Year;
        this.year = year;
        this.population = population;
        this.slug_Nation = slug_Nation;
    }

    public String getiD_Nation() {
        return iD_Nation;
    }

    public void setiD_Nation(String iD_Nation) {
        this.iD_Nation = iD_Nation;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        nation = nation;
    }

    public int getiD_Year() {
        return iD_Year;
    }

    public void setiD_Year(int iD_Year) {
        this.iD_Year = iD_Year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getSlug_Nation() {
        return slug_Nation;
    }

    public void setSlug_Nation(String slug_Nation) {
        this.slug_Nation = slug_Nation;
    }
}
