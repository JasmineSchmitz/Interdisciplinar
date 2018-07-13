
package model;

public class Pedido {
    private int codPedido;
    private int codCarrinho;
    private String UF;
    private String nomeCliente;
    private String CPF;
    private String endereco;
    private int num;
    private String bairro;
    private String complemento;
    private String cidade;

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public int getCodCarrinho() {
        return codCarrinho;
    }

    public void setCodCarrinho(int codCarrinho) {
        this.codCarrinho = codCarrinho;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
}
