class ArbolBinario{
  protected Nodo raiz;
  
  public ArbolBinario(){
    raiz = null;
  }
  
  public void setRaiz(Nodo raiz){
    this.raiz = raiz;
  }
  
  public Nodo getRaiz(){
    return raiz;
  }
  
  public boolean esVacia(){
    return raiz == null;
  }
  
  public interface Comparador<N>{ 
    boolean igualque(N q);
    boolean menorque(N q);
    boolean mayorque(N q);
  }
}