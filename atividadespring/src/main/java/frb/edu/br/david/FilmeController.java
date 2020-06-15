package frb.edu.br.david;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    @RequestMapping("/new")
    public String novoFilme(Model model){
    Filme filme = new Filme();
    model.addAttribute("filme", filme);
    return "novo_filme";
    }

    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    public String saveFilme(@ModelAttribute("filme") Filme filme){
        service.save(filme);
        return "redirect:/";
    }
}
