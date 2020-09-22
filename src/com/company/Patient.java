package com.company;

class Patient {
    private String name;
    private String sickness;
    private String medicin;
    private Boolean stillSick;

    public String getName() { return name; }
    public String getSickness() { return sickness; }

    public boolean isSick(){ return stillSick; }




    public void takeMedication(String med) {
     //inte rätt med mot åkomma sätt  ändrar stillSick till sant eller falskt

    }
}


//Patienten ska ha fyra stycken medlemsmetoder och två stycken konstruktorer.