class Nodo{
  protected Estudiante dato;
  protected Nodo der;
  protected Nodo izq;
  
  public Nodo(Estudiante dato){
    this.dato = dato;
    this.der = null;
    this.izq = null;
  }

  public Nodo(Nodo izq, Estudiante dato, Nodo der){
    this.izq = izq;
    this.dato = dato;
    this.der = der;
  }

  //metodos getters
  public Estudiante getDato(){
    return this.dato;
  }
  public Nodo getIzq(){
    return this.izq;
  }
  public Nodo getDer(){
    return this.der;
  }
  
  //metodos setters
  public void setDato(Estudiante dato){
    this.dato = dato;
  }
  public void setIzq(Nodo izq){
    this.izq = izq;
  }
  public void setDer(Nodo der){
    this.der = der;
  }
  
}
