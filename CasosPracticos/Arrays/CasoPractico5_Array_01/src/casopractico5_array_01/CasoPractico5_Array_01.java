package casopractico5_array_01;

import java.util.Scanner;

public class CasoPractico5_Array_01 
{
    public static void mostrarPedidos(double[][] pedido)
    {
        double total = 0;
        boolean sinPedido = false;
        
        System.out.println("");
        for(int i = 0; i < pedido.length; i++)
        {
            System.out.printf("Cliente %d: ", i);
            if(pedido[i].length <= 0)
            {
                sinPedido = true; 
            }
            
            for(int j = 0; j < pedido[i].length; j++)
            {
                
                System.out.printf("%.2f ", pedido[i][j]);
                total += pedido[i][j];
            }
            
            if(sinPedido)
            {
             System.out.println("Cliente " + i + ": (sin pedidos) -> total = 0.00");
             sinPedido = false;
            }
            else
            {
                System.out.println("-> total = " + total);
                total = 0;
            }
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int cliente, productos;
        double precio;
        
        System.out.print("Número de clientes: ");
        cliente = sc.nextInt();
        
        double[][] pedido = new double[cliente][];
        for(int i = 0; i < pedido.length; i++)
        {
            System.out.print("Número de pedidos del cliente " + i + ": ");
            productos = sc.nextInt();
            pedido[i] = new double[productos];
            for(int j = 0; j < pedido[i].length; j++)
            {
                System.out.printf("Importe del pedido %d del cliente %d: ", i, j);
                precio = sc.nextDouble();
                
                pedido[i][j] = precio;
            }
        }
        
        mostrarPedidos(pedido);
    }
}
