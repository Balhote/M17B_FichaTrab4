package m17b_reposicao;

public class Quadrado extends PoligonoRegular {

//------------------------------------------------------------------------------
    public Quadrado(int numeroLados, float medidaLado){
        this.numeroLados = numeroLados;
        this.medidaLado = medidaLado;
        this.nome       = "Quadrado";
    }
//------------------------------------------------------------------------------
    @Override
    public float getArea() {
        return (float) getMedidaLado() * getMedidaLado();
    }
//------------------------------------------------------------------------------
}