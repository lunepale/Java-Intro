package section7;

public class BigIntegerSum {
    public static void main(String[] args) {
        var a="1231235122112";
        var b="2112212422444";
String a1=a.length() >= b.length() ? a: "0".repeat(b.length()-a.length());
String b1=b.length() >= a.length() ? b: "0".repeat(a.length() - b.length());


StringBuilder res=new StringBuilder();
int prevDigit=0;
for (int i = a1.length()-1; i >=0; i--) {
  var digit1=Integer.parseInt(String.valueOf(a1.charAt(i)));
    var digit2=Integer.parseInt(String.valueOf(b1.charAt(i)));
    int sum=digit1+digit2;
    if (sum > 9) {
        prevDigit=1;
        sum=sum%10;
    }else {
        prevDigit=0;
    }
    res.insert(0,sum);
}
if(prevDigit !=0){
    res.insert(0,prevDigit);
}
        System.out.println(res.toString());
    }
}
