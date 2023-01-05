import java.util.ArrayList;

import org.w3c.dom.Node;

class BinaryTree {

  ArrayList<String> inOrderArray = new ArrayList<String>();
  ArrayList<String> preOrderArray = new ArrayList<String>();
  ArrayList<String> postOrderArray = new ArrayList<String>();
  Node root;

  public BinaryTree() {
    this.root = null;
  }

  public BinaryTree(String value) {
    this.root = new Node(value);
  }

  /*
   * InOrder Traversal: Here, the traversal is: left child - root - right child.
   * It means that the left child is traversed first then its root node and
   * finally the right child.
   */
  public void inOrder(Node node) {
    // if (node == null){
    // System.out.println("This node is empty.");
    // }
    if (node != null) {
      inOrder(node.left);
      System.out.println("Current: " + node.data);
      inOrderArray.add(node.data);
      inOrder(node.right);
    }
  }

  /*
   * PostOrder Traversal: Here, the traversal is: left child - right child - root.
   * It means that the left child is traversed first then the right child and
   * finally its root node.
   */
  public void postOrder(Node node) {
    // if (node == null){
    // System.out.println("This node is empty.");
    // }
    if (node != null) {
      postOrder(node.left);
      postOrder(node.right);
      System.out.println("Current: " + node.data);
      postOrderArray.add(node.data);
    }
  }

  /*
   * PreOrder Traversal: Here, the traversal is: root - left child - right child.
   * It means the root node is traversed first, then its left child and finally
   * the right child.
   */
  public void preOrder(Node node) {
    // if (node == null) {
    // System.out.println("This node is empty.");
    // }
    if (node != null) {
      System.out.println("Current: " + node.data);
      preOrderArray.add(node.data);
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  public int findHeight(Node node) {
    int left = findHeight(node.left), right = findHeight(node.right);

    if (node == null) {
      System.out.println("This node is empty.");
      return -1;
    }

    if (left > right) {
      return left + 1;
    } else {
      return right + 1;
    }
  }

  public void insert(Node node, String value) {
    // to insert into a binary tree (in most cases you will be working with numbers)
    // in a standard number binary tree, largest number on the
    // right
    // smallest number on the left

    // this is the code for adding value that is bigger
    // than the node you are checking

    if (value.compareTo(node.data) < 0) {
      if (node.right != null) {
        insert(node.right, value);
      } else {
        node.right = new Node(value);
      }
    }

    else if (value.compareTo(node.data) >= 0) {
      if (node.left != null) {
        insert(node.left, value);
      } else {
        node.left = new Node(value);
      }
    }
  }

  public int treeHeight(Node node) {
    if (node == null) {
      return 0;
    } else {
      int left = treeHeight(node.left);
      int right = treeHeight(node.right);
      if (left > right) {
        return (left + 1);
      } else {
        return (right + 1);
      }
    }
  }

  public ArrayList<String> reverseArray(ArrayList<String> list) {

    ArrayList<String> revArrayList = new ArrayList<String>();

    for (int i = list.size() - 1; i >= 0; i--) {
      revArrayList.add(list.get(i));
    }

    return revArrayList;
  }

  public int Big (Node root) {
    int large;
    if (root.right != null) {
      large = Big(root.right);
    }

    return large;
  }

  public int Small (Node root) {
    int small;
    if (root.left != null) {
      small = Small(root.left);
    }

    return small;
  }

  public boolean isBST (Node root) {
    if (root == null) return false;

    // if the node to the left is larger than the previous node, is false
    if (isBST(root.left) > root) { return false;} else return true;
    // if the node to the right is smaller than the previous node, is false
    if (isBST(root.right) < root) { return false;} else return true;

    return false;
  }

}