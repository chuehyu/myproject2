package chuehyu;
// 一般客戶 - 滿千送百
// 銀級客戶 - 滿千送百, 再送百元還元金
// 金級客戶 - 滿千送兩百, 再送兩百元還元金
// 0001  1200  1100
// 0002  800  800
// 0003 2000 1800(200) <--銀級客戶
public class SalesTester {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001",1200);
        Customer c2 = new Customer("0002",800);
        Customer c3 = new Customer("0003", 1800);

        c1.print();
        c2.print();
        c3.print();
    }
}
