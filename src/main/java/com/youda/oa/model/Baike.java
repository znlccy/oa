package com.youda.oa.model;

import org.dom4j.Comment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/9/6-12:47
 * @Version: v1.0.0
 * @Comment: 百科模型
 */
public class Baike implements Serializable {

    private String id;

    private String desc;

    private List<String> tag = new ArrayList<String>();

    public Comment comment = null;

    public Date createDate = null;

    public Date updateDate = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
