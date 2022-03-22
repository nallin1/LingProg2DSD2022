package Exercicio02;

public class Item {
    private int codigo, quantItem;
    private String descricao;
    private double precoItem;

    public Item() {
        codigo = 0;
        quantItem = 0;
        descricao = "";
        precoItem = 0;
    }

    public Item(int codigo, int quantItem, String descricao, double precoItem) {
        this.codigo = codigo;
        this.quantItem = quantItem;
        this.descricao = descricao;
        this.precoItem = precoItem;
    }
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantItem() {
        return this.quantItem;
    }

    public void setQuantItem(int quantItem) {
        if (quantItem >= 0)
            this.quantItem = quantItem;
        else
            quantItem = 0;    
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoItem() {
        return this.precoItem;
    }

    public void setPrecoItem(double precoItem) {
        if (precoItem >= 0)
            this.precoItem = precoItem;
        else
            precoItem = 0;
    }

    public double getTotal(int quantItem, double precoItem) {
        double totalPagar;
        
        totalPagar = quantItem*precoItem;

        return totalPagar;
    }
}
