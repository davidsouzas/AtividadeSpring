package frb.edu.br.david;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Filme {
    private Integer filme_id;
    private String titulo;
    private String descricao;
    private Integer ano_de_lancamento;
    private Integer idioma_id;
    private Integer duracao_da_locacao;
    private Float preco_da_locacao;
    private String duracao_do_filme;
    private Float custo_de_substituicao;
    private Integer classificao;
    private Date ultima_atualizacao;

    protected Filme() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getFilme_id() {
        return filme_id;
    }

    public void setFilme_id(Integer filme_id) {
        this.filme_id = filme_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getAno_de_lancamento() {
        return ano_de_lancamento;
    }

    public void setAno_de_lancamento(Integer ano_de_lancamento) {
        this.ano_de_lancamento = ano_de_lancamento;
    }

    public Integer getIdioma_id() {
        return idioma_id;
    }

    public void setIdioma_id(Integer idioma_id) {
        this.idioma_id = idioma_id;
    }

    public Integer getDuracao_da_locacao() {
        return duracao_da_locacao;
    }

    public void setDuracao_da_locacao(Integer duracao_da_locacao) {
        this.duracao_da_locacao = duracao_da_locacao;
    }

    public Float getPreco_da_locacao() {
        return preco_da_locacao;
    }

    public void setPreco_da_locacao(Float preco_da_locacao) {
        this.preco_da_locacao = preco_da_locacao;
    }

    public String getDuracao_do_filme() {
        return duracao_do_filme;
    }

    public void setDuracao_do_filme(String duracao_do_filme) {
        this.duracao_do_filme = duracao_do_filme;
    }

    public Float getCusto_de_substituicao() {
        return custo_de_substituicao;
    }

    public void setCusto_de_substituicao(Float custo_de_substituicao) {
        this.custo_de_substituicao = custo_de_substituicao;
    }

    public Integer getClassificao() {
        return classificao;
    }

    public void setClassificao(Integer classificao) {
        this.classificao = classificao;
    }

    public Date getUltima_atualizacao() {
        return ultima_atualizacao;
    }

    public void setUltima_atualizacao(Date ultima_atualizacao) {
        this.ultima_atualizacao = ultima_atualizacao;
    }
}
