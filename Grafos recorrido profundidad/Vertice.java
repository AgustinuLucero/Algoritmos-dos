public class Vertice{
  String nombre;
  int numvertice;
  
  public Vertice(String nombre){
    this.nombre = nombre;
    this.numvertice = -1;
  }
  
  public String nomvertice(){
    return nombre;
  }

  public void asigVertice(int num){
    this.numvertice = num;
  }
  
  public boolean equals(Vertice n){
    return nombre.equals(n.nombre);
  }

  @Override
  public String toString(){
    return nombre  +"("+ numvertice +")";
  }
  
}