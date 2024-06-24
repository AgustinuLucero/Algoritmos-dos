public class Main {
  public static void main(String[] args) {
    GrafoMatriz grafo = new GrafoMatriz(6);
    grafo.nuevoVertice("A");
    grafo.nuevoVertice("B");
    grafo.nuevoVertice("C");
    grafo.nuevoVertice("D");
    grafo.nuevoVertice("E");
    grafo.nuevoVertice("F");
    System.out.print("Recorrido en anchura del grafo: \n");
    try{
      grafo.arco(grafo.numVertice("A"),grafo.numVertice("B"));
      grafo.arco(grafo.numVertice("A"),grafo.numVertice("C"));
      grafo.arco(grafo.numVertice("A"),grafo.numVertice("D"));
      grafo.arco(grafo.numVertice("B"),grafo.numVertice("F"));
      grafo.arco(grafo.numVertice("B"),grafo.numVertice("E"));
      grafo.arco(grafo.numVertice("F"),grafo.numVertice("C"));
      grafo.arco(grafo.numVertice("D"),grafo.numVertice("F"));

      GrafoAdy grafoady = new GrafoAdy(6);
      int[] distancias = grafoady.recorrerAnchura(grafo,"A");
      
      for(int i=0;i<distancias.length;i++){
        System.out.println("Distancia de A a " + grafo.vertices[i] + " es " + distancias[i]);
      }
    }catch(Exception e){
      System.out.println("Ocurrio un error:(" + e.getMessage());
    }
  }
}