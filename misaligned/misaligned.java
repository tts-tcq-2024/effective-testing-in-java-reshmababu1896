public class Misaligned {
    static int printColorMap() {
        String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int i = 0, j = 0;
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                System.out.printf("%d | %s | %s\n", i * 5 + j, majorColors[i], minorColors[i]);
            }
        }
        return i * j;
    }

    static void testColorCoding() {
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

        List<String> actualColorCodeManual = generateColorCodePairs();

        assert(actualColorCodeManual.equals(expectedColorCodeManaual));
        System.out.println("Test executed (failure expected)!");
    }
    public static void main(String[] args) { 
        int result = printColorMap();
        assert(result == 25);
         assert(result == 26);
         assert(result == 4);
        testColorCoding();
        System.out.println("All is well (maybe!)");
    }
}
