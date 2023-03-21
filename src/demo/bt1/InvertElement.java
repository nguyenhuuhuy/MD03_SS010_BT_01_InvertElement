package demo.bt1;

import java.util.Arrays;
import java.util.Stack;

public class InvertElement {
    public static void main(String[] args) {
        // đảo ngược số nguyên
        Stack<Integer> stackInter = new Stack<>();
//        stackInter.push(1);
//        stackInter.push(2);
//        stackInter.push(3);
//        stackInter.push(4);
//        System.out.println("Mảng ban đầu: ");
//        System.out.println(stackInter);
//        stackInter.pop();
//        stackInter.pop();
//        stackInter.pop();
//        stackInter.pop();
//        stackInter.push(4);
//        stackInter.push(3);
//        stackInter.push(2);
//        stackInter.push(1);
//        System.out.println("mảng sau khi đảo ngược");
//        System.out.println(stackInter);
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            stackInter.push(arr[i]);
        }
        System.out.println("mảng ban đầu: " + stackInter);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stackInter.pop();
        }
        System.out.print("Mảng sau khi đảo ngược: ");
        System.out.println(Arrays.toString(arr));

        // đảo ngược chuỗi
        String[] array = {"Bạn","Tên","Là","Ai"};
        Stack<String> stackString = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stackString.push(array[i]);
        }
        System.out.println("Mảng ban đầu: " + stackString);
        for (int i = 0; i < array.length; i++) {
            array[i] = stackString.pop();
        }
        System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(array));
    }
}
