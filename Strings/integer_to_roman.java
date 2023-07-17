//Goldman Sachs
class Solution {
    public String intToRoman(int num) {
        String[] units = {"","I","II","III","IV","V","VI","VII","VIII","IX"};//1-9
        String[] tens =  {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};//10-90
        String[] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};//100-900
        String[] thousands = {"","M","MM","MMM"};//1000-3000
        String ans = "";//result 
        int i=0;
        while(num>0)
        {
            String[] temp;
        switch(i){
            case 0:
                temp = units;
            break;
            case 1:            
                temp = tens;
            break;
            case 2:
                temp = hundreds;
            break;
            default :
                temp = thousands;
            
            }
            ans = temp[num%10] + ans;
            num/=10;
            i++;
        }
        return ans;
    }
}
