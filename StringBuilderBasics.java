public class StringBuilderBasics {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Abcd");

        //Get character
        System.out.println(s.charAt(1));

        //Set character
        s.setCharAt(0, 'Y');
        System.out.println(s);

        //Insert at a position
        s.insert(0,'X');
        System.out.println(s);

        //Delete
        s.delete(2, s.length());
        System.out.println(s);

        //Insert at end
        s.append('Z');
        System.out.println(s);
    }
}
