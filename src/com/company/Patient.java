package com.company;

class Patient {
    private String name;
    private String sickness;
    private String medicin;
    private Boolean stillSick;




    Patient(String name) {
        this(name, "");
    }

    Patient(String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
        //this.medicin = medicin;
        this.stillSick = true;
    }



    public String getName() { return name; }
    public String getSickness() { return sickness; }

    public boolean isSick() {
        if(sickness==null||sickness.equals("")) {                    //ev ta bort else
            return false;
        }
        return true;
    }

     public void takeMedication(Medicine medicin) {
         if(medicin.getTreatmentName().equals(this.sickness)){
             sickness = "";
         }

     //inte rätt med mot åkomma sätt  ändrar stillSick till sant eller falskt
        //Medicine(String sickness);

    }
}


//Patienten ska ha fyra stycken medlemsmetoder och två stycken konstruktorer(skapa objektet med dess attribut).

