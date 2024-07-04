class ArbolBinario{
  private Nodo raiz;
  
  public ArbolBinario(){
    this.raiz = null;
  }
  
  public void setRaiz(Nodo raiz){
    this.raiz = raiz;
  }
  
  public Nodo getRaiz(){
    return this.raiz;
  }

  public void preorden(Nodo nodo){
    System.out.println(nodo.getDato());

    if(nodo.getIzq() != null){
      preorden(nodo.getIzq());
    }

    if(nodo.getDer() != null){
      preorden(nodo.getDer());
    }
  }

  public void inorden(Nodo nodo){
    if(nodo.getIzq() != null){
      inorden(nodo.getIzq());
    }

    System.out.println(nodo.getDato());

    if(nodo.getDer() != null){
      inorden(nodo.getDer());
    }
  }

  public void postorden(Nodo nodo){
    if(nodo.getIzq() != null){
      postorden(nodo.getIzq());
    }

    if(nodo.getDer() != null){
      postorden(nodo.getDer());
    }

    System.out.println(nodo.getDato());
  }
}