public class MyString {
    public static void main (String []args){

        System.out.println(wordCount(" this string has wide spaces "));

    }

    public static int wordCount (String input){
        int words =0;

        char ch[]= new char[input.length()];

        for(int i=0; i<input.length(); i++) {
            ch[i]= input.charAt(i);
            if(((i>0) && (ch[i]!=' ') && (ch[i-1]==' ')) || ((ch[0]!=' ')&&(i == 0)))
                words++;
        }
        return words;


    }

} //done
