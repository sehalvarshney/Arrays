class Problem3 {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int []b = a;
        int [] c = Arrays.copyOf(a);
        System.out.print(Arrays.toString(b));
        System.out.print(Arrays.toString(c));
    }
}
