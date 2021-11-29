/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author edith
 */
public class Predio {
    int idpredio;
    float clave;
    float superficie;
    double valor;
    String ubucacion;
    float anio;
    double total;

    public Predio() {
    }

    public Predio(int idpredio, float clave, float superficie, double valor, String ubucacion, float anio, double total) {
        this.idpredio = idpredio;
        this.clave = clave;
        this.superficie = superficie;
        this.valor = valor;
        this.ubucacion = ubucacion;
        this.anio = anio;
        this.total = total;
    }

    public int getIdpredio() {
        return idpredio;
    }

    public void setIdpredio(int idpredio) {
        this.idpredio = idpredio;
    }

    public float getClave() {
        return clave;
    }

    public void setClave(float clave) {
        this.clave = clave;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUbucacion() {
        return ubucacion;
    }

    public void setUbucacion(String ubucacion) {
        this.ubucacion = ubucacion;
    }

    public float getAnio() {
        return anio;
    }

    public void setAnio(float anio) {
        this.anio = anio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
