/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.integrador;

/**
 *
 * @author Aulas Heredia
 */
public class Producto {
    private int productCode;
    private String productName;
    private static String employeeName;
    private static int employeeId;
    private int productQuantity;
    private double basePrice;
    public int productType;
    private double grossPrice;
    private double profit;

    public Producto() {
    }
    


    public Producto(int productCode, String productName, int productQuantity, double basePrice, int productType, double grossPrice, double profit) {
        this.productCode = productCode;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.basePrice = basePrice;
        this.productType = productType;
        this.grossPrice = grossPrice;
        this.profit = profit;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public static String getEmployeeName() {
        return employeeName;
    }

    public static void setEmployeeName(String employeeName) {
        employeeName = employeeName;
    }

    public static int getEmployeeId() {
        return employeeId;
    }

    public static void setEmployeeId(int employeeId) {
        employeeId = employeeId;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public double getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(double grossPrice) {
        this.grossPrice = grossPrice;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "Producto{" + "productCode=" + productCode + ", productName=" + productName + ", employeeName=" + employeeName + ", employeeId=" + employeeId + ", productQuantity=" + productQuantity + ", basePrice=" + basePrice + ", productType=" + productType + ", grossPrice=" + grossPrice + ", profit=" + profit + '}';
    }
    
    
    
}
