/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.integrador;

import com.sun.source.tree.SwitchExpressionTree;
import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class CasoIntegrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos que desea ingresar: "));
        Producto producto1[] = new Producto[opcion];
        burnMethod();
        setData(producto1);
        printData(producto1);

    }

    public static void burnMethod() {
        JOptionPane.showMessageDialog(null, "***** Bienvenido al sistema de inventario del supermercado Super Chinese ***** \n"
                + "*** Código de SuperMercado: 203575 ***");
    }

    public static void setData(Producto[] array) {
        Producto.setEmployeeName(JOptionPane.showInputDialog("Ingrese el nombre del bodeguero que ingresa el producto: "));
        Producto.setEmployeeId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del bodeguero que ingresa el producto: ")));
        JOptionPane.showMessageDialog(null, "Se solicitarán los datos para ingresar los productos: ");
        for (int i = 0; i < array.length; i++) {
            int productCode = Integer.parseInt(JOptionPane.showInputDialog("Digite el código del producto: "));
            String productName = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
            int productQuantity = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos que desea almacenar: "));
            double basePrice = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio base del producto: "));
            int productType = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de producto que desea almacenar teniendo en cuenta lo siguiente: \n"
                    + "1. Alimentos \n"
                    + "2. Bebidas \n"
                    + "3. Higiene \n"
                    + "4. Limpieza"));
            double grossPrice = 0;
            if (productType == 1) {
                grossPrice = (basePrice * 0.20) + basePrice;
            } else if (productType == 2) {
                grossPrice = (basePrice * 0.30) + basePrice;
            } else if (productType == 3) {
                grossPrice = (basePrice * 0.25) + basePrice + 500;
            } else if (productType == 4) {
                grossPrice = (basePrice * 0.19) + (basePrice * 0.04) + 1000 + basePrice;
            }
            double profit = ((grossPrice - basePrice) * productQuantity);
            array[i] = new Producto(productCode, productName, productQuantity, basePrice, productType, grossPrice, profit);
        }
    }

    public static void printData(Producto[] array) {
        for (int i = 0; i < array.length; i++) {
            JOptionPane.showMessageDialog(null, "Los datos de los productos son los siguientes: \n"
                    + "Código del producto: " + array[i].getProductCode() + " \n"
                    + "Nombre del producto: " + array[i].getProductName() + " \n"
                    + "Cantidad del producto: " + array[i].getProductQuantity() + " \n"
                    + "Precio base: " + array[i].getBasePrice() + " \n"
                    + "Tipo de producto: " + array[i].getProductType() + " \n"
                    + "Precio bruto del producto: " + array[i].getGrossPrice() + " \n"
                    + "Ganancia esperada: " + array[i].getProfit());

        }

    }

}
