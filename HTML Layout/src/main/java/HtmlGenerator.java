import java.io.FileWriter;
import java.io.IOException;

public class HtmlGenerator {
    HtmlTag root = new HtmlTag("html", false);

    public void build() {
        HtmlTag head = new HtmlTag("head", false);
        head.addChild(new HtmlTag("title", "Exemplu"));
        HtmlTag body = new HtmlTag("body", false);
        body.addChild(new HtmlTag("h1", "Salutare!"));
        HtmlTag p = new HtmlTag("p", "Paragraf cu ");
        HtmlTag b = new HtmlTag("b", "bold");
        p.addChild(b);
        body.addChild(p);
        body.addChild(new HtmlTag("img", true));
        root.addChild(head);
        root.addChild(body);
    }

    public String toHtml() {
        return "<!DOCTYPE html>\n" + root.render(0);
    }

    public void saveToFile(String filename) throws IOException {
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(toHtml());
        }
    }

    public static void main(String[] args) throws IOException {
        HtmlGenerator gen = new HtmlGenerator();
        gen.build();
        System.out.println(gen.toHtml());
        gen.saveToFile("page.html");
        System.out.println("Fișier generat: page.html");
    }
}