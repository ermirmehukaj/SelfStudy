package selfStudy01;

public class MedianNumber {
    public static void main(String[] args) {


        int a = 20;
        int b = 35;
        int c = 5;

 if(a>b && a<c || a>c && a<b){
     System.out.println(a + " is the median number");
 }
if(b>a && b<c || b>c && b<a){
    System.out.println(b + " is the median number");
}
if(c>a && c<b|| c<a && c>b){
    System.out.println(c + " is the median number");
}

    }
}