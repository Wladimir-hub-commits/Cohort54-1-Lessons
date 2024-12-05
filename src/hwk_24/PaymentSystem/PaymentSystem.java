package hwk_24.PaymentSystem;

/**
 * Author Waldemar Ilz
 * {code data} 04.12.2024
 */

public interface PaymentSystem {
    void withdrawMoney(double amount);// списываются деньги со счета
    void depositTransfer(double amount);//поступление денег на счет
    void checkBalance();//остаток на счете

}
