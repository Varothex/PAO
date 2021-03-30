package com.tema1.medic;

public class Chirurg extends Medic
{
    static final int bonus = 6;

    public Chirurg(String nume, String cabinet, double salariu)
    {
        super(nume, cabinet, salariu);
    }

    @Override
    public double salariu()
    {
        return salariu * bonus;
    }

    @Override
    public String toString()
    {
        return "Medicul primar " + nume + " care lucreaza la " + cabinet + " are salariul de " + salariu + " lei.\n\n";
    }
}
