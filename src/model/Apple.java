package model;

import model.constants.Colour;
import model.constants.Discount;


//Класс наследуется от класса FOOD
public class Apple extends Food implements Discountable{
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    // Реализация метода из интерфейса Discountable
    @Override
    public double getDiscount(){
        if (Colour.RED.equals(colour)) {   // если цвет "red"
            return Discount.RED_APPLE;    // возвращаем 60% скидки
        }
        return 0.0;                   //  без скидки
    }
    }

