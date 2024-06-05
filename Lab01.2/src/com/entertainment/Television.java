package com.entertainment;

import java.util.Objects;

public class Television {
    // instance variiables
    private String brand;
    private int volume;

    // constructors
    public Television() {
        super();
    }

    public Television(String brand, int volume) {
        super();
        setBrand(brand);
        setVolume(volume);
    }

    // Television HAS-A Tuner ( for all things related to channel changing)
    private Tuner tuner = new Tuner();

    // business methods
    public int getCurrentChannel(){
        return tuner.getChannel(); // delagates to contained tuner objects
    }

    public void changeChannel(int channel){
        tuner.setChannel(channel); // delegates to contained tuner object
    }

    // accessor methods

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int hashCode(){
        // This is a poor hash function, because it easily yields "hash collisions"
        //return getBrand().length() + getVolume();

        return Objects.hash(getBrand(), getVolume()); // minimizes the probability of hash code
    }

    @Override
    public boolean equals(Object obj){
        boolean result = false;

        // check that 'obj' is really referring to a Television object
        if(obj instanceof Television){
            // downcast 'obj' to more specific reference type Television
            Television other = (Television) obj;

            // do checks: business equality is defined as brand, volume
            result = Objects.equals(this.getBrand(), other.getBrand()) &&  // null-safe check
                    this.getVolume() == other.getVolume();                 // primitives can't be null
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s: Brand=%s, Volume=%s, Current Channel=%s," +
                getClass().getSimpleName(), getBrand(), getVolume(), getCurrentChannel());
    }
}
