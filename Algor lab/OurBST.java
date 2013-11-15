public class OurBST{
  
  BSTnode root;
  
  public OurBST(){
    root = null;
  }
  
  public static int Height(BSTnode node){
    if(node == null){
      return 0;
    }
    else{
      int h=0; int hl=0; int hr = 0;
      hl = Height(node.left);
      hr = Height(node.right);
      h  = Math.max(hl,hr)+1;
      return h;
    }
  }
  
  public void insert(int newdata){
    if(root == null){
      root = new BSTnode(newdata);
    }
    else{
      BSTnode backPointer , Pointer;
      backPointer = Pointer = root;
      while(Pointer != null){
        backPointer = Pointer;
        if(newdata < Pointer.data){
          Pointer = Pointer.left;
        }
        else{
          Pointer = Pointer.right;
        }
      }
      if(newdata <backPointer.data){
        backPointer.left = new BSTnode(newdata);
      }
      else{
        backPointer.right = new BSTnode(newdata);
      }
    }
  }
  
  BSTnode delNode, lastNode;
  public void delete(Comparable value){
   delNode = null;
   lastNode = null;
   root = delete(root,value);
  }
  
  
  static void swapData(BSTnode d,BSTnode b){
    Comparable temp = d.data;
    d.data = b.data;
    b.data = d.data;
  }
  
  
  BSTnode delete(BSTnode node, Comparable value){
    if(node == null){
      return null;
    }
    lastNode = node;
    if(value.compareTo(node.data)<0){
      node.left = delete(node.left,value);
    }
    else{
      delNode = node;
      node.right = delete(node.right,value);
    }
    
    if(node == lastNode){
      if(delNode != null && value.equals(delNode.data)){
        if(delNode == lastNode){
          node = node.left;
        }
        else{
          swapData(delNode,lastNode);
          node = node.right;
        }
      }
    }
    return node;
  }
            
    
    
}