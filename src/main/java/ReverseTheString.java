public class ReverseTheString {

    public static void main(String[] args) {
// without using built in

        String name = "vijay";
        String rev = "";

        for (int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
    }
//using built in


//        String revstring = new StringBuilder(name).reverse().toString();
//        System.out.println("rev string by stringbuilder= "+revstring);
    }

