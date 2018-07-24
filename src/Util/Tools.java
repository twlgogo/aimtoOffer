package Util;

import DataStructure.ListNode;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2018/7/11
 * Time: 上午11:40
 */
public class Tools {
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
    public static void main(String[] args) {
        int[] values = {1,2,3};
        ListNode head = createList(values);
        ListNode p = head;
        while (p != null){
            System.out.println(p.val);
            p = p.nextNode;
        }
        System.out.println(head.val);
    }
}
