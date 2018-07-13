
package model;


public class Produto {
    private int codProduto;
    private String descProduto;
    private String detProduto;
    private Double precoProduto;
    private int codCategoria;
    private int codModelo;
    private int codMarca;
    private int codSo;
    private int codProcessador;
    private int codArmazenamento;

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public String getDetProduto() {
        return detProduto;
    }

    public void setDetProduto(String detProduto) {
        this.detProduto = detProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public int getCodModelo() {
        return codModelo;
    }

    public void setCodModelo(int codModelo) {
        this.codModelo = codModelo;
    }

    public int getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(int codMarca) {
        this.codMarca = codMarca;
    }

    public int getCodSo() {
        return codSo;
    }

    public void setCodSo(int codSo) {
        this.codSo = codSo;
    }

    public int getCodProcessador() {
        return codProcessador;
    }

    public void setCodProcessador(int codProcessador) {
        this.codProcessador = codProcessador;
    }

    public int getCodArmazenamento() {
        return codArmazenamento;
    }

    public void setCodArmazenamento(int codArmazenamento) {
        this.codArmazenamento = codArmazenamento;
    }
}
