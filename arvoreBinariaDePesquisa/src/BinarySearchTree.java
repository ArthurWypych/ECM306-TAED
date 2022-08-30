// Java program to demonstrate
// insert operation in binary
// search tree
class BinarySearchTree {

    /*
     * Class containing left
     * and right child of current node
     * and key value
     */
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    BinarySearchTree(int value) {
        root = new Node(value);
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    /*
     * A recursive function to
     * insert a new key in BST
     */
    Node insertRec(Node root, int key) {

        /*
         * If the tree is empty,
         * return a new node
         */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        else if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void inOrder() {
        inOrderRec(root);
    }

    // A utility function to
    // do inorder traversal of BST
    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.key);
            inOrderRec(root.right);
        }
    }

    void postOrder() {
        postOrderRec(root);
    }

    public void postOrderRec(Node node) {
        if (node != null) {
            postOrderRec(node.left);
            postOrderRec(node.right);
            System.out.println(node.key);
        }
    }

    void preOrder() {
        preOrderRec(root);
    }

    public void preOrderRec(Node node) {
        if (node != null) {
            System.out.println(node.key);
            preOrderRec(node.left);
            preOrderRec(node.right);
        }
    }

    // A utility function to search a given key in BST
    public Node search(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null || root.key == key)
            return root;

        // Key is greater than root's key
        if (root.key < key)
            return search(root.right, key);

        // Key is smaller than root's key
        return search(root.left, key);
    }

    // Driver Code
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // /*
        // * Let us create following BST
        // * 50
        // * / \
        // * 30 70
        // * / \ / \
        // * 20 40 60 80
        // */
        // tree.insert(50);
        // tree.insert(30);
        // tree.insert(20);
        // tree.insert(40);
        // tree.insert(70);
        // tree.insert(60);
        // tree.insert(80);

        // print inorder traversal of the BST
        // tree.inorder();

        // criar árvore a partir do array
        int[] array = { 3, 7, 8, 9, 10, 5 };

        int i = 0;
        while (i < array.length) {
            tree.insert(array[i]);
            i++;
        }
        // adicionar "k" a árvore
        int k = 2;
        tree.insert(k);
        // print na árvore
        System.out.println("In Order: ");
        tree.inOrder();
        System.out.println("Post Order: ");
        tree.postOrder();
        System.out.println("Pre Order: ");
        tree.preOrder();
        // procura de valor "K" na árvore
        int K = 10;
        System.out.println("Procura do valor K");
        if (tree.search(tree.root, K) != null) {
            System.out.println("valor encontrado!!");
        } else {
            System.out.println("valor não encontrado");
        }
        
    }
}
// This code is contributed by Ankur Narain Verma