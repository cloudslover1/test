package model;

import javafx.scene.control.TextField;

public class Counter {
    private int k;
    public TextField textField;


    public String getK(){
        this.k ++;
        return "Счетчик: " + k;
    }
    public String setK(int k){

        this.k = k;
        return "Счетчик: " + k;
    }






   @Override
    public String toString() {
        return "Счетчик: " + k;
    }


}
