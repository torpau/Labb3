package com.company;

class Patient {
    private final String name;
    private String sickness;


    Patient(String name) {
        this(name, null);
    }

    Patient(String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
    }


    String getName() { return name; }
    String getSickness() { return sickness; }

    boolean isSick() { return sickness != null; }

     void takeMedication(Medicine medicine) {
         if(medicine.getTreatmentName().equals(this.sickness)) {
             sickness = null;
         }
    }
}

