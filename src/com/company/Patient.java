package com.company;

class Patient {
    private String name;
    private String sickness;


    Patient(String name) {
        this(name, null);
        //this(name, "");
    }

    Patient(String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
    }


    String getName() { return name; }
    String getSickness() { return sickness; }

    boolean isSick() { return sickness != null; }
        //return sickness != null && !sickness.equals("");

     void takeMedication(Medicine medicin) {
         if(medicin.getTreatmentName().equals(this.sickness)) {
             sickness = null;
             //sickness = "";
         }
    }

}

