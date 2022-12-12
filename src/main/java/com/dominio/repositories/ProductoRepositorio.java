package com.dominio.repositories;

import com.dominio.entities.Producto;
import org.springframework.data.jpa.repository.*;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {

}
