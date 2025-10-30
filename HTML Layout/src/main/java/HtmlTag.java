import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class HtmlTag {
    String name;
    List<HtmlTag> children = new ArrayList<>();
    String text = "";
    boolean selfClosing;

    HtmlTag(String name, boolean selfClosing) {
        this.name = name;
        this.selfClosing = selfClosing;
    }

    HtmlTag(String name, String text) {
        this.name = name;
        this.text = text;
        this.selfClosing = false;
    }

    void addChild(HtmlTag child) {
        if (selfClosing) throw new UnsupportedOperationException("No children for self-closing tags");
        children.add(child);
    }

    String render(int indent) {
        String pad = "  ".repeat(indent);
        if (selfClosing) return pad + "<" + name + " />\n";
        StringBuilder sb = new StringBuilder(pad + "<" + name + ">");
        if (!text.isEmpty()) sb.append(text);
        if (!children.isEmpty()) {
            sb.append("\n");
            for (HtmlTag c : children) sb.append(c.render(indent + 1));
            sb.append(pad);
        }
        sb.append("</" + name + ">\n");
        return sb.toString();
    }
}
