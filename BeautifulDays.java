public class BeautifulDays {
    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int result = 0;
        for(int x = i; i<= j; x++){
            if(Math.abs(x-reverse(x))%k == 0)
                result += 1;
        }
        return result;

    }
    static int reverse(int x){
        String x1 =  Integer.toString(x);
        StringBuilder input1 = new StringBuilder();
        input1.append(x1);
        input1.reverse();
        return Integer.valueOf(input1.toString());
    }
}
