package br.com.fiap.horadaprotecao.controller;



import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.fiap.horadaprotecao.entity.User;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String home(Model model, Authentication authentication) {
        if (authentication != null) {
            String username = authentication.getName();
            model.addAttribute("username", username);
        }
        return "home";
    }

    @GetMapping("/")
    public String index() {
        return "redirect:home";
    }

    @GetMapping("/user/novo")
    public String novoUsuario(Model model) {
        model.addAttribute("user", new User());
        return "cadastro";
    }
}
