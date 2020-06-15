package frb.edu.br.david;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
