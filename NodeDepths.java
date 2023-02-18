class NodeDepths {
    static int depths;
    
    static void nodeDepth(BinaryTree root, int level){
        depths+=level;

        if (root.left != null){
            nodeDepth(root.left, level+1);
        }

        if(root.right != null){
            nodeDepth(root.right, level+1);
        }
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}

