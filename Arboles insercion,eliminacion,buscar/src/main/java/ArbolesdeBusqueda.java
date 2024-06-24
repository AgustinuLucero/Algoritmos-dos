//Arboles de busqueda.java
public class ArbolesdeBusqueda  extends ArbolBinario{
  
  public ArbolesdeBusqueda(){
    super();
  }

  //RECORRIDOS
  //preorden
  public void preorden(Nodo raiz){
    Estudiante e = (Estudiante) raiz.getDato();

    System.out.println(e.getNombre() + " " + e.getNumMatricula() );
    if(raiz.getIzq() != null){
      preorden(raiz.getIzq());
    }
    if(raiz.getDer() != null){
      preorden(raiz.getDer());
    }
  }
  
  //inorden
  public void inorden(Nodo raiz){
    if(raiz.getIzq() != null){
      inorden(raiz.getIzq());
    }

    Estudiante e = (Estudiante) raiz.getDato();

    System.out.println(e.getNombre() + " " + e.getNumMatricula() );

    if(raiz.getDer() != null){
      inorden(raiz.getDer());
    }
  }
  
  //postorden
  public void postorden(Nodo raiz){
    if(raiz.getIzq() != null){
      postorden(raiz.getIzq());
    }
    if(raiz.getDer() != null){
      postorden(raiz.getDer());
    }
    Estudiante e = (Estudiante) raiz.getDato();

    System.out.println(e.getNombre() + " " + e.getNumMatricula() );
  }
  
  //BUSQUEDA
  public Nodo buscar(Estudiante dato){
    if(raiz == null){
      return null;
    }else{
      return localizar(raiz, dato);
    }
  }
  
  protected Nodo localizar(Nodo raizSub, Estudiante dato){
    if(raizSub == null){
      return null;
    }else if(dato.igualque(raizSub.getDato())){ 
      return raizSub;
    }else if(dato.menorque(raizSub.getDato())){ 
      return localizar(raizSub.getIzq(), dato);
    }else{
      return localizar(raizSub.getDer(), dato);
    }
  }

  
  //INSERTAR
  public void insertar(Estudiante dato) throws Exception{
    raiz = insertar(raiz, dato);
  }
  
  protected Nodo insertar(Nodo raizSub, Estudiante dato){
    if(raizSub == null){
      raizSub = new Nodo(dato);
    }else if( dato.menorque(raizSub.getDato()) ){
      raizSub.setIzq( insertar(raizSub.getIzq(), dato) );
    }else if( dato.mayorque(raizSub.getDato()) ){
      raizSub.setDer(insertar(raizSub.getDer(), dato));
    }else{
      System.out.println("Dato duplicado");
    }
    return raizSub;
  }

  
  //ELIMINAR
  public void eliminar(Estudiante dato) throws Exception{
    raiz = eliminar(raiz, dato);
  }
  
  protected Nodo eliminar(Nodo raizSub, Estudiante dato){ 
    if(raizSub == null){
      System.out.println("Nodo no encontrado");
    }else{
      if(dato.menorque(raizSub.getDato())){
        raizSub.setIzq(eliminar(raizSub.getIzq(), dato));
        
      }else if(dato.mayorque(raizSub.getDato())){
        raizSub.setDer(eliminar(raizSub.getDer(), dato));
        
      }else{
        if(raizSub.getIzq() == null){
          return raizSub.getDer();
          
        }else if(raizSub.getDer() == null){
          return raizSub.getIzq();
          
        }else{
          raizSub.setDato(minimo(raizSub.getDer()));
          raizSub.setDer(eliminar(raizSub.getDer(), raizSub.getDato()));
        }
      }
    }
    
    return raizSub;
  }
  
  protected Estudiante minimo(Nodo raizSub){
    if(raizSub.getIzq() == null){
      return raizSub.getDato();
      
    }else{
      return minimo(raizSub.getIzq());
    }
  }
}