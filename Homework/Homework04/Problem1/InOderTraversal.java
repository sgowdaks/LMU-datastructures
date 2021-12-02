class InOrderTraversal{
    Node root;

    InOrderTraversal() {

      root = null;

     }

    public void traversal(Node root){
      if(root != null ){
        traversal(root.left);
        System.out.println(root.data);
        traversal(root.right);
      }
    }

    public static void main(String[] args){
      InOrderTraversal tree = new InOrderTraversal();
      tree.root = new Node(1);
      tree.root.left = new Node(2);
      tree.root.right = new Node(3);
      tree.root.left.left = new Node(4);
      tree.root.left.right = new Node(5);
      tree.root.right.left = new Node(6);
      tree.root.right.right = new Node(7);
      tree.traversal(tree.root);

    }
  }
