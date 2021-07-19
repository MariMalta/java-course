package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.println("Enter number of products: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){

            System.out.println("Product #" + i + " data: ");

            System.out.println("Common, used or imported (c/u/i) ?");
            char c = sc.next().charAt(0);

            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();

            if(c == 'c'){
                list.add(new Product(name, price));
            }
            else if(c == 'u'){
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(name,price,date));
            }
            else{
                System.out.println("Customs fee: ");
                double customs = sc.nextDouble();
                list.add(new ImportedProduct(name,price,customs));
            }
        }

        System.out.println("Price Tags: ");

        for(Product prod : list){
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
