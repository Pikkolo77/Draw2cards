package com.example.myapplication;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class cards {

    @SerializedName("cards")
    public ArrayList<Card> card;

//    @SerializedName("success")
//    @Expose
//    private Boolean success;
//    @SerializedName("deck_id")
//    @Expose
//    private String deckId;
//    @SerializedName("shuffled")
//    @Expose
//    private Boolean shuffled;
//    @SerializedName("remaining")
//    @Expose
//    private Integer remaining;
//
//    public Boolean getSuccess() {
//        return success;
//    }
//
//    public void setSuccess(Boolean success) {
//        this.success = success;
//    }
//
//    public String getDeckId() {
//        return deckId;
//    }
//
//    public void setDeckId(String deckId) {
//        this.deckId = deckId;
//    }
//
//    public Boolean getShuffled() {
//        return shuffled;
//    }
//
//    public void setShuffled(Boolean shuffled) {
//        this.shuffled = shuffled;
//    }
//
//    public Integer getRemaining() {
//        return remaining;
//    }
//
//    public void setRemaining(Integer remaining) {
//        this.remaining = remaining;
//    }




    class Card {

        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("value")
        @Expose
        private String value;
        @SerializedName("suit")
        @Expose
        private String suit;
        @SerializedName("code")
        @Expose
        private String code;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getSuit() {
            return suit;
        }

        public void setSuit(String suit) {
            this.suit = suit;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

    }
}







