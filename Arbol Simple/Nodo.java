class Nodo{
  Object dato;
  private Nodo izq;
  private Nodo der;

  public Nodo(Object dato){
    this.dato = dato;
    this.izq = null;
    this.der = null;
  }

  public Nodo(Object dato, Nodo izq, Nodo der){
    this.dato = dato;
    this.izq = izq;
    this.der = der;
  }

  //metodos getters
  public Object getDato(){
    return this.dato;
  }
  public Nodo getIzq(){
    return this.izq;
  }
  public Nodo getDer(){
    return this.der;
  }
  
  //metos setters
  public void setDato(Object dato){
    this.dato = dato;
  }
  public void setIzq(Nodo izq){
    this.izq = izq;
  }
  public void setDer(Nodo der){
    this.der = der;
  }


  
}