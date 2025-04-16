package StringBuilder;

public class StringBuilderChapter {
    public static void main(String[] args) {
        // declaration
        StringBuilder sb = new StringBuilder("Mohd Kasim");
        System.out.println(sb);

        // getting character from index
        System.out.println("Character at index : " + sb.charAt(2));

        // set a character at index
        sb.setCharAt(2, 'a');
        System.out.println(sb);

        // insert a character at some index
        sb.insert(6,'t');
        System.out.println(sb);

        // delete char at some index
        sb.deleteCharAt(5);
        System.out.println(sb);

        // delete string from some index to some index
        sb.delete(4,6);
        System.out.println(sb);

        // append a character
        sb.append(" Khan");
        System.out.println(sb);

        // replace string
        sb.replace(0,4, "Mohd K");
        System.out.println(sb);

        // print length of string
        System.out.println("Length of string is : " + sb.length());
    }
}
