package com.company;

class Patient {
    private String name;
    private String sickness;


    Patient(String name) {
        this(name, "");
    }

    Patient(String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
    }


    String getName() { return name; }
    String getSickness() { return sickness; }

    boolean isSick() {
        if(sickness==null||sickness.equals("")) {
            return false;
        }
        return true;
    }

     void takeMedication(Medicine medicin) {
         if(medicin.getTreatmentName().equals(this.sickness)) {
             sickness = "";
         }
    }

}

