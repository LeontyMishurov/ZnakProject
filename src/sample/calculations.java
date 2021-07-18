package sample;

public class calculations {

    int color; // цветность
    int tirag; // тираж
    int p; // плотность
    double summaList; // колличество на листе
    int a4=1;



    public int p80(){

        int i=0;
        double v=0;

        double [] p80m4 = {0,36,30,26.5,23.3,18.2};
        double [] p80m44 = {0,72,55,48,40,32.2};

        double [] p105m4 = {0,40,30,27.5,23.6,18.6};
        double [] p105m44 = {0,76,56,49,40.5,33.5};

        double [] p120m4 = {0,41,31,27.5,24,19};
        double [] p120m44 = {0,77,58,49,41.5,33.5};

        double [] p150m4 = {0,42,32,28.2,24.6,19.5};
        double [] p150m44 = {0,78,59,50,41.5,33.8};

        double [] p200m4 = {0,43,33.5,30,26.4,21.3};
        double [] p200m44 = {0,79,60,51.5,43,35.8};

        double [] p250m4 = {0,44,37,31.2,27.6,22.5};
        double [] p250m44 = {0,80,61,53,44.5,37};

        double [] p300m4 = {0,48,37,33.6,30,24.8};
        double [] p300m44 = {0,83,64,55,47,41.5};

        double [] psm4 = {0,60,50,47,42,38};




        if (tirag>0 && tirag<5) i=1;
        else if (tirag>=5 && tirag<20) i=2;
        else if (tirag>=20 && tirag<50) i=3;
        else if (tirag>=50 && tirag<100) i=4;
        else if (tirag>=100 ) i=5;

        if(p==80 && color==4) {summaList= p80m4[i]/a4; v= (p80m4[i]*tirag)/a4;}
        else if(p==80 && color==44) {summaList= p80m44[i]/a4; v= (p80m44[i]*tirag)/a4;}
        else if(p==80 && color==1) {summaList= (p80m4[i]/a4)/2; v= ((p80m4[i]*tirag)/a4)/2;}
        else if(p==80 && color==11) {summaList= (p80m44[i]/a4)/2; v= ((p80m44[i]*tirag)/a4)/2;}

        if(p==105 && color==4) {summaList= p105m4[i]/a4; v= (p105m4[i]*tirag)/a4;}
        else if(p==105 && color==44) {summaList= p105m44[i]/a4; v= (p105m44[i]*tirag)/a4;}
        else if(p==105 && color==1) {summaList= (p105m4[i]/a4)/2; v= ((p105m4[i]*tirag)/a4)/2;}
        else if(p==105 && color==11) {summaList= (p105m44[i]/a4)/2; v= ((p105m44[i]*tirag)/a4)/2;}

        if(p==120 && color==4) {summaList= p120m4[i]/a4; v= (p120m4[i]*tirag)/a4;}
        else if(p==120 && color==44) {summaList= p120m44[i]/a4; v= (p120m44[i]*tirag)/a4;}
        else if(p==120 && color==1) {summaList= (p120m4[i]/a4)/2; v= ((p120m4[i]*tirag)/a4)/2;}
        else if(p==120 && color==11) {summaList= (p120m44[i]/a4)/2; v= ((p120m44[i]*tirag)/a4)/2;}

        if(p==150 && color==4) {summaList= p150m4[i]/a4; v= (p150m4[i]*tirag)/a4;}
        else if(p==150 && color==44) {summaList= p150m44[i]/a4; v= (p150m44[i]*tirag)/a4;}
        else if(p==150 && color==1) {summaList= (p150m4[i]/a4)/2; v= ((p150m4[i]*tirag)/a4)/2;}
        else if(p==150 && color==11) {summaList= (p150m44[i]/a4)/2; v= ((p150m44[i]*tirag)/a4)/2;}

        if(p==200 && color==4) {summaList= p200m4[i]/a4; v= (p200m4[i]*tirag)/a4;}
        else if(p==200 && color==44) {summaList= p200m44[i]/a4; v= (p200m44[i]*tirag)/a4;}
        else if(p==200 && color==1) {summaList= (p200m4[i]/a4)/2; v= ((p200m4[i]*tirag)/a4)/2;}
        else if(p==200 && color==11) {summaList= (p200m44[i]/a4)/2; v= ((p200m44[i]*tirag)/a4)/2;}

        if(p==250 && color==4) {summaList= p250m4[i]/a4; v= (p250m4[i]*tirag)/a4;}
        else if(p==250 && color==44) {summaList= p250m44[i]/a4; v= (p250m44[i]*tirag)/a4;}
        else if(p==250 && color==1) {summaList= (p250m4[i]/a4)/2; v= ((p250m4[i]*tirag)/a4)/2;}
        else if(p==250 && color==11) {summaList= (p250m44[i]/a4)/2; v= ((p250m44[i]*tirag)/a4)/2;}

        if(p==300 && color==4) {summaList= p300m4[i]/a4; v= (p300m4[i]*tirag)/a4;}
        else if(p==300 && color==44) {summaList= p300m44[i]/a4; v= (p300m44[i]*tirag)/a4;}
        else if(p==300 && color==1) {summaList= (p300m4[i]/a4)/2; v= ((p300m4[i]*tirag)/a4)/2;}
        else if(p==300 && color==11) {summaList= (p300m44[i]/a4)/2; v= ((p300m44[i]*tirag)/a4)/2;}

        if(p==330 && color==4) {summaList= psm4[i]/a4; v= (psm4[i]*tirag)/a4;}
        else if(p==330 && color==1) {summaList= (psm4[i]/a4)/2; v= ((psm4[i]*tirag)/a4)/2;}

        return (int)Math.round(v);

    }
    public int p90(){

        int i=0;
        double v=0;

        double [] p80m4 = {0,14.9,14.9,12.4,11.2,9.9};
        double [] p80m44 = {0,27.4,27.4,22.8,18.2,16.9};

        double [] p105m4 = {0,20.46,15.95,13.31,12.1,10.67};
        double [] p105m44 = {0,35.2,26.73,22.22,17.82,16.5};

        double [] p120m4 = {0,20.9,16.72,13.86,12.54,11.11};
        double [] p120m44 = {0,36.30,27.39,22.8,18.26,16.94};

        double [] p150m4 = {0,21.45,17.38,14.41,12.98,11.55};
        double [] p150m44 = {0,37.4,28.05,23.43,18.7,17.27};

        double [] p200m4 = {0,23.43,19.69,16.39,14.74,13.09};
        double [] p200m44 = {0,38.5,30.36,25.30,20.24,18.70};

        double [] p250m4 = {0,24.75,21.35,17.71,15.95,14.19};
        double [] p250m44 = {0,40.70,32.01,26.73,21.34,19.80};

        double [] p300m4 = {0,27.28,23.32,19.36,17.49,15.51};
        double [] p300m44 = {0,46.8,37.2,30.96,24.72,22.92};

        double [] psm4 = {0,41.80,33.66,25.96,25.41,22.55};




        if (tirag>0 && tirag<50) i=1;
        else if (tirag>=50 && tirag<100) i=2;
        else if (tirag>=100 && tirag<250) i=3;
        else if (tirag>=250 && tirag<500) i=4;
        else if (tirag>=500 ) i=5;

        if(p==80 && color==4) {summaList= p80m4[i]/a4; v= (p80m4[i]*tirag)/a4;}
        else if(p==80 && color==44) {summaList= p80m44[i]/a4; v= (p80m44[i]*tirag)/a4;}
        else if(p==80 && color==1) {summaList= (p80m4[i]/a4)/2; v= ((p80m4[i]*tirag)/a4)/2;}
        else if(p==80 && color==11) {summaList= (p80m44[i]/a4)/2; v= ((p80m44[i]*tirag)/a4)/2;}

        if(p==105 && color==4) {summaList= p105m4[i]/a4; v= (p105m4[i]*tirag)/a4;}
        else if(p==105 && color==44) {summaList= p105m44[i]/a4; v= (p105m44[i]*tirag)/a4;}
        else if(p==105 && color==1) {summaList= (p105m4[i]/a4)/2; v= ((p105m4[i]*tirag)/a4)/2;}
        else if(p==105 && color==11) {summaList= (p105m44[i]/a4)/2; v= ((p105m44[i]*tirag)/a4)/2;}

        if(p==120 && color==4) {summaList= p120m4[i]/a4; v= (p120m4[i]*tirag)/a4;}
        else if(p==120 && color==44) {summaList= p120m44[i]/a4; v= (p120m44[i]*tirag)/a4;}
        else if(p==120 && color==1) {summaList= (p120m4[i]/a4)/2; v= ((p120m4[i]*tirag)/a4)/2;}
        else if(p==120 && color==11) {summaList= (p120m44[i]/a4)/2; v= ((p120m44[i]*tirag)/a4)/2;}

        if(p==150 && color==4) {summaList= p150m4[i]/a4; v= (p150m4[i]*tirag)/a4;}
        else if(p==150 && color==44) {summaList= p150m44[i]/a4; v= (p150m44[i]*tirag)/a4;}
        else if(p==150 && color==1) {summaList= (p150m4[i]/a4)/2; v= ((p150m4[i]*tirag)/a4)/2;}
        else if(p==150 && color==11) {summaList= (p150m44[i]/a4)/2; v= ((p150m44[i]*tirag)/a4)/2;}

        if(p==200 && color==4) {summaList= p200m4[i]/a4; v= (p200m4[i]*tirag)/a4;}
        else if(p==200 && color==44) {summaList= p200m44[i]/a4; v= (p200m44[i]*tirag)/a4;}
        else if(p==200 && color==1) {summaList= (p200m4[i]/a4)/2; v= ((p200m4[i]*tirag)/a4)/2;}
        else if(p==200 && color==11) {summaList= (p200m44[i]/a4)/2; v= ((p200m44[i]*tirag)/a4)/2;}

        if(p==250 && color==4) {summaList= p250m4[i]/a4; v= (p250m4[i]*tirag)/a4;}
        else if(p==250 && color==44) {summaList= p250m44[i]/a4; v= (p250m44[i]*tirag)/a4;}
        else if(p==250 && color==1) {summaList= (p250m4[i]/a4)/2; v= ((p250m4[i]*tirag)/a4)/2;}
        else if(p==250 && color==11) {summaList= (p250m44[i]/a4)/2; v= ((p250m44[i]*tirag)/a4)/2;}

        if(p==300 && color==4) {summaList= p300m4[i]/a4; v= (p300m4[i]*tirag)/a4;}
        else if(p==300 && color==44) {summaList= p300m44[i]/a4; v= (p300m44[i]*tirag)/a4;}
        else if(p==300 && color==1) {summaList= (p300m4[i]/a4)/2; v= ((p300m4[i]*tirag)/a4)/2;}
        else if(p==300 && color==11) {summaList= (p300m44[i]/a4)/2; v= ((p300m44[i]*tirag)/a4)/2;}

        if(p==330 && color==4) {summaList= psm4[i]/a4; v= (psm4[i]*tirag)/a4;}
        else if(p==330 && color==1) {summaList= (psm4[i]/a4)/2; v= ((psm4[i]*tirag)/a4)/2;}

        return (int)Math.round(v);}


}


