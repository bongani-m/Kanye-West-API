package com.bonganimbigi;

import java.util.Random;
import java.util.UUID;

/**
 * Created by Bongani on 9/19/2016.
 */
public class Quote {
    private long id;
    private String content;
    private String source;
    private String pic;

    public Quote(String content, String source, String pic) {
        this.content = content;
        this.source = source;
        this.pic = pic;
        this.id = new Random(Long.MAX_VALUE - 10 ).nextLong();
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public long getId() {
        return id;
    }


}
