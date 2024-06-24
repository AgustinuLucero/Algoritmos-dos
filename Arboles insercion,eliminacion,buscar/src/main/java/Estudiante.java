class Estudiante implements Comparador<Estudiante>{ 
  int numMatricula;
  String nombre;
  
  public Estudiante(int numMatricula, String nombre){
    this.numMatricula = numMatricula;
    this.nombre = nombre;
  }
  
  public String getNombre(){
    return this.nombre;
  }
  
  public int getNumMatricula(){
    return this.numMatricula;
  }
  
  public boolean igualque(Estudiante e1) {
    return numMatricula == e1.numMatricula;
  }

  public boolean menorque(Estudiante e1) {
    return numMatricula < e1.numMatricula;
  }

  public boolean mayorque(Estudiante e1) {
    return numMatricula > e1.numMatricula;
  }
}
