package gov.irs;

public interface IRS {
    public void collectTaxes();
    public void register(Taxpayer payer);

    // static factory method - clients MUST come here for the instance (i.e., IRSenum.INSTANCE)
    public static IRS getInstance() {
        return IRSEnum.INSTANCE;
    }
}
