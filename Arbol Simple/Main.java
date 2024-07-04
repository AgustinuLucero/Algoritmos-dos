import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    ArbolBinario arbol = new ArbolBinario();
    Nodo raiz,der,izq;
    Stack<Nodo> nodos = new Stack<Nodo>();

    izq = new Nodo("I",null,null);
    der = new Nodo("D",null,null);
    raiz = new Nodo("R",izq,der);
    nodos.push(raiz);

    izq = new Nodo("C",null,null);
    der = new Nodo("B",null,null);
    raiz = new Nodo("A",izq,der);
    nodos.push(raiz);

    izq = (Nodo) nodos.pop();
    der = (Nodo) nodos.pop();
    raiz = new Nodo("E",izq,der);
    arbol.setRaiz(raiz);

    //imprimir las raices
    System.out.println("Raiz: " + arbol.getRaiz().getDato() );
    System.out.println("Izquierda: " + arbol.getRaiz().getIzq().getDato() );
    System.out.println("Derecha: " + arbol.getRaiz().getDer().getDato());
    //imprimir el arbol
    System.out.println();
    System.out.println("Preorden: ");
    arbol.preorden(arbol.getRaiz());
    
    System.out.println("\nInorden:");
    arbol.inorden(arbol.getRaiz());
    
    System.out.println("\nPostorden:");
    arbol.postorden(arbol.getRaiz());
    
  }
}