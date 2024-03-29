package BinaryTree;

import org.w3c.dom.Node;

import java.util.Scanner;

class BinaryTreeee {
    public BinaryTreeee(){

    }
    private static  class Node{
        int value;
        Node right;
        Node left;
        public Node(int value){
            this.value =value;

        }
    }
    private Node root;
    public void ins(Scanner scanner){
        System.out.println("Enter the root node");
        int value = scanner.nextInt();
        root = new Node(value);
        ins(scanner, root);
    }
    private void ins(Scanner scanner, Node node){
        System.out.println("do you want to enter the left node" +node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            ins(scanner, node.left);

        }

        System.out.println("do you want to enter the right of node" + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("enter the right of root node" + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            ins(scanner, node.right);
        }
    }

    public void display(){
        display(this.root, "");
    }
    private void display(Node node, String indents){
        if(node != null){
            return;
        }
        System.out.println(indents + node.value);
        display(node.left, indents + "\t");
        display(node.right, indents + "\t");
    }
}
