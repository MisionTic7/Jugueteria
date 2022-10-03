package com.example.demo.interfaceService;
import java.util.List;
import java.util.Optional;
import com.example.demo.modelo.Producto;

public interface IproductoService {
   public List<Producto>listar2();
   public Optional<Producto>listarId(int product_id);
   public int save(Producto p);
   public void delete(int product_id);
}
