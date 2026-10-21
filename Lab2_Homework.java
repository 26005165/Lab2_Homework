
public class Lab2_Homework {
    public static void main(String[] args) {

        // 1. Normal output
        System.out.print("1. Normal output: ");
        System.out.println(123456.789);

        // 2. Scientific notation using %e （output will appear 6 digits after decimal point by default）
        System.out.print("\n2. Scientific notation: ");
        System.out.printf("%e%n", 123456.789);

        // 3. Scientific notation using uppercase %E
        System.out.print("\n3. Uppercase scientific notation: ");
        System.out.printf("%E%n", 123456.789);

        // 4. Two decimal places
        System.out.print("\n4. Two decimal places: ");
        System.out.printf("%.2f%n", 123456.789);

        // 5. Left alignment (- means left, 10 means the width of the field is 10{means after the Hello, there are still 5 blank spaces left before the ending}, s means string)
        System.out.print("\n5. Left alignment: ");
        System.out.printf("|%-10s|%n", "Hello");

        // 6. Right alignment (+ means to the right, so 5 blank spaces, then five characters of Hello, then the ending)
        System.out.print("\n6. Right alignment: ");
        System.out.printf("|%10s|%n", "Hello");

        // 7. Leading zeros (0 means leading zeros, 5 means the width of the field is 5, so two 0 will form to make the width 5, d means integer)
        System.out.print("\n7. Leading zeros: ");
        System.out.printf("%05d%n", 123);

        // 8. Integer field width (same as the string right alignment, but d means integer)
        System.out.print("\n8. Integer field width: ");
        System.out.printf("|%8d|%n", 123);

        // 9. Display plus or minus sign (+ just means to display the sign no matter +/-, d means integer)
        System.out.print("\n9. Plus sign: ");
        System.out.printf("%+d", 25);
        System.out.printf(", %+d%n", -25);

        // 10. Thousands separators (use ',' to separate thousands, d means integer)
        System.out.print("\n10. Thousands separators: ");
        System.out.printf("%,d%n", 123456789);

        // 11. Left-aligned decimal (- means left, 10 means the width of the field is 10 {'.' count as one width}, .2 means two decimal places, f means floating-point number)
        System.out.print("\n11. Left-aligned decimal: ");
        System.out.printf("|%-10.2f|%n", 12.5);

        // 12. Right-aligned decimal
        System.out.print("\n12. Right-aligned decimal: ");
        System.out.printf("|%10.2f|%n", 12.5);

        // 13. Display a character
        System.out.print("\n13. Character: ");
        System.out.printf("%c%n", 'A');

        // 14. Hexadecimal (%x means hexadecimal, if we use %X, then the output of the letter will be uppercase, n means new line)
        System.out.print("\n14. Hexadecimal: ");
        System.out.printf("%x%n", 255);

        // 15. Limit string characters (%.5s means limit the string to 5 characters, n means new line)
        System.out.print("\n15. Limit string characters: ");
        System.out.printf("%.5s%n", "Programming");
    }
}
