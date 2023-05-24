# BinaryTree
This is a Java implementation of a binary tree structure. It provides functions to add, delete, and view the tree in a tree-like structure.
## Features

- Create a binary tree with a specified root node.
- Add new nodes to the binary tree.
- Delete nodes from the binary tree.
- Print the binary tree in a tree-like structure.

## Installation

1. Clone the repository:

```
git clone https://github.com/BreimAlaa/BinaryTree.git
```

2. Import the BinaryTree library into your Java project.


## Usage
To use the BinaryTree library, follow these steps:

1- Define a new binary tree and set the root node key:
```
BinaryTree<Person> tree = new BinaryTree<>(new Node<>(20));
```

2- Add nodes to the binary tree:
```
tree.add(new Node<>(8));
tree.add(new Node<>(22));
tree.add(new Node<>(4));
tree.add(new Node<>(12));
tree.add(new Node<>(10));
tree.add(new Node<>(14));
```

3- Print the binary tree:
```
tree.printTree(2);
```
Output:
```
                              20
               _________________________________
               8                              22
       _________________               _________________
       4              12
   _________       _________
                  10      14
```
4- Use diffrent ways to traverse the tree
```
tree.printLevelOrder();
```
