import java.util.Scanner;
import java.util.StringTokenizer;
class purchaseditems{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();
System.out.println("==PURCHASED ITEMS ==");
StringTokenizer tokenizer = new StringTokenizer(input, ",");
int itemCount = 1:
while(tokenizer.hasMoreTokens()) {
String item = tokenizer.nextToken().trim();
System.out.println("Item " + itemCount + " : " + item);
itemCount++;
}
scanner.close();
}
}