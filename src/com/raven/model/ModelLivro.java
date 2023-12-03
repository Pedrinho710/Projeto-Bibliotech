
package com.raven.model;


public class ModelLivro {

    /**
     * @return the resumo
     */
    public String getResumo() {
        return resumo;
    }

    /**
     * @param resumo the resumo to set
     */
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    /**
     * @return the prateleira
     */
    public String getPrateleira() {
        return prateleira;
    }

    /**
     * @param prateleira the prateleira to set
     */
    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }

    /**
     * @return the estante
     */
    public String getEstante() {
        return estante;
    }

    /**
     * @param estante the estante to set
     */
    public void setEstante(String estante) {
        this.estante = estante;
    }

    /**
     * @return the ibsn
     */
    public String getIbsn() {
        return ibsn;
    }

    /**
     * @param ibsn the ibsn to set
     */
    public void setIbsn(String ibsn) {
        this.ibsn = ibsn;
    }
    public ModelLivro() {
    }
        private int id;
        private String titulo;
        private String editora;
        private String autor;
        private int nota;
        private String prateleira;
        private String estante;
        private String ibsn;
        private String resumo;
        private String genero;
}
