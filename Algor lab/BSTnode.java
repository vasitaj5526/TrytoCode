public class BSTnode{
  int data;
  BSTnode left;
  BSTnode right;
  
  public BSTnode(){
    data = 0;
    left = null;
    right =null;
  }
  public BSTnode(int data){
    this.data = data;
  }
  public BSTnode(int data,BSTnode left,BSTnode right){
    this.data = data;
    this.left = left;
    this.right = right;
  }
}