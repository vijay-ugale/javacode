public class SecondLargestNumberINArrayP1 {

    public static void main(String[] args) {

        int []a={10,20,30};

        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for (int num:a){
            if (num>max1){
                max2=max1;
                max2=num;


            }else if (num>max2 && num!=max1){
                max2=num;
            }
        }
        System.out.println(max2);
    }
}
