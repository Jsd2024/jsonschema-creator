package org.demo.app.controller;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;


@Component
public class TreeMaxNodeLevel {
    static class Node{
        int data;
        Node left;
        Node right;

    }

    static Node createNewNode(int data){
        Node node = new Node();
        node.data=data;
        node.left = null;
        node.right = null;
        return node;
    }

    static int getMaxNodeLevel(Node root){
        if(root==null)
            return  -1;
        int maxNodeLevel = 0;
        int currentLevel = 0;
        int max = Integer.MIN_VALUE;
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while(true)
        {
            int nodeCount = nodeQueue.size();

            if(nodeCount==0){
                break;
            }

            if(nodeCount>max){
                max = nodeCount;
                maxNodeLevel = currentLevel;
            }
            while(nodeCount >0)
            {
                Node peekedNode = nodeQueue.peek();
                nodeQueue.remove();

                if(peekedNode.left != null)
                    nodeQueue.add(peekedNode.left);
                if(peekedNode.right !=null)
                    nodeQueue.add(peekedNode.right);

                nodeCount --;
            }
            maxNodeLevel++;
        }

        return maxNodeLevel;

    }

    public int findMaxNodeLevel(){
        Node root = createNewNode(2);
//        root.left = createNewNode(1);
//        root.right = createNewNode(3);
//        root.left.left= createNewNode(4);
//        root.left.right= createNewNode(6);
//        root.right.left = createNewNode(8);
//        root.right.right = createNewNode(5);
//        root.right.right.left = createNewNode(9);

        root.left	 = createNewNode(1);	 /*	 / \ */
        root.right	 = createNewNode(3);	 /*	 1	 3	 */
        root.left.left = createNewNode(4);	 /* / \ \ */
        root.left.right = createNewNode(6);	 /* 4	 6 8 */
        root.right.right = createNewNode(8); /*	 /	 */
        root.left.right.left = createNewNode(5);
        return getMaxNodeLevel(root);

    }
}
