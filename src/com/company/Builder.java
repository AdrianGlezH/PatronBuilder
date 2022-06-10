package com.company;

public class Builder {

    protected Pizzas _pizza;

    public Pizzas build(){
        return this._pizza;
    }

    public Builder() {
        _pizza = new Pizzas();
    }

    //metodos
    public Builder setMasa(int masa){
        _pizza.setMasa(String.valueOf(masa));
        return this;
    }

    public Builder setRelleno(boolean relleno){
        _pizza.setRelleno(relleno);
        return this;
    }

    public Builder setTipo(int tipo){
        _pizza.setTipo(tipo);
        return this;
    }

    public Builder setSalsa(boolean salsa){
        _pizza.setSalsa(salsa);
        return this;
    }

    public Builder setTipoSalsa(String tipoSalsa){
        _pizza.setTipoSalsa(tipoSalsa);
        return this;
    }

    public Builder cebolla(boolean cebolla){
        _pizza.setCebolla(cebolla);
        return this;
    }

    public Builder setSinGluten(boolean sinGluten){
        _pizza.setSinGluten(sinGluten);
        return this;
    }

    public Builder setExtraQueso(boolean extraQueso){
        _pizza.setExtraQueso(extraQueso);
        return this;
    }

    public Builder setPiña(boolean piña){
        _pizza.setPiña(piña);
        return this;
    }

    public Builder setChampiñones(boolean champiñones){
        _pizza.setChampiñones(champiñones);
        return this;
    }

    public Builder setJamon(boolean jamon){
        _pizza.setJamon(jamon);
        return this;
    }
}