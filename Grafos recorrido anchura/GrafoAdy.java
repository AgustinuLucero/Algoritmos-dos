import java.util.Queue;
import java.util.LinkedList;

class GrafoAdy{
  int numVert;
  static int maxVert = 20;
  Vertice [] tablaAdy;
  
  
  public GrafoAdy(int mx){
    tablaAdy = new Vertice[mx];
    numVert = 0;
    maxVert = mx;
  }

  public static int[] recorrerAnchura(GrafoMatriz g, String org) throws Exception{
    int [] m;
    int v,w;
    v = g.numVertice(org);
    
    if(v<0) throw new Exception("Vertice no existe");
    
    Queue<Integer> cola = new LinkedList<Integer>();
    
    m = new int[g.numvertices];
    for(int i=0;i<g.numvertices;i++){
      m[i] = -1;
    }
    
    m[v] = 0;
    cola.add(v);
    
    while(!cola.isEmpty()){
      Integer cw;
      cw = (Integer) cola.remove();
      w =cw.intValue();
      System.out.println("Vertice: " + g.vertices[w] + "visitado");
      
      for(int i=0;i<g.numvertices;i++){
        if(g.matrizAdy[w][i] == 1 && m[i]== -1){
          m[i]=m[w]+1;
          cola.add(i);
        }
      }
    }
    
    return m;
  }
}