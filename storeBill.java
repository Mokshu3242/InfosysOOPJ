public class storeBill{
    private int billId;
    public int getBillId(){
        return billId;
    }
    public void setBillId(int billId){
        this.billId = billId;
    }

    private int customerId;
    public int getCustomerId(){
        return customerId;
    }
    public void setCustomerId(int customerId){
        this.customerId=customerId;
    }

    private int discount;
    public int getDiscount(){
        return discount;
    }
    public void setDiscount(int discount){
        this.discount = discount;
    }

    private double billAmount;
    public double getBillAmount(){
        return billAmount;
    }
    public void setBillAmount(double billAmount){
        this.billAmount=billAmount;
    }

    public static void main(String[] args){
        storeBill bill = new storeBill();
        bill.setBillId(1001);
        bill.setCustomerId(101);
        bill.setDiscount(2);
        bill.setBillAmount(199.99);

        double discountedBillAmount = bill.billAmount - bill.billAmount * ((double)bill.discount/100);
        System.out.println("Bill ID: " + bill.billId);
        System.out.println("Customer ID: " + bill.customerId);
        System.out.println("Discount: " + bill.discount + "%");
        System.out.println("Bill Amount: " + bill.billAmount);
        System.out.println("Discounted Amount: " + discountedBillAmount);
    }
}