package OOPS;

public class Array {
    public static void main(String[] args) {
         int nums[]= {1, 2, 3, 4, 5};
          for(int i=0; i<nums.length; i++) {
            System.out.println("Element at index " + i + ": " + nums[i]);
          }
           int nums1[]= new int[5];
            for(int i=0; i<nums1.length; i++) {
                nums1[i] = i * 10;
            }
              for(int i=0; i<nums1.length; i++) {
                System.out.println("Element at index " + i + ": " + nums1[i]);
              }
}
}
