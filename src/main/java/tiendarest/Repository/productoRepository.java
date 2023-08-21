package tiendarest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tiendarest.Entity.Producto;

@Repository
public interface productoRepository extends JpaRepository<Producto, Integer> {

}
