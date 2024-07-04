public class GrafoMatriz{
  int numvertices;
  static int maxvertices = 20;
  Vertice vertices[];
  int matrizAdy[][];

  public GrafoMatriz(){
    this(maxvertices);
  }
  
  public GrafoMatriz(int mx){
    matrizAdy= new int [mx][mx];
    vertices = new Vertice[mx];
    for(int i=0;i< mx;i++){
      for(int j=0;j< mx;j++){
        matrizAdy[i][j]=0;
      }
    }
    numvertices = 0;
  }
  
  public int numVertice(String vs){
    Vertice v = new Vertice(vs);
    int i = 0;
    for(i=0;i<numvertices;i++){
      if(vertices[i].equals(v)){
        return i;
      }
    }
    return -1;
  }
  
  public void nuevoVertice(String nombre){
    boolean esta = (numVertice(nombre) >= 0);
    
    if(!esta){
      Vertice v = new Vertice(nombre);
      v.asigVertice(numvertices);
      vertices[numvertices++] = v;
    }else{
      System.out.println("El vertice ya existe");
    }
  }

  public void arco(int a, int b) throws Exception{
    if(a>=0 || b>=0 && a<numvertices && b<numvertices){
      matrizAdy[a][b] = 1;
    }else{
      throw new Exception("Error: Vertice no existe");
    }
  }

  public boolean adyacente(String a,String b) throws Exception{
    int va,vb;
    va = numVertice(a);
    vb = numVertice(b);
    if(va<0 || vb<0) throw new Exception("Vertice no existente");
    return matrizAdy[va][vb] == 1;
  }
  
  public boolean adyance(int a,int b) throws Exception{
    if(a<0 || b<0) throw new Exception("Vertice no existente");
    return matrizAdy[a][b] == 1;
  }
  
}