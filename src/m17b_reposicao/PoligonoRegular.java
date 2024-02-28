package m17b_reposicao;

//https://github.com/Balhote/M17B_FichaTrab4

public abstract class PoligonoRegular {
//------------------------------------------------------------------------------
    protected int numeroLados;
    protected float medidaLado;
    protected String nome;
//------------------------------------------------------------------------------   

    
//------------------------------------------------------------------------------
    public float getPerimetro() {
        return numeroLados * medidaLado;
    }
//------------------------------------------------------------------------------    
    public abstract float getArea();

//------------------------------------------------------------------------------        
    @Override
    public String toString() {
        return this.nome+": Perimetro: " + this.getPerimetro() + "; " + "Area: " + this.getArea();
    }    
}
