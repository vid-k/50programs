package com.basic;

public class ClassWithHash {
    public String empID;
    public String firstname;
    public String lastname;

    public ClassWithHash(String id, String firstname, String lastname){
        this.empID = id;
        this.firstname = firstname;
        this.lastname = this.lastname;
    }

        @Override
        public int hashCode(){
            return empID.length();
        }

        @Override
        public boolean equals(Object o){
            if(((ClassWithHash)o).empID == empID)
                return true;
            else
                return false;
        }
}