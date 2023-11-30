package company.inventarios.servico;

import company.inventarios.modelo.Producto;


import java.util.List;

public interface IProductoServicio {
    public List<Producto>ListarProducto();

    public Producto buscarProductoId(Integer idPrpducto);
    public Producto guardarProducto(Producto productoG);
    public void  eliminarProductoPorId(Integer idProducto);
}
