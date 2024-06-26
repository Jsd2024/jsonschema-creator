//package org.example.app.controller;
//import java.util.*;
//
//
//class Node {
//    public int value;
//    public List<Node> children;
//    public Node(int value) {
//        this.value = value;
//        children = new ArrayList<Node>();
//    }
//
//    public void addChild(Node child){
//        this.children.add(child);
//    }
//}
//
//
//public class GenericTree {
////    public static void main(String[] args)
//    static int getMaxLevelGenTree(){
//        Node root = new Node(10);
//        Node child1 = new Node(20);
//        Node child2 = new Node(30);
//        Node child3 = new Node(40);
//        Node child4 = new Node(50);
//        Node child5 = new Node(60);
//
//        Node child11 = new Node(200);
//        Node child12 = new Node(210);
//        child1.addChild(child11);
//        child1.addChild(child12);
//
//
//        Node child21 = new Node(300);
//        Node child22 = new Node(310);
//        child2.addChild(child21);
//        child2.addChild(child22);
//        // child2.addChild(new Node(410));
//        // child2.addChild(new Node(420));
//        // child2.addChild(new Node(430));
//
//        root.addChild(child1);
//        root.addChild(child2);
//        root.addChild(child3);
//        root.addChild(child4);
//        root.addChild(child5);
//        System.out.println(maxNodeLevel(root));
//    }
//
//    public static int maxNodeLevel(Node root){
//        if(root == null)
//        {
//            return -1;
//        }
//
//        int maxLevel = 0;
//        int currentLevel = 0;
//        int max = Integer.MIN_VALUE;
//        int nodeCount = 0;
//        while(true){
//            Queue<Node> q = new LinkedList<>();
//            q.add(root);
//
//            if(nodeCount> max){
//                max = nodeCount;
//                maxLevel= currentLevel;
//            }
//            if(nodeCount ==0)
//            {
//                break;
//            }
//            while(nodeCount>0)
//            {
//                Node qNode = q.peek();
//                q.remove();
//
//                // if(qNode.children.stream())
//                List<Node> childrenList =
//                        qNode.children.stream()
//                                .filter(ch -> Objects.nonNull(ch))
//                                .toList();
//
//                for(int i=0 ; i< childrenList.size(); i++){
//                    q.add(childrenList.get(i));
//
//                }
//
//                nodeCount --;
//
//
//            }
//
//            currentLevel++;
//        }
//
//        return maxLevel;
//
//    }
//
//}
