public class ThirdHighestNumberInArray {
    public static void main(String[] args) {
        int [] array={1,5,7,3,4,9,8};

        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;

        for (int num:array){
            if (num>first){
                third=second;
                second=first;
                first=num;
            }else if (num>second && num<first){
                third=second;
                second=num;
            } else if (num>third && num<second) {
                third=num;

            }

        }
        System.out.println("third = " + third);
        System.out.println("second = " + second);
        System.out.println("first = " + first);

    }
}
