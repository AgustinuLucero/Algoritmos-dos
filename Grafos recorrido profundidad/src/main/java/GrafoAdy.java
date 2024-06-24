import java.util.Stack;

class GrafoAdy{
  int numVert;
  static int maxVert = 20;
  Vertice [] tablaAdy;
  
  
  public GrafoAdy(int mx){
    tablaAdy = new Vertice[mx];
    numVert = 0;
    maxVert = mx;
  }
  

  static public int[] recorrerProf(GrafoMatriz grafo, String org) throws Exception{
    int v,w;
    Stack<Integer> pila = new Stack<Integer>();
    int [] m = new int[grafo.numvertices];
    v = grafo.numVertice(org);
    
    if(v<0) throw new Exception("Vertice no existe");
    
    for(int i=0;i<grafo.numvertices;i++){
      m[i]=-1;
    }
    m[v]=0;
    pila.push(v);
    
    while(!pila.empty()){
      Integer cw;
      cw = (Integer) pila.pop();
      w = cw.intValue();
      System.out.println("Vertice " + grafo.vertices[w].nomvertice() + " visitado");
      for(int i=0;i<grafo.numvertices;i++){
        if(grafo.matrizAdy[w][i] == 1 && m[i] == -1){
          pila.push(i);
          m[i] = 0;
        }
      }
    }
    return m;
  }
}