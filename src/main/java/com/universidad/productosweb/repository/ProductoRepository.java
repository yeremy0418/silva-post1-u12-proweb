package com.universidad.productosweb.repository;

import com.universidad.productosweb.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
