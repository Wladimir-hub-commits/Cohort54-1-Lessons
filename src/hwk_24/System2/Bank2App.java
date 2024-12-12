package hwk_24.System2;

/*

Добавить в интерфейс метод:

transferMoney() (перевод средств на другой счет) - Средства списываются
с одного счета и зачисляются на другой счет
Должна быть возможность осуществлять переводы между этими классами.
 Т.е. возможность перевода средств:
-Банк -> Банк
-Банк -> Кошелек
-Кошелек -> Кошелек
-Кошелек -> Банк
 */

public class Bank2App {
    public static void main(String[] args) {
        PaymentSystem bank = new BankAccount("Cyprus Bank", 50000);
        System.out.println(bank.withdrawMoney(1000));
        System.out.println(bank);

        bank.withdrawMoney(1_000_000);

        System.out.println("\n ============ Transfer ==============");
        PaymentSystem bank2 = new BankAccount("A-Bank", 10000);
        bank.transferMoney(14000, bank2);
        System.out.println(bank);
        System.out.println(bank2);

        System.out.println("\n ============ Transfer2 ==============");
        PaymentSystem wallet = new BtcWallet("Crypto Wallet", 3);
        wallet.transferMoney(1, bank);

        System.out.println(bank);
        System.out.println(wallet);

        System.out.println("\n ============ Transfer3 ==============");
        bank.transferMoney(35000, wallet);
        System.out.println(bank);
        System.out.println(wallet);


    }


}
