package com.example.demo.Type;

public enum identifiedType {

    DRIVER_LICENSE("Driver license"),

   ALIEN_REGISTER("Alien registration"),

   NATIONAL_ID("National ID");

    final String text;

    private identifiedType(String text){
    this.text = text;}

        public String getText(){
            return text;
        }

}
