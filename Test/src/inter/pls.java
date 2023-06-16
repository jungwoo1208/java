package inter;

public class pls {
    public static void main(String[]args){
        plus p=new plus();
        try{
            p.plus(2,3);
            throw new Exception("0으로 못 나눔");
        }catch (Exception e){
            System.out.println("오류"+e.getMessage());
        }
    }
}
