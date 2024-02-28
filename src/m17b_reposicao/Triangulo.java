package m17b_reposicao;

public class Triangulo extends PoligonoRegular {
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
    public Triangulo(int numeroLados, float medidaLado){
        this.numeroLados = numeroLados;
        this.medidaLado  = medidaLado;
        this.nome        = "Triangulo";
    }
//------------------------------------------------------------------------------
    @Override
    public float getArea() {
        return (float) (getMedidaLado() * getMedidaLado() * 1.732) / 4;
    }
//------------------------------------------------------------------------------
}
