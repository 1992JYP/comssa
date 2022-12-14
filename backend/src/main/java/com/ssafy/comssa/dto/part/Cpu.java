package com.ssafy.comssa.dto.part;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Map;

@Document(collection="cpu")
@Getter
@Setter
@SuppressWarnings("unused")
public class Cpu {
    @Id
    private String id;
    private Map<String,Object> option;
    private String partsID;
    private String price;
    private String specsID;
    private String title;
    private String imgSrc;
    private String socket;
    private int score;
    private ArrayList<String> PCIeSocket;
    private ArrayList<String> memorySocket;
    private int tdp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getPCIeSocket() {
        return PCIeSocket;
    }

    public void setPCIeSocket(ArrayList<String> PCIeSocket) {
        this.PCIeSocket = PCIeSocket;
    }

    public ArrayList<String> getMemorySocket() {
        return memorySocket;
    }

    public void setMemorySocket(ArrayList<String> memorySocket) {
        this.memorySocket = memorySocket;
    }

    public int getTdp() {
        return tdp;
    }

    public void setTdp(int tdp) {
        this.tdp = tdp;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public Map<String, Object> getOption() {
        return option;
    }

    public void setOption(Map<String, Object> option) {
        this.option = option;
    }

    public String getPartsID() {
        return partsID;
    }

    public void setPartsID(String partsID) {
        this.partsID = partsID;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSpecsID() {
        return specsID;
    }

    public void setSpecsID(String specsID) {
        this.specsID = specsID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Cpu() {
    }
}
