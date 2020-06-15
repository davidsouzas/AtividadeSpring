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

    public Idioma get(Integer idioma_id){
        return idiomaRepository.findById(idioma_id).get();
    }

    public void delete(Integer idioma_id){
        idiomaRepository.deleteById(idioma_id);
    }
}
