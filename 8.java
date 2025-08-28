class Problem6 {
    static void reverse(int []a){
        int b = 0;
        int c = a.length-1;
        while(b<=c){
            int temp = a[b];
            a[b] = a[c];
            a[c] = temp;
            b++;
            c--;
        }

    }
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
