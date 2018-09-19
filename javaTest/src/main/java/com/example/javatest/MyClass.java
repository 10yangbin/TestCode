package com.example.javatest;


import com.example.dataStructure.BinTreeTraverse;
import com.example.dataStructure.TestDataStru;

import java.util.Arrays;

import static com.example.dataStructure.BinTreeTraverse.inOrderTraverse;
import static com.example.dataStructure.BinTreeTraverse.nodeList;
import static com.example.dataStructure.BinTreeTraverse.postOrderTraverse;
import static com.example.dataStructure.BinTreeTraverse.preOrderTraverse;

public class MyClass {

    public static void main(String args[]) {
        //System.out.print(getMinNum() + "-----");

        //System.out.print(getRevStr("yangbin"));

      /*  BinTreeTraverse binTree = new BinTreeTraverse();
        binTree.createBinTree();
        // nodeList中第0个索引处的值即为根节点
       BinTreeTraverse.Node root = nodeList.get(0);

         System.out.println("先序遍历：");
        preOrderTraverse(root);
        System.out.println();

        System.out.println("中序遍历：");
        inOrderTraverse(root);
        System.out.println();

        System.out.println("后序遍历：");
        postOrderTraverse(root);*/


        int[] values = { 3, 1, 6, 2, 9, 0, 7, 4, 5,8 };

        // bubbleSort(values);
        System.out.println(Arrays.toString(values));
        Arrays.sort(values);
        System.out.println (binarySearch(values,33));

        //System.out.println("二叉树深度："+ maxDeath(root));
    }


    /**
     * 二叉树的题目普遍可以用递归和迭代的方式来解
     * @param node
     * @return
     */

    public  static int maxDeath(BinTreeTraverse.Node node){
        if(node==null) return 0;
        int left = maxDeath(node.leftChild);
        int right = maxDeath(node.rightChild);
        return  Math.max(left,right)+1;
    }

    /**
     * 获取数组里面的最小值
     * @return
     */
    public static int getMinNum() {
        int[] nums = {0,100, 6, 9, 10,-10333};//数组内容，顺序和内容不确定
        int min = nums[0];
        for (int i =0;i<nums.length;i++){
            if (nums[i]<min) {
                min = nums[i];
            }
        }
        return min;
    }

    /**
     * 获取字符串的反转
     * @param str
     * @return
     */
    private static String getRevStr(String str){

        char[] str1 = str.toCharArray();

        for(int i=0;i<str1.length/2;i++){
            char temp = str1[i];
            str1[i] = str1[str1.length-1-i];
            str1[str1.length-1-i] = temp;
        }
        return String.valueOf(str1);

    }

    /**
     * 冒泡排序
     * @param array
     */
    public  static  void bubbleSort(int[] array){
          int temp;//减少声明

          for(int i=0;i<array.length;i++){
             for(int j=0;j<array.length-1-i;j++){
                 if (array[j]>array[j+1]){
                     temp = array[j];
                     array[j] = array[j+1];
                     array[j+1] = temp;
                 }
             }
         }
    }


    public  static  int binarySearch(int[] array , int value){

        int low = 0;
        int height = array.length-1;

        while (low<=height){

            int middle = (low+height)/2;

            if(value==array[middle]){
               return middle; //返回查询到的索引位置
            }

            if (value>array[middle])  low = middle+1;

            if(value<array[middle])   height =middle-1;

        }

        return  -1;  //上面循环完毕，说明未找到，返回-1

    }

}