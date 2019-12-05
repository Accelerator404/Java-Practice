package edu.zju.week4;

import java.util.ArrayList;

public class Database {
    private ArrayList<Item> listItem = new ArrayList<Item>();
    public Database() {
    }
    public void add(Item item){
        listItem.add(item);
    }
    public void list(){
        for(Item item : listItem){
            item.print();
            System.out.println();
        }
    }
    public static void main(String[] args){
        Database db = new Database();
        db.add(new MP3("Reunion","abc","jd",1,1,".."));
        db.list();
    }
}
