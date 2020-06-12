package frb.edu.br.david;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FilmeController {
    @Autowired
    private FilmeService service;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Filme> listFilmes = service.listAll();
        model.addAttribute("listFilmes", listFilmes);

        return "index";
    }
}
