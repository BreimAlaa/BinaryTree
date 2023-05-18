import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Node<T> {
    Node<T> left;
    Node<T> right;
    int key;
    T data;

    public Node(int key) {
        this.key = key;
    }

    public Node(int key, T data) {
        this.key = key;
        this.data = data;
    }

    public void printNode() {
        System.out.println(key + " " + data);
    }

    @Override
    public String toString() {
        return key + " " + data;
    }
}

class BinaryTree<T> {
    Node<T> root;
    private int size;

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public int getHeight() {
        return getHeight(root);
    }

    private int getHeight(Node<T> node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

    public void add(Node<T> newNode) {
        if (root == null) {
            root = newNode;
            return;
        }
        size++;
        Node<T> currentNode = root;
        while (true) {
            if (newNode.key == currentNode.key) {
                return;
            }
            if (newNode.key < currentNode.key) {
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    return;
                }
                currentNode = currentNode.left;
            } else {
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    return;
                }
                currentNode = currentNode.right;
            }
        }
    }

    private void printPreorder(Node<T> node) {
        if (node == null) {
            return;
        }
        node.printNode();
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public void printPreorder() {
        printPreorder(root);
    }

    private void printInorder(Node<T> node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        node.printNode();
        printInorder(node.right);
    }

    public void printInorder() {
        printInorder(root);
    }

    private void printPostorder(Node<T> root) {
        if (root == null) {
            return;
        }
        printPostorder(root.left);
        printPostorder(root.right);
        root.printNode();
    }

    public void printPostorder() {
        printPostorder(root);
    }

    public void printLevelOrder() {
        Queue<Node<T>> queue = new LinkedList<Node<T>>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<T> tempNode = queue.poll();
            tempNode.printNode();
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public ArrayList<Integer> getLevelOrder() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<Node<T>> queue = new LinkedList<Node<T>>();
        if (root == null) {
            return list;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<T> tempNode = queue.poll();
            list.add(tempNode.key);
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
        return list;
    }


    public Node<T> searchNode(int data) {
        Node<T> currentNode = root;
        while (currentNode != null) {
            if (data == currentNode.key) {
                return currentNode;
            }
            if (data < currentNode.key) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }
        return null;
    }

    public boolean search(int data) {
        return searchNode(data) != null;
    }

    public Node<T> delete(int data) {
        Node<T> currentNode = root;
        Node<T> parentNode = root;
        boolean isLeftChild = false;
        while (currentNode != null && currentNode.key != data) {
            parentNode = currentNode;
            if (data < currentNode.key) {
                currentNode = currentNode.left;
                isLeftChild = true;
            } else {
                currentNode = currentNode.right;
                isLeftChild = false;
            }
        }
        if (currentNode == null) {
            return null;
        }
        if (currentNode.left == null && currentNode.right == null) {
            if (currentNode == root) {
                root = null;
            }
            if (isLeftChild) {
                parentNode.left = null;
            } else {
                parentNode.right = null;
            }
        } else if (currentNode.right == null) {
            if (currentNode == root) {
                root = currentNode.left;
            } else if (isLeftChild) {
                parentNode.left = currentNode.left;
            } else {
                parentNode.right = currentNode.left;
            }
        } else if (currentNode.left == null) {
            if (currentNode == root) {
                root = currentNode.right;
            } else if (isLeftChild) {
                parentNode.left = currentNode.right;
            } else {
                parentNode.right = currentNode.right;
            }
        } else {
            Node<T> successor = getSuccessor(currentNode);
            if (currentNode == root) {
                root = successor;
            } else if (isLeftChild) {
                parentNode.left = successor;
            } else {
                parentNode.right = successor;
            }
            successor.left = currentNode.left;
        }
        size--;
        return currentNode;
    }

    private Node<T> getSuccessor(Node<T> node) {
        Node<T> parentOfSuccessor = node;
        Node<T> successor = node;
        Node<T> currentNode = node.right;
        while (currentNode != null) {
            parentOfSuccessor = successor;
            successor = currentNode;
            currentNode = currentNode.left;
        }
        if (successor != node.right) {
            parentOfSuccessor.left = successor.right;
            successor.right = node.right;
        }
        return successor;
    }
    private String spaces(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }
    private String lines(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("_");
        }
        return sb.toString();
    }
    public void printTree(){
        printTree(1);
    }
    public void printTree(int extra) {
        Queue<Node<T>> queue = new LinkedList<>();
        if (root == null) {
            return;
        }
        queue.add(root);
        int height = getHeight();
        int level = 1;
        while (true) {
            int size = queue.size();
            int digitsOffset = 1;
            if (queue.peek() != null)
                digitsOffset = (int) Math.log10(queue.peek().key) + 1;
            // print leading spaces
            System.out.print(spaces((int) Math.pow(2, height - level + extra) - 1 - digitsOffset + 1));
            boolean[] spaceOrLine = new boolean[size];
            while (true) {
                // print the key of the node and add its children to the queue
                Node<T> tempNode = queue.poll();
                if (tempNode != null) {
                    spaceOrLine[spaceOrLine.length - size] = true;
                    System.out.print(tempNode.key);
                    queue.add(tempNode.left);
                    queue.add(tempNode.right);
                } else {
                    spaceOrLine[spaceOrLine.length - size] = false;
                    System.out.print(" ");
                    queue.add(null);
                    queue.add(null);
                }
                if (size == 1) break;

                digitsOffset = 1;
                if (queue.peek() != null)
                    digitsOffset = (int) Math.log10(queue.peek().key) + 1;

                // print the spaces between nodes
                System.out.print(spaces((int) (Math.pow(2, height - level + 1 + extra) - 1 - digitsOffset + 1)));
                size--;
            }
            if (level == height) break;

            System.out.println();
            System.out.print(spaces((int) Math.pow(2, height - level - 1 + extra) - 1));

            int levelItems = 0;
            while (true) {
                if (spaceOrLine[levelItems]) {
                    System.out.print(lines((int) Math.pow(2, height - level + extra) + 1));
                } else {
                    System.out.print(spaces((int) Math.pow(2, height - level + extra) + 1));
                }
                if (levelItems == Math.pow(2, level - 1) - 1) break;

                System.out.print(spaces((int) (Math.pow(2, height - level + extra) - 1)));
                levelItems++;
            }
            System.out.println();
            level++;
        }
    }
}