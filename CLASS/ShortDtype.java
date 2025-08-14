/*char c;
System.out.println(c); // Compile-time error (if uninitialized)
*/
// But if it's a class-level variable:
class Example {
    static char ch;
    public static void main(String[] args) {
        System.out.println("Default char: [" + ch + "]"); // Outputs: Default char: []
    }
}