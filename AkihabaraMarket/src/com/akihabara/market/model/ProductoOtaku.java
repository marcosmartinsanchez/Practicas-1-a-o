package com.akihabara.market.model;
public class ProductoOtaku {
   private String nombre;
   private String categoria;
   private double precio;
   // Constructor vacío
   public ProductoOtaku() {
   }
   // Constructor con parámetros
   public ProductoOtaku(String nombre, String categoria, double precio) {
       this.nombre = nombre;
       this.categoria = categoria;
       this.precio = precio;
   }
   // Métodos getter y setter
   public String getNombre() {
       return nombre;
   }
   public void setNombre(String nombre) {
       this.nombre = nombre;
   }
   public String getCategoria() {
       return categoria;
   }
   public void setCategoria(String categoria) {
       this.categoria = categoria;
   }
   public double getPrecio() {
       return precio;
   }
   public void setPrecio(double precio) {
       this.precio = precio;
   }
   // Método toString
   @Override
   public String toString() {
       return "Producto: " + nombre + ", Categoría: " + categoria + ", Precio: $" + precio;
   }
}
