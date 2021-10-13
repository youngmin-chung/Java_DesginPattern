package Visitor;

import java.text.DecimalFormat;

public class TaxHolidayVisitor implements Visitor{
    // This formats the item prices to 2 decimal places

    DecimalFormat df = new DecimalFormat("#.##");

    // This is created so that each item is sent to the right version of visit() which is required by the
    // Visitor interface and defined below

    public TaxHolidayVisitor() {
    }

    // Calculates total price based on this being taxed as a liquor item
    public double visit(Liquor liquorItem) {
        System.out.print("Liquor Item: Price with Tax ");
        return Double.parseDouble(df.format((liquorItem.getPrice() * .10) + liquorItem.getPrice()));
    }

    // Calculates total price based on this being taxed as a tobacco item
    public double visit(Tobacco tobaccoItem) {
        System.out.print("Tobacco Item: Price with Tax ");
        return Double.parseDouble(df.format((tobaccoItem.getPrice() * .30) + tobaccoItem.getPrice()));
    }

    // Calculates total price based on this being taxed as a necessity item
    public double visit(Necessity necessityItem) {
        System.out.print("Necessity Item: Price with Tax ");
        return Double.parseDouble(df.format(necessityItem.getPrice()));
    }

    // Calculates total price based on this being taxed as a perfume item
    public double visit(Perfume perfumeItem) {
        System.out.print("Perfume Item: Price with Tax ");
        return Double.parseDouble(df.format((perfumeItem.getPrice() * .15) + perfumeItem.getPrice()));
    }
}
