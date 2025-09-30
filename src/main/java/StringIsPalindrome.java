public class StringIsPalindrome {

    public static void main(String[] args) {

        String name="madam";

       /* String revstr = new StringBuilder(name).reverse().toString();

        if (name.equals(revstr)){
            System.out.println("string is palindrome");
        }else {
            System.out.println("string is not palindrome");
        }*/

//second approach
        String rev="";
        for (int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println("rev string= "+rev);
        if (rev.equals(name)){
            System.out.println("string is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }
}
