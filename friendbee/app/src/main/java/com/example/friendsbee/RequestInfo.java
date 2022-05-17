package com.example.friendsbee;

public class RequestInfo {
    private String title;
    private String place;
    private String contents;
    private String date;
    private int price;
    private String category;
    private int hour;
    private int min;


    public RequestInfo(String title, String place, String contents, String date, int price, String category, int hour, int min){
        this.title = title;
        this.place = place;
        this.contents = contents;
        this.date = date;
        this.price = price;
        this.category = category;
        this.hour = hour;
        this.min = min;
    }

    public String getTitle() {return this.title;}
    public void setTitle() {this.title = title;}

    public String getPlace() {return this.place;}
    public void setPlace() {this.place = place;}

    public String getContents() {return this.contents;}
    public void setContents() {this.contents = contents;}

    public String getDate() {return this.date;}
    public void setDate() {this.date = date;}

    public int getPrice() {return this.price;}
    public void setPrice() {this.price = price;}

    public String getCategory() {return this.category;}
    public void setCategory() {this.category = category;}

    public int getHour() {return this.hour;}
    public void setHour() {this.hour = hour;}

    public int getMin() {return this.min;}
    public void setMin() {this.min = min;}

}