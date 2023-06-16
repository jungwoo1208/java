import java.util.*;

public class Boj13398 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int max=arr.get(0);
        for(int l=0;l<n;l++){
            int tmp=arr.get(l);
            arr.remove(l);
            for(int i=1;i<=arr.size();i++){
                for(int j=0;j<arr.size()-i+1;j++){
                    int sum=0;
                    for(int k=j;k<j+i;k++){
                        sum+=arr.get(k);
                    }
                    if(sum>max)
                        max=sum;
                }
            }
            arr.add(l,tmp);
        }
        System.out.println(max);
    }
}
