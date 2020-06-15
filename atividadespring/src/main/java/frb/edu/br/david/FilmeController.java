package frb.edu.br.david;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/editar/{filme_id}")
    public ModelAndView editarFilme(@PathVariable(name = "filme_id") Integer filme_id){
       ModelAndView mav = new ModelAndView("editar_filme");
       Filme filme = service.get(filme_id);
       mav.addObject("filme", filme);

        return mav;
    }

    @RequestMapping("delete/{filme_id}")
    public String deleteFilme(@PathVariable(name = "filme_id") Integer filme_id){
        service.delete(filme_id);

        return "redirect:/";
    }
}
