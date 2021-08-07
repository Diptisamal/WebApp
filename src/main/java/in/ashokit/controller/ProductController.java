package in.ashokit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
	@GetMapping(value={"/","/loadform"})
	public String loadForm() {
		return "index";
		
	}
	@PostMapping(value="/saveProduct")
	public String handleSubmitButton(HttpServletRequest req,Model model) {
		String pid = req.getParameter("pid");
		String pname = req.getParameter("pname");
		String price = req.getParameter("price");
		
		System.out.println("product ID :"+pid);
		System.out.println("product Pmame :"+pname);
		System.out.println("product Price :"+price);
		
		model.addAttribute("msg","Product save to catalog Successfully...!!");
		return "success";
	}

}
