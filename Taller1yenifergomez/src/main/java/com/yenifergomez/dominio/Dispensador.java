package com.yenifergomez.dominio;

public class Dispensador {
    public int serial;
    public String marca;
    public float cantidadMaxima;
    public float cantidadMinima;
    public byte cantidadActual;
    public byte nivelActual;
    public byte temperatura;
    public short tamaño;



    public boolean servir(float valorServir){
        if(this.cantidadMinima >= valorServir && this.cantidadMaxima <= valorServir){
            return true;
        }else{
            return false;
        }
    }

    public void llenar(float valorLlenar){
        this.cantidadActual += valorLlenar;
    }

    public void vaciar(float valorVaciar){
        this.cantidadActual -= valorVaciar;
    }

    public byte calentar(byte nuevaTemperatura){
        if (nuevaTemperatura>20 && nuevaTemperatura <=90){
            this.temperatura = nuevaTemperatura;
            return nuevaTemperatura;
        }else{
            return this.temperatura;}
    }

    public byte enfriar(byte nuevaTemperatura){
        if (nuevaTemperatura>1 && nuevaTemperatura <=19){
            this.temperatura = nuevaTemperatura;
            return nuevaTemperatura;
        }else{
            return this.temperatura;}
    }

    public String mostrarNivel(){
        String nivel = null;

        switch (this.nivelActual){
            case 'E':
                nivel = "Emergente";
                break;
            case 'M':
                nivel = "Medio";
                break;
            case 'S':
                nivel = "Superior";
                break;
        }
        return  nivel;
    }
}
