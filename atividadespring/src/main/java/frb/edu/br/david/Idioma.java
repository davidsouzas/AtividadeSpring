package frb.edu.br.david;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Idioma {
    private Integer idioma_id;
    private String nome;
    private Date ultima_atualizacao;

    protected Idioma(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdioma_id() {
        return idioma_id;
    }

    public void setIdioma_id(Integer idioma_id) {
        this.idioma_id = idioma_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getUltima_atualizacao() {
        return ultima_atualizacao;
    }

    public void setUltima_atualizacao(Date ultima_atualizacao) {
        this.ultima_atualizacao = ultima_atualizacao;
    }
}
