class solution3191{
    public static void main(String[] args) {
        int[] num={0,1,1,1};
        int count=0;
        for(int i=0; i<=num.length-3; i++){
            if(num[i]==0){
                num[i]^=1;
                num[i+1]^=1;
                num[i+2]^=1;
                count++;
            }
        }
        if(num[num.length-1]==0 || num[num.length-2]==0){
            System.out.println("-1");
        }
        else{
            System.out.println(count);
        }
    }
}