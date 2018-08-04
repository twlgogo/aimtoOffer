package Util;

import DataStructure.ListNode;
import DataStructure.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/7/11
 * Time: 上午11:40
 */
public class Tools {

    private static AtomicInteger count = new AtomicInteger(0);
    public static ListNode createList(int[] values){
        if (values == null || values.length == 0)return null;
        ListNode nodeHead =  new ListNode(values[0]);
        if (values.length == 1){
            return nodeHead;
        }
        ListNode nodePrew = nodeHead;
        for (int i = 1; i <values.length ; i++) {
            ListNode node = new ListNode(values[i]);
            node.nextNode = null;
            nodePrew.nextNode = node;
            nodePrew = node;
        }
        return nodeHead;
    }


    public static void printList(ListNode head){
        if (head == null)return;
        while (head != null){
            System.out.println(head.val);
            head = head.nextNode;
        }
    }

    public static TreeNode buildTree(Integer[] nodes){
        if (nodes == null || nodes.length == 0)return null;
        TreeNode root = new TreeNode(0);
        root = buildHelper(root,nodes,count.get());
        return root;
    }

    private static TreeNode buildHelper(TreeNode root , Integer[] nodes, int index){
        Integer val = nodes[index];
        if (val == null)
            return null;
        root = new TreeNode(val);
        root.left = buildHelper(root,nodes,count.getAndIncrement());
        root.right = buildHelper(root,nodes,count.getAndIncrement());
        return root;
    }




    public static void main(String[] args) {
        Integer[] values = {1,3,4,null,6};
        TreeNode root = buildTree(values);
        System.out.println(1);


    }
}
