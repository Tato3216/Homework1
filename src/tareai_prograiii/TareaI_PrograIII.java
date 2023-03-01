package tareai_prograiii;
import tareai_prograiii.TreeBinary;

public class TareaI_PrograIII {

    public static void main(String[] args) {
        TreeBinary tree = new TreeBinary();
        
        tree.insertar(9);
        tree.insertar(3);
        tree.insertar(5);
        tree.insertar(2);
        
        tree.runner(tree.raiz);        
    }
    
}
