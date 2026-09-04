class headlineupdater{
public static void main(String args[]){
StringBuilder headline = new StringBuilder("city marathon scheduled");
System.out.println("***NEWS HEADLINE***");
System.out.println("original headline");
System.out.println(headline);
headline.append("Tomorrow");
headline.insert(0, "Breaking: ");
System.out.println("updated headling");
System.out.println("headline");
}
}