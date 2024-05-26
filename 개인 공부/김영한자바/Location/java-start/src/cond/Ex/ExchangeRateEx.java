package cond.Ex;

public class ExchangeRateEx {
    public static void main(String[] args) {

        int doller = 5;

        int won = doller * 1300;

        if(doller < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (doller == 0 ) {
            System.out.println("환전할 금액이 없습니다");
        } else if (doller > 0) {
            System.out.println("환전 금액은 " + won + "원 입니다.");
        }
    }
}
