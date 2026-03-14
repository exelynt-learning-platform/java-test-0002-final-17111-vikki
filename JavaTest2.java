class JavaTest2{
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }

            int k = 1;
            while(k<=i){
                System.out.print(k++);
            }
            while(k>=1){
                System.out.print(k--);
            }

            System.out.println();

        }
    }
}