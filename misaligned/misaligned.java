public class Misaligned {
    
    static String[] majorColors = {"White", "Red", "Black", "Yellow", "Violet"};
    static String[] minorColors = {"Blue", "Orange", "Green", "Brown", "Slate"};

    
    static List<String> generateColorCode() {
        List<String> colorCodePairs = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                colorCodePairs.add(i * 5 + j + " | " + majorColors[i] + " | " + minorColors[i]);
            }
        }
        return colorCodePairs;
    }
    
    static int printColorMap() {
        List<String> colorCodePairs = generateColorCodePairs();
        colorCodePairs.forEach(System.out::println);
        return colorCodePairs.size();
    }
    
    static void testColorCoding(List<String> expectedColorCodeManaual) {
        List<String> actualColorCodeManual = generateColorCode();
        assert(actualColorCodeManual.equals(expectedColorCodeManaual));
        System.out.println("Test executed (failure expected)!");
    }

    static  List<String> generateExpectedManaul(){
         List<String> expectedColorCodeManaual = new ArrayList<>();
        expectedColorCodeManaual.add("0 | White | Blue");
        expectedColorCodeManaual.add("1 | White | Orange");
        expectedColorCodeManaual.add("2 | White | Green");
        expectedColorCodeManaual.add("3 | White | Brown");
        expectedColorCodeManaual.add("4 | White | Slate");
        expectedColorCodeManaual.add("5 | Red | Blue");
        expectedColorCodeManaual.add("6 | Red | Orange");
        expectedColorCodeManaual.add("7 | Red | Green");
        expectedColorCodeManaual.add("8 | Red | Brown");
        expectedColorCodeManaual.add("9 | Red | Slate");
        expectedColorCodeManaual.add("10 | Black | Blue");
        expectedColorCodeManaual.add("11 | Black | Orange");
        expectedColorCodeManaual.add("12 | Black | Green");
        expectedColorCodeManaual.add("13 | Black | Brown");
        expectedColorCodeManaual.add("14 | Black | Slate");
        expectedColorCodeManaual.add("15 | Yellow | Blue");
        expectedColorCodeManaual.add("16 | Yellow | Orange");
        expectedColorCodeManaual.add("17 | Yellow | Green");
        expectedColorCodeManaual.add("18 | Yellow | Brown");
        expectedColorCodeManaual.add("19 | Yellow | Slate");
        expectedColorCodeManaual.add("20 | Violet | Blue");
        expectedColorCodeManaual.add("21 | Violet | Orange");
        expectedColorCodeManaual.add("22 | Violet | Green");
        expectedColorCodeManaual.add("23 | Violet | Brown");
        expectedColorCodeManaual.add("24 | Violet | Slate");
        return expectedColorCodeManaual;
    }
    public static void main(String[] args) { 
        int result = printColorMap();
        testColorCoding(generateExpectedManaul());
        assert(result == 25);
        System.out.println("All is well (maybe!)");
    }
}
