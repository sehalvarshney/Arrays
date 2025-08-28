class Problem4 {
    public static void main(String[] args) {
        int [] a = {7, 2, 9, 4, 1};
        Arrays.sort(a);
        int []c = Arrays.copyOf(a, a.length);
        int k = 4;
        int j = 0;
        int start = 0 ;
        int end= c.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(c[mid] == k){
                j = mid;
                break;
            }else{
                if(k<c[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }System.out.println(Arrays.toString(c));
        System.out.print(j);
    }
}
