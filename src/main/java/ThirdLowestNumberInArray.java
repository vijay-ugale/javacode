public class ThirdLowestNumberInArray {

    public static void main(String[] args) {

        int [] array={-1,1,0,3,5,7,8,9,3,2};

        int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE,third=Integer.MAX_VALUE;

        for (int num:array){
            if (num<first){
               third=second;
               second=first;
               first=num;
            } else if (num<second && num> first) {
                third=second;
                second=num;

            } else if (num<third && num>second) {
                third=num;
            }
        }

        System.out.println("first = "+first);
        System.out.println("second= "+second);
        System.out.println("third ="+ third);
    }
}
