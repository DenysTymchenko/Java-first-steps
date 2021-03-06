package Figures;

import Figures.Figure;

public class Triangle extends Figure {
    private double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public Triangle(double size){
        super(size,size);
        c = size;
    }

    @Override
    public double S() {
        double p = (getA()+getB()+c)/2;
        double S = p*(p-getA())*(p-getB())*(p-c);
        return Math.sqrt(S);
    }
}
