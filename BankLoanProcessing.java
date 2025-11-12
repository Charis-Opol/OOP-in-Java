class Loan{
    private String loanId;
    private int amount;
    private double interestRate;

    Loan(String loanId, int amount, double interestRate){
        setloanId(loanId);
        setamount(amount);
        setinterestRate(interestRate);
    }

    public void setloanId(String loanId){
        this.loanId = loanId;
    }

    public void setamount(int amount){
        this.amount = amount;
    }

    public void setinterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public int getamount(){
        return this.amount;
    }

    public double getinterestRate(){
        return this.interestRate;
    }

    public String getloanId(){
        return this.loanId;
    }

    public double calculateTotalPayement(){
        double addedAmount = this.amount * this.interestRate;
        return (addedAmount + amount);
    }
}

class HomeLoan extends Loan{
    int propertyValue;

    HomeLoan(String loanId, int amount, double interestRate, int propertyValue){
        super(loanId, amount, interestRate);
        this.propertyValue = propertyValue;
    }

    @Override
    public double calculateTotalPayement(){
        double addedAmount = getamount() * getinterestRate();
        return (addedAmount + getamount());      
    }


}

public class BankLoanProcessing {
    public static void main(String[] args){
        Loan loan = new Loan("L002", 4556000, 0.13);
        HomeLoan hloan = new HomeLoan("HL002", 422000000, 0.16, 60000000);

        loan.calculateTotalPayement();
        hloan.calculateTotalPayement();
    }
}
