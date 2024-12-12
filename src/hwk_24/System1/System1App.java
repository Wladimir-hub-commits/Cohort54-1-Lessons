package hwk_24.System1;

/**
 * Author Waldemar Ilz
 * {code data} 05.12.2024
 */

/*
ask 2
Платежные системы

Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (снятие со счета) - списываются деньги
 со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).

Напишите классы BankAccount и ElectronicWallet, которые реализуют
 данный интерфейс.

Банк предоставляет счета, например, в евро, а электронный кошелек
в другой валюте
Убедитесь, что каждый класс корректно выполняет каждую из операций.

 */

public class System1App {
    public static void main(String[] args) {
        PaySystem bank = new BankAcc("Bank1 ", 10000);
        PaySystem wallet = new EWallet("Wallet1 ", 5000);

        System.out.println(bank);
        bank.withdrawMoney(500_000);
        bank.withdrawMoney(500);
        System.out.println("checkBalance: " + bank.checkBalance());

        wallet.depositTransfer(1500);
        System.out.println("checkBalance: " + wallet.checkBalance());
    }


}
