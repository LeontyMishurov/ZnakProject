package sample;

public class Ploter {
    int diller = 0;
    int prise;
    int prise1;
    double w=0;
    double h=0;
    double quantity = 1;

    // переключение диллерской цены
    public int Dillers(){
        if (diller==0)
            return diller=diller+1;
        else return diller=diller-1;
    };
    // расчет площади печатного поля
    public double SPrint() {
        if(w>1570 && h>1570) return 0;
        else {
        double pIzd = (w / 1000) * (h / 1000);
        return pIzd * quantity;}
    }
    // расчет цены печатного поля
    public int prisePrint() {
        if(diller==0){
        double x = SPrint() * prise;
        int y = (int) x;
        return y;}

        else {double x = SPrint() * prise1;
        int y = (int) x;
        return y;}
    }

    // работа со свободным полем
    double priceSVP; // цена свободного поля
    double hRulon;//ширина рулона
    int izdOtrez; // количество изделий на отрезке
    int izdOtrez2; // количество изделий на отрезке 2
    double Parrask; // параметр раскладки
    double Parrask2; // параметр раскладки 2




    //расчет отрезка материала и инициализация многих переменных
    public void Otrez() {
        double x = hRulon / w;
        double y = hRulon / h;
        int x1 = (int) x;
        int y1 = (int) y;

        if (h>hRulon)
            { izdOtrez =  x1;
              Parrask = w;
                Parrask2 = h;}

        else if (w>hRulon) {
            izdOtrez =  y1;
            Parrask = h;
            Parrask2 = w;}

        else {
            izdOtrez = x1;
            izdOtrez2 = y1;
            Parrask = w;
            Parrask2 = h;
        }

    }
    //расчет площади свободного поля
    public double sss() {
        double D=0; //Общая длинна пленки
        double D2=0; //Общая длинна пленки 2
        if((w>1570 && h>1570) || (w==0 || h==0) || izdOtrez == 0) return 0;
        else {
            int x=0;
            while (x<quantity)
            { x=x+izdOtrez;
            D=D+1;}
        if (izdOtrez2>0)
            { int y=0;
            while (y<quantity)
            { y=y+izdOtrez2;
                D2=D2+1;}}
        else D2=D2+1;

           double rp = ((hRulon/1000)*((Parrask/1000)*D2));
           double rp2 = ((hRulon/1000)*((Parrask2/1000)*D));

        double s = rp-(((w/1000)*(h/1000))*quantity);
        double s2 = rp2-(((w/1000)*(h/1000))*quantity);

        if (s>0 && s<s2)
        return  s;
        else if(s<=0&&s2<=0)return 0;

        else if(s2>0 && s>s2)return s2;

        else if(s2<=0||s2==s)return s;

        else if(s<=0)return s2;

        else return 0;}
    }

    //расчет цены свободного поля
    public int PriseSVP(){
        if(w>1570 && h>1570) return 0;
        else {
        double x = (sss())*priceSVP;
        int y = (int) x;
            if (y>0)
       return y;
        else return 0;}
    }

    //расчет общей цены
    public int PriseOb(){
        if(w>1570 && h>1570) return 0;
        else {
        return PriseSVP()+prisePrint();}
    }

}