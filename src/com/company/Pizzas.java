package com.company;

public class Pizzas {
    private String masa;
    private boolean relleno;
    private int tipo;
    private boolean salsa;
    private String tipoSalsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean extraQueso;
    private boolean piña;
    private boolean champiñones;
    private boolean jamon;
    public static final String NORMAL = "normal";
    public static final String INTEGRAL = "integral";
    public static final String FINA = "fina";
    public static final String PAN = "pan";
    public static final int FAMILIAR = 0;
    public static final int MEDIANA = 1;
    public static final int PEQUEÑA = 2;
    public static final String BARBACOA = "barbacoa";
    public static final String SOLOTOMATE = "soloTomate";
    public static final String SALSASINGLUTEN = "salsaSinGluten";

    public Pizzas() {
        this.masa = NORMAL;
        this.relleno = false;
        this.tipo = MEDIANA;
        this.salsa = true;
        this.tipoSalsa = SOLOTOMATE;
        this.cebolla = true;
        this.sinGluten = false;
        this.extraQueso = false;
        this.piña = false;
        this.champiñones = false;
        this.jamon = false;
    }
    public Pizzas(String masa, boolean relleno, int tipo, boolean salsa,
                  String tipoSalsa, boolean cebolla, boolean sinGluten,
                  boolean extraQueso, boolean piña, boolean champiñones,
                  boolean jamon){
        this.masa = masa;
        this.relleno = relleno;
        this.tipo = tipo;
        this.salsa = salsa;
        this.tipoSalsa = tipoSalsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.piña = piña;
        this.champiñones = champiñones;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPiña() {
        return piña;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    @Override
    public String toString() {
        return
                "Masa='" + masa + '\'' +
                        ", relleno=" + relleno +
                        ", tipo=" + tipo +
                        ", salsa=" + salsa +
                        ", tipoSalsa='" + tipoSalsa + '\'' +
                        ", cebolla=" + cebolla +
                        ", sinGluten=" + sinGluten +
                        ", extraQuesa=" + extraQueso +
                        ", piña=" + piña +
                        ", champiñones=" + champiñones +
                        ", jamon=" + jamon;
    }
}