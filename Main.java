package com.akihabara.market.model;

import com.akihabara.market.dao.DatabaseConnection;

/**
 * Clase principal para probar la conexión a la base de datos y mostrar un producto.
 */
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de DatabaseConnection
        DatabaseConnection dbConnection = new DatabaseConnection();

        // Verificar si la conexión se ha establecido correctamente
        if (dbConnection.getConexion() != null) {
            System.out.println("Conexión a la base de datos está activa.");
        } else {
            System.out.println("No se pudo establecer la conexión a la base de datos.");
        }

        // Crear un objeto de tipo ProductoOtaku con valores de prueba
        ProductoOtaku producto = new ProductoOtaku("Figurine de Goku", "Figuras", 29.99);
        // Mostrar el contenido del producto usando toString()
        System.out.println(producto);

        // Cerrar la conexión
        dbConnection.cerrarConexion();
    }
}
