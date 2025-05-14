package data_structure_algorithm.data_structure.custom;

public class BinarySearchTree {
    TreeNode root;

    public void print(){
        System.out.println("-------------------------");
        inOrderRecursion(root);
        System.out.println();
    }

    public void inOrderRecursion(TreeNode root){
        if(root != null){
            inOrderRecursion(root.left);
            System.out.print(root.data + " - ");
            inOrderRecursion(root.right);
        }
    }

    public void insert(int data) {
        root = insertRecursion(root, data);
    }

    public TreeNode insertRecursion(TreeNode root, int data){
        if(root == null){
            return new TreeNode(data);
        }

        if(data < root.data){
            root.left = insertRecursion(root.left, data);
        }else if(data > root.data){
            root.right = insertRecursion(root.right, data);
        }

        return root;
    }

    public void find(int data){
        findRecursion(root, data);
    }

    public void findRecursion(TreeNode root, int data){
        if(root == null){
            System.out.println(data + " - Data is not present!");
            return;
        }

        if(root.data == data){
            System.out.println(data + " - Data is present!");
            return;
        }

        if(data < root.data){
            findRecursion(root.left, data);
        } else {
            findRecursion(root.right, data);
        }
    }

    public static void main(String[] arg){
        BinarySearchTree bt = new BinarySearchTree();
        bt.print();
        bt.insert(50);
        bt.insert(60);
        bt.insert(70);
        bt.insert(30);
        bt.insert(20);
        bt.insert(10);
        bt.insert(500);
        bt.print();
        bt.find(70);
        bt.find(100);
        bt.find(400);
        bt.find(500);
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
    }
}