public class Calculator {
    int l,r;
    public void setOprands(int l, int r){
        this.l=l;
        this.r=r;
    }
    public void divide() throws DividedByZeroException{
        
        if(this.r==0){
            throw new DividedByZeroException();
        }
        System.out.print("계산결과는 ");
        System.out.print(this.l/this.r);
        System.out.print(" 입니다.");
        
    }
}
