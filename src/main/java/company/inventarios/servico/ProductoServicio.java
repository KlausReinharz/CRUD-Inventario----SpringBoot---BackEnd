package company.inventarios.servico;

import company.inventarios.modelo.Producto;
import company.inventarios.respositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductoServicio implements IProductoServicio{
    @Autowired
    private ProductoRepositorio productoRepositorio;
    @Override
    public List<Producto> ListarProducto() {
        return this.productoRepositorio.findAll();
    }

    @Override
    public Producto buscarProductoId(Integer idProducto) {
        Producto product = this.productoRepositorio.findById(idProducto).orElse(null);
        return product;
    }

    @Override
    public Producto guardarProducto(Producto productoG) {
        return this.productoRepositorio.save(productoG);

    }

    @Override
    public void eliminarProductoPorId(Integer idProducto) {
        this.productoRepositorio.deleteById(idProducto);

    }
}
