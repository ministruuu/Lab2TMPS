package Composite;

public class TestCompositePattern {

    public static void main(String[] args) {
        HtmlTag parentTag = new HtmlParentElement("html");

        HtmlTag body = new HtmlParentElement("body");
        HtmlTag div = new HtmlParentElement("div");

        parentTag.addChildTag(body);

        HtmlTag p1 = new HtmlElement("p");
        p1.setTagBody("TMPS");
        body.addChildTag(p1);

        HtmlTag p2 = new HtmlElement("p");
        p2.setTagBody("Composite Pattern");

        HtmlTag h1 = new HtmlElement("h1");
        h1.setTagBody("Hello from h1");

        div.addChildTag(h1);

        body.addChildTag(p1);
        body.addChildTag(p2);
        body.addChildTag(div);


        parentTag.generateHtml(0);

    }

}