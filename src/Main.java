public class Main {
    public static void main(String[] args) {
        int a=0, hap=0;
        while (true){
            a++;
            if(a>5)
                break;
            if(a%2==0)
                continue;
            hap+=a;
        }
        System.out.printf("%d, %d\n", a, hap);

        int[][] b=new int[3][3];

    }
}
