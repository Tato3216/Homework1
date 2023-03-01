package tareai_prograiii;
import java.util.LinkedList;

public class TreeBinary {
    Nodo raiz;
    public TreeBinary(){
        raiz = null;
    }
        public void insertar(int data){
        Nodo n = new Nodo(data);
        n.dt=data;
        
        if (raiz==null) {
            raiz=n;
        }else{
            Nodo aux = raiz;
            while(aux != null){
                n.root = aux;
                if (n.key >= aux.key) {
                    aux=aux.right;
                }else{
                    aux=aux.left;
                }
            }
            if (n.key < n.root.key) {
                n.root.left = n;
            }else{
                n.root.right=n;
            }
        }
    }
    
    public void runner(Nodo n){
        if (n != null) {
            runner(n.left);
            System.out.println("Index " +n.key+" dato " + n.dt);
            runner(n.right);
        }
    }
    
  
    private class Nodo{
    
        public Nodo root;
        public Nodo right;
        public Nodo left;
        public int key;
        public Object dt;
        
        public Nodo(int index){
        key = index;
        right=null;
        left=null;
        root=null;
        dt=null;
    }

    }
    
}
