package com.dominio.services;

import com.dominio.entities.Producto;

public interface ProductoServicio {

    Iterable<Producto> listarProductos();

    Producto obtenerProductoPorId(Integer id);

    Producto guardarProductos(Producto producto);

    void eliminarProductoPorId(Integer id);

}
