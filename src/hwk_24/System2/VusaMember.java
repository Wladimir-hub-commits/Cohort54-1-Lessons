package hwk_24.System2;

public abstract class VusaMember implements PaymentSystem {

    private final String currency;

    private double courseBTC;
    protected String title;
    protected double balance;

    public VusaMember(String currency, double balance, String title) {
        this.currency = currency;
        this.balance = balance;
        this.title = title;
        setActualBtcCourse(currency);

    }

    public void setActualBtcCourse(String currency) {
        // запрос на сервер платёжной системы
        //получения актуального курса и присвоение его в поле
        this.courseBTC = 100_000;
    }

    public String getCurrency() {
        return currency;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCourseBTC() {
        return courseBTC;
    }
}
