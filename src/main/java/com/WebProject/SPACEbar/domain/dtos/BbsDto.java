package com.WebProject.SPACEbar.domain.dtos;

import lombok.Getter;

@Getter
public class BbsDto {
    private int seq;
    private String id;

    private int ref;
    private int step;
    private int depth;

    private String title;
    private String content;
    private String wdate;

    private int del;
    private int readCount;

    public BbsDto() {

    }

    public BbsDto(int seq, String id, int ref, int step, int depth, String title, String content, String wdate, int del, int readCount){
        this.seq = seq;
        this.id = id;
        this.ref = ref;
        this.step = step;
        this.depth = depth;
        this.title = title;
        this.content = content;
        this.wdate = wdate;
        this.del = del;
        this.readCount = readCount;
    }

    public BbsDto(String id, String title, String content){
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public void setSeq(int seq){
        this.seq = seq;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setRef(int ref){
        this.ref = ref;
    }
    public void setStep(int step){
        this.step = step;
    }
    public void setDepth(int depth){
        this.depth = depth;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setContent(String content){
        this.content = content;
    }
    public void setWdate(String wdate){
        this.wdate = wdate;
    }
    public void setDel(int del){
        this.del = del;
    }
    public void setReadCount(int readCount){
        this.readCount = readCount;
    }

    @Override
    public String toString(){
        return  "seq=" + seq +
                ", id='" + id + '\'' +
                ", ref=" + ref +
                ", step=" + step +
                ", depth=" + depth +
                ", title=" + title +
                ", content=" + content +
                ", wedate=" + wdate +
                ", del=" + del +
                ", readCount=" + readCount;


    }



}
