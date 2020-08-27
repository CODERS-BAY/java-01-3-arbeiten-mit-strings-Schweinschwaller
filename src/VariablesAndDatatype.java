public class VariablesAndDatatype {
    public static void main(String[] args) {
        String txt = "  Hello World!  ";

        //Print the String and its length to the console.
        System.out.println(txt);
        System.out.println(txt.length());
        //all letters in uppercase
        System.out.println(txt.toUpperCase());
        //all letters in lowercase
        System.out.println(txt.toLowerCase());
        //replace “World” with “Codersbay”
        System.out.println(txt.replaceAll("World", "CodersBay"));
        //without the leading spaces
        System.out.println(txt.trim());
        //Repeat the printed String 15 times seperated with linebreaks
        for (int i = 0; i < 15; i++) {
            System.out.println(txt);
        }
    }
}