public class CashProvider {
    private long idCard;
    private String cardName;
    private long hashCode;
    boolean isAuthorization;
    private double cash;

    void buy(double price) {
        cash = cash - price;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(long cash) {
        if(isAuthorization == true) {
            this.cash = cash;
        }
    }

    public long getIdCard() {
        if(isAuthorization) {
            return idCard;
        }
        return -1;
    }

    public void setIdCard(long idCard) {
        if (isAuthorization) {
            this.idCard = idCard;
        }
    }

    public long getHashCode() {
        if (isAuthorization) {
            return hashCode;
        }
        return -1;
    }

    public void setHashCode(long hashCode) {
        if (isAuthorization) {
            this.hashCode = hashCode;
        }
    }
    boolean authorization (Customer customer){
        if (this.cardName == customer.name) {
            isAuthorization = true;
        }
        return false;
    }
    public CashProvider(String name) {
        this.cardName = name;
    }
}