package tiendarest.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tiendarest.Entity.Producto;
import tiendarest.Service.productoService;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("api/producto")
public class productoController {

    private final productoService productoService;
    @GetMapping
    public List<Producto> listarProductos (){
        return productoService.getAllProducts();
    }
    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto){
        return productoService.saveProduct(producto);
    }
    @PutMapping("/act/{id}")
    public Producto actualizarProducto(@PathVariable int id, @RequestBody Producto producto){
        return productoService.updateProduct(id, producto);
    }
    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable int id){
        productoService.deleteProduct(id);
    }

}
