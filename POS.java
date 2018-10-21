import components.map.Map;
import components.map.Map1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class POS {

    //4 digit UPC
    //1234
    //1 = Brand (0 = Nike, 1 = adidas, 2 = PUMA, 3 = Polo Ralph Lauren, 4= Tommy Hilfiger, 5= Calvin Klein, 6 = Levi's, 7 = Lacoste, 8 = Champion, 9 =Jordan)
    //2 = Style (0 = Sweatshirt, 1= Pants, 2= T-Shirt, 3= Underwear, 4 = Socks, 5= Tank Top, 6= Hat, 7= Sweater, 8 = Shoes, 9= Shorts)
    //3 = Color (0 = Black, 1 = White, 2 = Brown, 3= Red, 4= Orange, 5 = Yellow, 6 = Green, 7= Blue, 8= Purple, 9= Gold)
    //4 = Size
    //Style(0,2,3,5,7) Tops
    //(0=X-Small, 1= Small, 2=Medium, 3=Large, 4= X-Large, 5= XX-Large, 6=XXX-Large, 7= XXXX-Large, 8=One-Size)
    //Style(1,9) Bottoms
    //(0=28-29, 1= 30-31, 2= 32-33, 3=34-35,4=36-37, 5= 38-39, 6=40-41, 7=42-43, 8=44-45, 9=46+)
    //Style(4) Socks
    //(0= Shoe Size 0-6, 1= Shoe Size 7-13, 2=14+)
    //Style(6) Hats
    //(0= Snapback, 1= Velcro Back, 2= One Size)
    //Style(8) Shoes
    //(0=0-1, 1=2-3, 2=4-5, 3=6-7, 4=8-9, 5=10-11, 6=12-13, 7=14-15, 8=16-17, 9=18+)

    public static Map<String, Double> sizePrice(String styleNum) {
        Map<String, Double> price = new Map1L<>();
        if (styleNum.equals("Sweatshirt") || styleNum.equals("T-Shirt")
                || styleNum.equals("Underwear") || styleNum.equals("Tank Top")
                || styleNum.equals("Sweater")) {
            price.add("0", 1.50);
            price.add("1", 2.50);
            price.add("2", 2.50);
            price.add("3", 2.50);
            price.add("4", 2.50);
            price.add("5", 3.50);
            price.add("6", 3.50);
            price.add("7", 3.50);
            price.add("8", 2.00);
        } else if (styleNum.equals("Pants") || styleNum.equals("Shorts")) {
            price.add("0", 4.50);
            price.add("1", 4.50);
            price.add("2", 4.50);
            price.add("3", 5.50);
            price.add("4", 5.50);
            price.add("5", 5.50);
            price.add("6", 6.50);
            price.add("7", 6.50);
            price.add("8", 6.50);
            price.add("9", 8.00);
        } else if (styleNum.equals("Socks")) {
            price.add("0", 0.50);
            price.add("1", 1.50);
            price.add("2", 2.00);
        } else if (styleNum.equals("Hat")) {
            price.add("0", 8.00);
            price.add("1", 5.50);
            price.add("2", 5.00);
        } else {
            price.add("0", 1.50);
            price.add("1", 1.50);
            price.add("2", 1.50);
            price.add("3", 8.50);
            price.add("4", 8.50);
            price.add("5", 8.50);
            price.add("6", 8.50);
            price.add("7", 10.50);
            price.add("8", 10.50);
            price.add("9", 10.50);
        }
        return price;

    }

    public static Map<String, Double> colorPrice() {
        Map<String, Double> price = new Map1L<>();
        price.add("0", 0.00);
        price.add("1", 0.00);
        price.add("2", 1.00);
        price.add("3", 2.50);
        price.add("4", 2.50);
        price.add("5", 2.50);
        price.add("6", 2.50);
        price.add("7", 2.50);
        price.add("8", 2.50);
        price.add("9", 5.00);
        return price;
    }

    public static Map<String, Double> stylePrice() {
        Map<String, Double> price = new Map1L<>();
        price.add("0", 25.00);
        price.add("1", 35.00);
        price.add("2", 15.00);
        price.add("3", 12.00);
        price.add("4", 7.00);
        price.add("5", 8.50);
        price.add("6", 15.00);
        price.add("7", 30.00);
        price.add("8", 50.00);
        price.add("9", 20.00);
        return price;
    }

    public static Map<String, Double> brandPrice() {
        Map<String, Double> price = new Map1L<>();
        price.add("0", 15.00);
        price.add("1", 12.00);
        price.add("2", 10.00);
        price.add("3", 21.00);
        price.add("4", 19.00);
        price.add("5", 18.50);
        price.add("6", 15.00);
        price.add("7", 20.00);
        price.add("8", 9.00);
        price.add("9", 15.00);
        return price;
    }

    public static Map<String, String> brandMap() {
        Map<String, String> style = new Map1L<>();
        style.add("0", "Nike");
        style.add("1", "adidas");
        style.add("2", "PUMA");
        style.add("3", "Polo Ralph Lauren");
        style.add("4", "Tommy Hilfiger");
        style.add("5", "Calvin Klein");
        style.add("6", "Levi's");
        style.add("7", "Lacoste");
        style.add("8", "Champion");
        style.add("9", "Jordan");
        return style;
    }

    public static Map<String, String> styleMap() {
        Map<String, String> style = new Map1L<>();
        style.add("0", "Sweatshirt");
        style.add("1", "Pants");
        style.add("2", "T-Shirt");
        style.add("3", "Underwear");
        style.add("4", "Socks");
        style.add("5", "Tank Top");
        style.add("6", "Hat");
        style.add("7", "Sweater");
        style.add("8", "Shoes");
        style.add("9", "Shorts");
        return style;
    }

    public static Map<String, String> colorMap() {
        Map<String, String> color = new Map1L<>();
        color.add("0", "Black");
        color.add("1", "White");
        color.add("2", "Brown");
        color.add("3", "Red");
        color.add("4", "Orange");
        color.add("5", "Yellow");
        color.add("6", "Green");
        color.add("7", "Blue");
        color.add("8", "Purple");
        color.add("9", "Gold");
        return color;
    }

    public static Map<String, String> shoesSizeMap() {
        Map<String, String> style = new Map1L<>();
        style.add("0", "0-1");
        style.add("1", "2-3");
        style.add("2", "4-5");
        style.add("3", "6-7");
        style.add("4", "8-9");
        style.add("5", "10-11");
        style.add("6", "12-13");
        style.add("7", "14-15");
        style.add("8", "16-17");
        style.add("9", "18+");
        return style;
    }

    public static Map<String, String> hatsSizeMap() {
        Map<String, String> style = new Map1L<>();
        style.add("0", "Snapback");
        style.add("1", "Velcro Back");
        style.add("2", "One Size");
        return style;
    }

    public static Map<String, String> socksSizeMap() {
        Map<String, String> style = new Map1L<>();
        style.add("0", "Shoe Size 0-6");
        style.add("1", "Shoe Size 7-13");
        style.add("2", "Shoe Size 14+");
        return style;
    }

    public static Map<String, String> bottomSizeMap() {
        Map<String, String> style = new Map1L<>();
        style.add("0", "28-29");
        style.add("1", "30-31");
        style.add("2", "32-33");
        style.add("3", "34-35");
        style.add("4", "36-37");
        style.add("5", "38-39");
        style.add("6", "40-41");
        style.add("7", "42-43");
        style.add("8", "44-45");
        style.add("9", "46+");
        return style;

    }

    public static Map<String, String> topSizeMap() {
        Map<String, String> style = new Map1L<>();
        style.add("0", "X-Small");
        style.add("1", "Small");
        style.add("2", "Medium");
        style.add("3", "Large");
        style.add("4", "X-Large");
        style.add("5", "XX-Large");
        style.add("6", "XXX-Large");
        style.add("7", "XXXX-Large");
        style.add("8", "One Size");
        return style;
    }

    public static String firstDigit(String upc) {
        String chr = upc.substring(0, 1);
        Map<String, String> brand = brandMap();
        return brand.value(chr);
    }

    public static String secondDigit(String upc) {
        String chr = upc.substring(1, 2);
        Map<String, String> style = styleMap();
        return style.value(chr);
    }

    public static String thirdDigit(String upc) {
        String chr = upc.substring(2, 3);
        Map<String, String> color = colorMap();
        return color.value(chr);
    }

    public static String fourthDigit(String upc) {
        String styleNum = upc.substring(1, 2);
        String chr = upc.substring(3);
        Map<String, String> size;
        if (styleNum.equals("0") || styleNum.equals("2") || styleNum.equals("3")
                || styleNum.equals("5") || styleNum.equals("7")) {
            size = topSizeMap();
        } else if (styleNum.equals("1") || styleNum.equals("9")) {
            size = bottomSizeMap();
        } else if (styleNum.equals("4")) {
            size = socksSizeMap();
        } else if (styleNum.equals("6")) {
            size = hatsSizeMap();
        } else {
            size = shoesSizeMap();
        }
        if (size.hasKey(chr)) {
            return size.value(chr);
        }
        return "null";
    }

    public static double purchase(SimpleReader in, SimpleWriter out) {
        int total = 0;
        out.println();
        out.println("Scan item: ");
        String upc = in.nextLine();
        while (upc.length() != 0) {
            while (upc.length() != 4) {
                out.println();
                out.println("Not a sufficient UPC. Try again: ");
                String a = in.nextLine();
                upc = a;
            }
            String brand = firstDigit(upc);
            String style = secondDigit(upc);
            String color = thirdDigit(upc);
            String size = fourthDigit(upc);
            while (size == "null") {
                out.println();
                out.println("Not a sufficient UPC. Try again: ");
                String a = in.nextLine();
                upc = a;
            }

            Map<String, Double> brandPrice = brandPrice();
            Map<String, Double> stylePrice = stylePrice();
            Map<String, Double> colorPrice = colorPrice();
            Map<String, Double> sizePrice = sizePrice(style);

            String firstDig = upc.substring(0, 1);
            String secondDig = upc.substring(1, 2);
            String thirdDig = upc.substring(2, 3);
            String fourthDig = upc.substring(3, 4);
            out.println();
            out.print(color + " " + size + " " + brand + " " + style);
            double price = brandPrice.value(firstDig)
                    + stylePrice.value(secondDig) + colorPrice.value(thirdDig)
                    + sizePrice.value(fourthDig);
            out.print(":  $" + price);
            total += price;
            out.println();
            out.println("Enter next item: ");
            String input = in.nextLine();
            upc = input;
        }
        out.println("Subtotal: $" + total);
        double tax = total * 1.075;
        tax = Math.round(tax * 100.0) / 100.0;
        out.println("Total after tax: $" + tax);
        return tax;

    }

    public static double returns(SimpleReader in, SimpleWriter out) {
        double total = 0;
        out.println();
        out.println("Scan item: ");
        String upc = in.nextLine();
        while (upc.length() != 0) {
            while (upc.length() != 4) {
                out.println();
                out.println("Not a sufficient UPC. Try again: ");
                String a = in.nextLine();
                upc = a;
            }
            String brand = firstDigit(upc);
            String style = secondDigit(upc);
            String color = thirdDigit(upc);
            String size = fourthDigit(upc);
            while (size == "null") {
                out.println();
                out.println("Not a sufficient UPC. Try again: ");
                String a = in.nextLine();
                upc = a;
            }

            Map<String, Double> brandPrice = brandPrice();
            Map<String, Double> stylePrice = stylePrice();
            Map<String, Double> colorPrice = colorPrice();
            Map<String, Double> sizePrice = sizePrice(style);

            String firstDig = upc.substring(0, 1);
            String secondDig = upc.substring(1, 2);
            String thirdDig = upc.substring(2, 3);
            String fourthDig = upc.substring(3, 4);
            out.println();
            out.print(color + " " + size + " " + brand + " " + style);
            double price = brandPrice.value(firstDig)
                    + stylePrice.value(secondDig) + colorPrice.value(thirdDig)
                    + sizePrice.value(fourthDig);
            out.print(":  $" + price);
            total += price;
            out.println();
            out.println("Enter next item: ");
            String input = in.nextLine();
            upc = input;
        }
        out.println("Subtotal: -$" + total);
        double tax = total * 1.075;
        tax = Math.round(tax * 100.0) / 100.0;
        out.println("Total after tax: -$" + tax);
        return tax;
    }

    public static void priceFinder(SimpleReader in, SimpleWriter out) {
        out.println();
        out.println("Scan item: ");
        String upc = in.nextLine();

        while (upc.length() != 4) {
            out.println();
            out.println("Not a sufficient UPC. Try again: ");
            String a = in.nextLine();
            upc = a;
        }
        String brand = firstDigit(upc);
        String style = secondDigit(upc);
        String color = thirdDigit(upc);
        String size = fourthDigit(upc);
        while (size == "null") {
            out.println();
            out.println("Not a sufficient UPC. Try again: ");
            String a = in.nextLine();
            upc = a;
        }

        Map<String, Double> brandPrice = brandPrice();
        Map<String, Double> stylePrice = stylePrice();
        Map<String, Double> colorPrice = colorPrice();
        Map<String, Double> sizePrice = sizePrice(style);

        String firstDig = upc.substring(0, 1);
        String secondDig = upc.substring(1, 2);
        String thirdDig = upc.substring(2, 3);
        String fourthDig = upc.substring(3, 4);
        out.println();
        out.print(color + " " + size + " " + brand + " " + style);
        double price = brandPrice.value(firstDig) + stylePrice.value(secondDig)
                + colorPrice.value(thirdDig) + sizePrice.value(fourthDig);
        out.println(":  $" + price);

    }

    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        out.println("Welcome to Aytekin's Store!");
        out.println("Options: ");
        out.println("1. Purchase");
        out.println("2. Return");
        out.println("3. Find Price");
        out.println("4. Total Sales");

        int a = in.nextInteger();
        double revenue = 0;
        double profit = 0;
        double returns = 0;

        while (a != 0) {
            if (a == 1) {
                revenue += purchase(in, out);
                profit += revenue;
                profit = Math.round(profit * 100.0) / 100.0;
            }
            if (a == 2) {
                returns += returns(in, out);
                profit -= returns;
                profit = Math.round(profit * 100.0) / 100.0;
            }
            if (a == 3) {
                priceFinder(in, out);
            }
            if (a == 4) {
                out.println("Total Revenue: $" + revenue);
                out.println("Total Retruns: -$" + returns);
                out.println("Total Profit: $" + profit);
            }

            out.println();
            out.println("Options: ");
            out.println("1. Purchase");
            out.println("2. Return");
            out.println("3. Find Price");
            out.println("4. Total Sales");
            int choice = in.nextInteger();
            a = choice;
        }
        in.close();
        out.close();
    }

}
