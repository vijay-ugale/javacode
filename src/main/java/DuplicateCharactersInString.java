public class DuplicateCharactersInString {

    public static void main(String[] args) {

        String str="abcabc";
        int count=0;

        char [] ch=str.toCharArray();
        for (int i=0;i<ch.length;i++){
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    System.out.println("duplicate character in string are= "+ ch[j]);
                    count++;
                }
            }
        }
        System.out.println("duplicate character count are= " +count);

    }
}
