//Recorrido del arbol binario usando pilas

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    //declaracion de variables
    //pila para almacenar datos
    Stack<Node> stack = new Stack<>();


    //dclaración de cola para breath first search
    Queue<Node> queue = new LinkedList<>();

    //metodo para BREATH FIRST SEARCH
    public void BFS(Node root) {
        //si el nodo raiz es nulo
        if (root == null) {
            return;
        }
        //se agrega el nodo raiz a la cola
        queue.add(root);
        //mientras la cola no este vacia
        while (!queue.isEmpty()) {
            //se saca el nodo de la cola
            Node aux = queue.poll();
            //se imprime el nodo
            System.out.print(aux.data + " ");
            //si el nodo tiene hijo izquierdo
            if (aux.left != null) {
                //se agrega el hijo izquierdo a la cola
                queue.add(aux.left);
            }
            //si el nodo tiene hijo derecho
            if (aux.right != null) {
                //se agrega el hijo derecho a la cola
                queue.add(aux.right);
            }
        }
    }

    //metodo para DEPTH FIRST SEARCH
    public void DFS(Node root) {
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

    //metodo recursivo el recorrido de arbol binario
    public void recorrerRecursivo(Node root) {
        //si el nodo raiz es nulo
        if (root == null) {
            return;
        }

        //se recorre el hijo derecho
        recorrerRecursivo(root.right);
        //se recorre el hijo izquierdo
        recorrerRecursivo(root.left);
        //se imprime el nodo raiz
        System.out.print(root.data + " ");
        
        
      
    }


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

    //método buscar un dato en el arbol binario
    public boolean search(Node root, char data) {
        //si el nodo raiz es nulo
        if (root == null) {
            return false;
        }
        //si el dato es igual al nodo raiz
        if (data == root.data) {
            return true;
            //si el dato es menor al nodo raiz
        } else if (data < root.data) {
            //se busca el dato en el hijo izquierdo
            return search(root.left, data);
            //si el dato es mayor al nodo raiz
        } else {
            //se busca el dato en el hijo derecho
            return search(root.right, data);
        }
    }

    //meétodo recursivo para buscar un dato en el arbol binario
    public boolean searchRecursivo(Node root, char data) {
        //si el nodo raiz es nulo
        if (root == null) {
            return false;
        }
        //si el dato es igual al nodo raiz
        if (data == root.data) {
            return true;
            //si el dato es menor al nodo raiz
        }         
        return  searchRecursivo(root.left, data) || searchRecursivo(root.right, data);
        
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
