package frb.edu.br.david;

import java.util.List;

public class IdiomaService {
    private IdiomaRepository idiomaRepository;

    public List<Idioma> listAll(){
        return idiomaRepository.findAll();
    }

    public void save(Idioma idioma){
        idiomaRepository.save(idioma);
    }
}
