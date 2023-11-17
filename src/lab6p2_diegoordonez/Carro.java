
package lab6p2_diegoordonez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

public class Carro {

    private String marca;
    private String modelo;
    private Color color;
    private double precio;
    private ArrayList<String> mejoras = new ArrayList();
    private int tipo;
    private String pais;
    private Date fabricacion;

    public Carro() {
    }

  

    public Carro(String marca, String modelo, Color color, double precio, int tipo, String pais, Date fabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.tipo = tipo;
        this.pais = pais;
        this.fabricacion = fabricacion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMejoras(ArrayList<String> mejoras) {
        this.mejoras = mejoras;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(Date fabricacion) {
        this.fabricacion = fabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Color getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public ArrayList<String> getMejoras() {
        return mejoras;
    }

    public int getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + ", mejoras=" + mejoras + ", tipo=" + tipo + ", pais=" + pais + ", fabricacion=" + fabricacion + '}';
    }

  

}