package frb.edu.br.david;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.Id;
import java.util.List;

@Controller
public class IdiomaController {
    
    private IdiomaService idiomaService;

    @RequestMapping("/Idioma")
    public String viewHomePage(Model model){
        List<Idioma> listIdiomas = idiomaService.listAll();
        model.addAttribute("listIdiomas", listIdiomas);
        return  "indexIdioma";
    }

    @RequestMapping("/new")
    public String novoIdioma(Model model){
        Idioma idioma = new Idioma();
        model.addAttribute("idioma", idioma);
        return "novo_idioma";
    }

    @RequestMapping(value = "/idioma", method = RequestMethod.POST)
    public String saveIdioma(@ModelAttribute("idioma") Idioma idioma){
        idiomaService.save(idioma);
        return "redirect:/";
    }

    @RequestMapping("/editar/{idioma_id}")
    public ModelAndView editarFilme(@PathVariable(name = "idioma_id") Integer idioma_id){
        ModelAndView mav = new ModelAndView("editar_idioma");
        Idioma idioma = idiomaService.get(idioma_id);
        mav.addObject("idioma", idioma);

        return mav;
    }

    @RequestMapping("delete/{filme_id}")
    public String deleteFilme(@PathVariable(name = "idioma_id") Integer idioma_id){
        idiomaService.delete(idioma_id);

        return "redirect:/";
    }
}
