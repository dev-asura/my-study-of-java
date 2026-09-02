package module01_basics.exercises;

public class temperatureConverterMethod {
    public static void main(String[] args) {
        System.out.println(tempConverter(100));
        System.out.println(tempConverter(100, 'F'));
        System.out.println(tempConverter(100, 'K'));
        System.out.println();
        System.out.println(tempConverter(100, "c_to_f"));
        System.out.println(tempConverter(100, "c_to_k"));
        System.out.println(tempConverter(100, "f_to_c"));
        System.out.println(tempConverter(100, "f_to_k"));
        System.out.println(tempConverter(100, "k_to_f"));
        System.out.println(tempConverter(100, "k_to_c"));

    }
    public static double tempConverter(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double tempConverter(double temp, char targetUnit) {
        if(targetUnit == 'F') {
            return (temp * 1.8) + 32;
        } else if(targetUnit == 'K') {
            return temp + 273.15;
        } else {
            return 0;
        }
    }

    public static double tempConverter(double temp, String fromTo) {
        if (fromTo.equalsIgnoreCase("f_to_c")) {
            return (temp - 32) * 5/9;
        } else if (fromTo.equalsIgnoreCase("k_to_c")) {
            return temp - 273.15;
        } else if (fromTo.equalsIgnoreCase("c_to_f")) {
            return (temp * 1.8) + 32;
        } else if (fromTo.equalsIgnoreCase("k_to_f")) {
            return (temp - 273.15) * 9/5 + 32;
        } else if (fromTo.equalsIgnoreCase("c_to_k")) {
            return temp + 273.15;
        } else if (fromTo.equalsIgnoreCase("f_to_k")) {
            return (temp - 32) * 5/9 + 273.15;
        } else {
            return 0;
        }
    }
}
