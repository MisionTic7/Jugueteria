package com.example.demo.controlador;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.interfaceService.IproductoService;

import com.example.demo.modelo.Producto;
public class Controlador2 {
	@Controller
	@RequestMapping
	public class Controlador {
		@Autowired
		private IproductoService service;
		
		@GetMapping("/listar2")
	    public String listar2(Model model) {
		  List<Producto>productos = service.listar2();
		  model.addAttribute("productos",productos);
		return "list2";
	}
		@GetMapping("/new2")
		public String agregar2(Model model) {
			model.addAttribute("producto",new Producto());
			return "form2";
			
		}
		@PostMapping("/save2")
		public String save2(Producto p, Model model) {
			service.save(p);
			return "redirect:/listar2";
		}
		@GetMapping("/editar2/{product_id}")
		public String editar2(@PathVariable int product_id, Model model) {
			Optional<Producto>producto=service.listarId(product_id);
			model.addAttribute("producto", producto);
			return "form2";
		}
		@GetMapping("/eliminar2/{product_id}")
		public String delete(Model model,@PathVariable int product_id) {
			service.delete(product_id);
			return "redirect:/listar2";
		}
}
	}
