//Recorrido del arbol binario usando pilas

import java.util.Stack;

public class BinaryTree {

    //declaracion de variables
    //pila para almacenar datos
    Stack<Node> stack = new Stack<>();



    //metodo para recorrer el arbol binario
    public void recorrer(Node root) {
        //si el nodo raiz es nulo
        if (root == null) {
            return;
        }
        //se agrega el nodo raiz a la pila
        stack.push(root);
        //mientras la pila no este vacia
        while (!stack.isEmpty()) {
            //se saca el nodo de la pila
            Node aux = stack.pop();
            //se imprime el nodo
            System.out.print(aux.data + " ");
            //si el nodo tiene hijo derecho
            if (aux.right != null) {
                //se agrega el hijo derecho a la pila
                stack.push(aux.right);
            }
            //si el nodo tiene hijo izquierdo
            if (aux.left != null) {
                //se agrega el hijo izquierdo a la pila
                stack.push(aux.left);
            }
        }
    }

    

    //insertar un nodo en el arbol binario
    public void insert(Node root, char data) {
        //si el nodo raiz es nulo
        if (root == null) {
            //se crea un nuevo nodo
            root = new Node(data);
            //si el dato es menor al nodo raiz
        } else if (data < root.data) {
            //se inserta el dato en el hijo izquierdo
            insert(root.left, data);
            //si el dato es mayor al nodo raiz
        } else if (data > root.data) {
            //se inserta el dato en el hijo derecho
            insert(root.right, data);
        }
    }
    
}
