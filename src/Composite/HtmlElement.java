package Composite;

public class HtmlElement extends HtmlTag{

    private String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;

    public HtmlElement(String tagName){
        this.tagName = tagName;
        this.tagBody = " ";
        this.startTag = "<" + tagName + ">";
        this.endTag = "<" + tagName + ">";
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    @Override
    public void setTagBody(String tagBody){
        this.tagBody = tagBody;
    }

    @Override
    public void generateHtml(int level) {
        String space = Utilities.getSpaces(level);
        System.out.println(space + startTag + "" + tagBody + "" + endTag);
    }

}
