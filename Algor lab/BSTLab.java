public class BSTLab{
  public static void main(String[]args){
    
    OurBST tree = new OurBST();
     
    tree.insert(90); tree.insert(100); tree.insert(20);
    
    System.out.println(tree.root.data);
    System.out.println(tree.root.left.data);
    System.out.println(tree.root.right.data);
  
    int a = tree.Height(tree.root);
    System.out.println(" The Height of tree " +a);
    
  }
}