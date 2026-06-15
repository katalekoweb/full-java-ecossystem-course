public class Arrays {
    public static void main(String[] args) {
        // int nums[] = {2,4,5,8};
        // int nums2[] = new int[4];

        // // changing the value
        // nums[1] = 10;
        // nums2[2] = 7;

        // System.out.println(nums[1]);
        // System.out.println(nums2[2]);

        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println(nums[i]);
        // }

        // array of arrays. multidimensional
        // int nums3[][] = new int[3][4];

        // int nums4[][] = new int[3][]; // jagged array
        // nums4[0] = new int[3];
        // nums4[1] = new int[5];
        // nums4[2] = new int[1];

        // for (int i = 0; i < nums3.length; i++) {
        //     for (int j = 0; j < nums3[i].length; j++) {
        //         nums3[i][j] = (int) (Math.random() * 100);
        //     }
        // }

        // // in the enhanced for loop we dont need to mention the size of the array
        // for (int n[]: nums3) {
        //     for (int m : n) {
        //         System.out.print(m + "  ");
        //     }
        //     System.out.println("");
        // }

        // for (int i = 0; i < nums3.length; i++) {
        //     for (int j = 0; j < nums3[i].length; j++) {
        //         System.out.print(nums3[i][j] + "  ");
        //     }
        //     System.out.println("");
        // }

        // arrays in Java are Objects
        // drawback arrays
        // int nums[] = new int[6];

        // for (int i : nums) {
        //     System.out.println(i);
        // }

        // Collections

        Student s1 = new Student();
        s1.name = "Julian";
        s1.rollno = 1;
        s1.marks = 88;

        Student s2 = new Student();
        s1.name = "Felix";
        s1.rollno = 2;
        s1.marks = 67;

        Student s3 = new Student();
        s1.name = "Kata";
        s1.rollno = 3;
        s1.marks = 89;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        System.out.println(s1);
        System.out.println(s1.name + " : " + s1.rollno + " : " + s1.marks);

        for (Student student : students) {
            System.out.println(student.name + ": " + student.rollno);
        }
    }
}

class Student 
{
    int rollno;
    String name;
    int marks;
}