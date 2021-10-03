public class task2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 6;
        int sum = (int) (((b+ Math.sqrt(((b*b) + 4 * a * c))) / 2 * a) - Math.pow(a,3) * c + Math.pow(b,-2));
        System.out.println(sum);
    }
}
