import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) 
    {
        this.adminService = adminService;
    }

    @GetMapping("/products")
    public String getProductList(Model model) {
        List<Product> products = adminService.getAllProducts();
        model.addAttribute("products", products);
        return "admin/product_list";
    }

    @GetMapping("/add-product")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "admin/add_product";
    }

    @PostMapping("/add-product")
    public String addProduct(@ModelAttribute("product") Product product) {
        adminService.addProduct(product);
        return "redirect:/admin/products";
    }

    // Other methods for managing customers
}
