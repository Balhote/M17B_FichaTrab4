package m17b_reposicao;

//https://github.com/Balhote/M17B_FichaTrab4

public abstract class PoligonoRegular {
//------------------------------------------------------------------------------
    int numeroLados;
    float medidaLado;
    String nome;
//------------------------------------------------------------------------------   

    
//------------------------------------------------------------------------------
    public float getPerimetro() {
        return getNumeroLados() * getMedidaLado();
    }
//------------------------------------------------------------------------------    
    public abstract float getArea();

//------------------------------------------------------------------------------        
    @Override
    public String toString() {
        return this.getNome()+": Perimetro: " + this.getPerimetro() + "; " + "Area: " + this.getArea();
    }    

    /**
     * @return the numeroLados
     */
    public int getNumeroLados() {
        return numeroLados;
    }

    /**
     * @param numeroLados the numeroLados to set
     */
    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    /**
     * @return the medidaLado
     */
    public float getMedidaLado() {
        return medidaLado;
    }

    /**
     * @param medidaLado the medidaLado to set
     */
    public void setMedidaLado(float medidaLado) {
        this.medidaLado = medidaLado;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
