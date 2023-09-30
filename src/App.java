public class App {
    public static void main(String[] args) throws Exception {
        
        //vamos a probar el arbol y recorrerlo
        //creamos el arbol
        BinaryTree tree = new BinaryTree();
        //creamos el nodo raiz
        Node a = new Node('a');
        Node b = new Node('b');
        Node c = new Node('c');
        Node d = new Node('d');
        Node e = new Node('e');
        Node f = new Node('f');

        //insertamos los nodos
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        //recorremos el arbol
        tree.recorrer(a);
    }
}
