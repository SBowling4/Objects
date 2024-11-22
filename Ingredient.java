public class Ingredient {
    public String name;
    public double amount;
    public String unit;

    public Ingredient() {
        name = "flour";
        amount = 2;
        unit = "cups";
    }

    public Ingredient(String name, double amount, String unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    public String toString() {
        return String.format("%.2f", amount) + " " + unit + " of " + name;
    }

    public void convert(String unit) {
        if (unit.equals("cups") && unit.equals("ml")) {
            amount *= 236.588;
            unit = "ml";
        } else if (unit.equals("ml") && unit.equals("cups")) {
            amount /= 236.588;
            unit = "cups";
        }
    }

    public Ingredient scale(double factor) {
        Ingredient output = new Ingredient();
        output.name = name;
        output.unit = unit;
        output.amount = amount * factor;
        return output;
    }    
}
