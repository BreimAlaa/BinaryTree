import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {
        BinaryTree<Person> tree = new BinaryTree<>(new Node<>(20));
        tree.add(new Node<>(8));
        tree.add(new Node<>(22));
        tree.add(new Node<>(4));
        tree.add(new Node<>(12));
        tree.add(new Node<>(10));
        tree.add(new Node<>(14));
        tree.printTree(2);
        System.out.println();

        BinaryTree<Person> binaryTree = new BinaryTree<>(new Node<>(10,
                new Person("Mohamed",
                        10)));

        binaryTree.add(new Node<>(5,
                new Person("Alaa",
                        5)));
        binaryTree.add(new Node<>(20));
        binaryTree.add(new Node<>(3));
        binaryTree.add(new Node<>(7));
        binaryTree.add(new Node<>(15));
        binaryTree.add(new Node<>(25));
        binaryTree.add(new Node<>(2));
        binaryTree.add(new Node<>(4));
        binaryTree.add(new Node<>(21));
        binaryTree.add(new Node<>(6));
        binaryTree.add(new Node<>(17));
        binaryTree.add(new Node<>(8));
        binaryTree.add(new Node<>(12));
        binaryTree.add(new Node<>(27));
        binaryTree.add(new Node<>(22));
        binaryTree.add(new Node<>(1));
        binaryTree.add(new Node<>(24));
        binaryTree.add(new Node<>(11));
        binaryTree.add(new Node<>(13));
        binaryTree.add(new Node<>(16));
        binaryTree.add(new Node<>(18));
        binaryTree.add(new Node<>(9));
        binaryTree.add(new Node<>(23));
        binaryTree.add(new Node<>(19));
        binaryTree.add(new Node<>(26));
        binaryTree.add(new Node<>(28));

        binaryTree.printTree();
        System.exit(0);
        ArrayList<Integer> levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(10));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(5));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(20));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(3));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(7));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(15));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(25));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(2));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(4));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(6));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(8));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(12));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(17));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(22));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(27));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(1));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(9));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(11));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(13));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(16));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(18));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(21));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(23));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(26));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(28));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(24));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);

        System.out.println(binaryTree.delete(19));
        levelOrderArray = binaryTree.getLevelOrder();
        System.out.println(levelOrderArray);


;
    }
}
