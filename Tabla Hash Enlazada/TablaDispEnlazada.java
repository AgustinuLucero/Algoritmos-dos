class TablaDispEnlazada{
  static final double r = 0.618;
  static final int tam=97;

  static int dispersion(int x){
    int v;
    double t;
    t=r*x - Math.floor(r*x);
    v=(int)(t*tam);
    return v;
  }
  
  //creo la tabla
  Elementos [] tabla = new Elementos[tam];
  int cantElem;

  //inicializo la tabla 
  public TablaDispEnlazada(){
    for(int i=0; i<tam; i++){
      tabla[i]=null;
    }
    cantElem=0;
  }

  //insertar elemento
  public void insertar(TipoSocio s){
    Elementos e = new Elementos(s);
    int posicion = dispersion(s.getCodigo());
    e.siguiente = tabla[posicion];
    tabla[posicion]=e;
    cantElem++;
  }
  
  //buscar un elemento
  public Elementos buscar(int codigo){
    int posicion = dispersion(codigo);
    Elementos aux = tabla[posicion];
    while(aux!=null && aux.getSocio().getCodigo() !=codigo){
      aux=aux.siguiente;
    }
    return aux;
  }

  //eliminar un elemento
  public void eliminar(int codigo) {
      int posicion = dispersion(codigo);
      Elementos anterior = null;
      Elementos actual = tabla[posicion];

      while (actual != null && actual.getSocio().getCodigo() != codigo) {
          anterior = actual;
          actual = actual.siguiente;
      }

      if (actual != null) {
          if (anterior == null) {
              tabla[posicion] = actual.siguiente;
          } else {
              anterior.siguiente = actual.siguiente;
          }
        
        cantElem--;
        System.out.println("Elemento eliminado");
        System.gc();
      }else{
        System.out.println("No se encontro el socio");
      }
  }
  
  //muestro los elementos
  public void mostrar() {
      for (int i = 0; i < tam; i++) {
          Elementos actual = tabla[i];
          while (actual != null) {
            System.out.println(actual.getSocio());
            actual = actual.siguiente;
          }
      }
  }


  
}