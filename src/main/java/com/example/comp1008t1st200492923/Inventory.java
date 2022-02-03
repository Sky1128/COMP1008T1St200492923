package com.example.comp1008t1st200492923;
import java.util.ArrayList;



public class Inventory {

ArrayList<Phone> phones;

public Inventory (){
    phones = new ArrayList<Phone>();
}

public void addPhone(Phone obj1)
{
    phones.add(obj1);
}
public int getNumOfPhoness()
{
    int numberOfPhones = phones.size();
    return numberOfPhones;
}
public double getInventoryValue()
{
    double inventoryValue = 0;
    for(int i = 0; i < phones.size(); i++){

      inventoryValue = inventoryValue +  phones.get(i).getPrice();
    }
    return inventoryValue;
}

public double getAvgPrice()
{
    if(getNumOfPhoness() == 0)
    {
        return 0;
    }
    else
        return (getInventoryValue()/getNumOfPhoness());
}

    public String toString() {
        String phoneInventory = "Number of Phones: " + getNumOfPhoness() + "Value of Inventory :$" + getInventoryValue();
        return phoneInventory;
    }




}
