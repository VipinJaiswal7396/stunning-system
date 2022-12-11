public class Power {
    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;

        }
        int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);
        if(n % 2 != 0){
            halfPowerSq = a*halfPowerSq;
        }

        return halfPowerSq;
    }
    public static int tilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fnm1 = tilingProblem(n-1);
        int fnm2 = tilingProblem(n-2);
        int totWays = fnm1 + fnm2;
        return totWays;
    }
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args){
        String str = "appnacollege";
        removeDuplicates(str, 0, new StringBuilder(""),  boolean[26]);

    }
    
    
}
