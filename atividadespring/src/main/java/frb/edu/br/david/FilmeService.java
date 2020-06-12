package frb.edu.br.david;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {
    @Autowired
    private FilmeRepository repository;

    public List<Filme> listAll(){
        return repository.findAll();
    }

    public void save(Filme filme){
        repository.save(filme);
    }

    public Filme get(Integer filme_id){
        return repository.findById(filme_id).get();
    }

    public void delete(Integer filme_id){
        repository.deleteById(filme_id);
    }
}
