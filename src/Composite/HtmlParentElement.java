package Composite;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {

    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTag>childrenTag;

    public HtmlParentElement(String tagName){
        this.tagName = tagName;
        this.startTag = "<" + tagName + ">";
        this.endTag = "<" + tagName + ">";
        this.childrenTag = new ArrayList<>();
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
    public void addChildTag(HtmlTag htmlTag){
        childrenTag.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag){
        childrenTag.remove(htmlTag);
    }

    @Override
    public List<HtmlTag>getChildren(){
        return childrenTag;
    }

    @Override
    public void generateHtml(int level) {
        String space = Utilities.getSpaces(level);

        System.out.println(space+startTag);
        for(HtmlTag tag : childrenTag){
            tag.generateHtml(level+1);
        }
        System.out.println(space+endTag);
    }

}
