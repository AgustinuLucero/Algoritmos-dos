public class Main {
  public static void main(String[] args) {
    GrafoMatriz grafo = new GrafoMatriz(6);
    grafo.nuevoVertice("A");
    grafo.nuevoVertice("B");
    grafo.nuevoVertice("C");
    grafo.nuevoVertice("D");
    grafo.nuevoVertice("E");
    grafo.nuevoVertice("F");

    try{
      grafo.arco(grafo.numVertice("A"),grafo.numVertice("B"));
      grafo.arco(grafo.numVertice("A"),grafo.numVertice("C"));
      grafo.arco(grafo.numVertice("A"),grafo.numVertice("F"));
      grafo.arco(grafo.numVertice("B"),grafo.numVertice("C"));
      grafo.arco(grafo.numVertice("C"),grafo.numVertice("E"));
      grafo.arco(grafo.numVertice("C"),grafo.numVertice("D"));
      grafo.arco(grafo.numVertice("D"),grafo.numVertice("C"));
      grafo.arco(grafo.numVertice("D"),grafo.numVertice("E"));
      grafo.arco(grafo.numVertice("E"),grafo.numVertice("F"));
      GrafoAdy recorrido = new GrafoAdy(6);
      System.out.print("Recorrido por profundidad: \n");
      recorrido.recorrerProf(grafo, "A");
    }catch(Exception e){
      System.out.println("Error" + e.getMessage());
    }
  
    
  }
}