
package sample;
import com.jfoenix.controls.JFXRadioButton;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;



public class Controller {
    @FXML
    private TextField priseM,PrisePloterPrint,quantity,PPrint,Ssvp,PriseOb,priseSVP;

    @FXML
    private MenuItem baner,pvx,Blueback,Holst,Poster,PerfoPvh,PerfoBaner,FotoP,TransLum,m127,m137,m152,m160;

    @FXML
    private MenuButton mater,HRulon;

    @FXML
    private AnchorPane cifra;

    // текстовые поля инициализация
    @FXML
    private TextField width,height,print,printList,printPrise,Tirag,goods,widthP,heightP;


    // форматы бумаги инициализация

    @FXML
    private JFXRadioButton a4,a3,SRA3,X325,X330;

    // форматы изделия инициализация

    @FXML
    private JFXRadioButton A7E,A6E,A5E,A4E,A3E,A2,A1,A0;

    // плотность бумаги инициализация

    @FXML
    private JFXRadioButton p80,p105,p120,p150,p200,p250,p300,ps;

    // цветность печати инициализация
    @FXML
    private JFXRadioButton p4,p44,p1,p11;

    Ploter ploter = new Ploter();
    calculations calculations = new calculations();



    // работа на ошибкой, ввод текста вместо числа

    public int getNumber(TextField w){
        try {
        return Integer.parseInt(w.getText()); }
        catch (Exception e){return 0;}
    }

    public int gethTirag() {
        try {
            return calculations.tirag = Integer.parseInt(Tirag.getText());
        } catch (Exception e) {
            return 0;
        }
    }

	// при переключении чекбоксов в width и height записываются нужные значения
	private void setP(int w, int h){
		width.setText(String.valueOf(w));
		height.setText(String.valueOf(h));
    }
    private void setPlot(int w, int h){
        widthP.setText(String.valueOf(w));
        heightP.setText(String.valueOf(h));
    }

    // методы установления цены и переключения рулонных материалов
    public void setBaner(){mater.setText(String.valueOf(baner.getText())); ploter.prise1 = 312; ploter.prise = 400; priseM.setText("400 р"); PintPloter(); ploter.priceSVP=100; PintSVP();};
    public void setPVH(){mater.setText(String.valueOf(pvx.getText())); ploter.prise1 = 384; ploter.prise = 480; priseM.setText("480 р"); PintPloter(); ploter.priceSVP=100; PintSVP();};
    public void setBlueback(){mater.setText(String.valueOf(Blueback.getText())); ploter.prise1 = 168; ploter.prise = 280; priseM.setText("280 р"); PintPloter(); ploter.priceSVP=100; PintSVP();};
    public void setHolst(){mater.setText(String.valueOf(Holst.getText())); ploter.prise1 = 1200; ploter.prise = 1600; priseM.setText("1600 р"); PintPloter(); ploter.priceSVP=400; PintSVP();};
    public void setPoster(){mater.setText(String.valueOf(Poster.getText())); ploter.prise1 = 264; ploter.prise = 360; priseM.setText("360 р"); PintPloter(); ploter.priceSVP=100; PintSVP();};
    public void setPerfoPvh(){mater.setText(String.valueOf(PerfoPvh.getText())); ploter.prise1 = 504; ploter.prise = 580; priseM.setText("580 р"); PintPloter(); ploter.priceSVP=100; PintSVP();};
    public void setPerfoBaner(){mater.setText(String.valueOf(PerfoBaner.getText())); ploter.prise1 = 600; ploter.prise = 650; priseM.setText("650 р"); PintPloter(); ploter.priceSVP=100; PintSVP();};
    public void setFotoP(){mater.setText(String.valueOf(FotoP.getText())); ploter.prise1 = 480; ploter.prise = 600; priseM.setText("600 р"); PintPloter(); ploter.priceSVP=150; PintSVP();};
    public void setTransLum(){mater.setText(String.valueOf(TransLum.getText())); ploter.prise1 = 396; ploter.prise = 650; priseM.setText("650 р"); PintPloter(); ploter.priceSVP=100; PintSVP();};

    // методы инициализации переменой ширены рулона и переключение ширины рулона
    public void setM127(){HRulon.setText(String.valueOf(m127.getText())); ploter.hRulon = 1240; PintSVP();};
    public void setM137(){HRulon.setText(String.valueOf(m137.getText())); ploter.hRulon = 1340; PintSVP();};
    public void setM152(){HRulon.setText(String.valueOf(m152.getText())); ploter.hRulon = 1490; PintSVP();};
    public void setM160(){HRulon.setText(String.valueOf(m160.getText())); ploter.hRulon = 1570; PintSVP();};
// подключаем первоначальные настройки
    @FXML
    public void initialize() {

        width.textProperty().addListener(
                (observable, oldValue, newValue) -> Print());
        height.textProperty().addListener(
                (observable, oldValue, newValue) -> Print());
        widthP.textProperty().addListener(
                (observable, oldValue, newValue) -> {setPloter(); PintPloter();PintSVP();});
        heightP.textProperty().addListener(
                (observable, oldValue, newValue) -> {setPloter1(); PintPloter();PintSVP();});
        quantity.textProperty().addListener(
                (observable, oldValue, newValue) -> {PloterQuantity(); PintPloter();PintSVP();});
        goods.textProperty().addListener(
                (observable, oldValue, newValue) -> Printtirag());

        a4.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.a4=2;  Print();});
        a3.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.a4=1;  Print();});
        SRA3.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.a4=1;  Print();});
        X325.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.a4=1;  Print();});
        X330.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.a4=1;  Print();});

        // Возможно Print(); здесь лишний так как setP вызывает width.setText что через событие должно вызвать Print()
        A7E.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { setP(74, 105);  Print();});
        A6E.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { setP(105, 148);  Print();});
        A5E.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { setP(148, 210);  Print();});
        A4E.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { setP(210, 297);  Print();});
        A3E.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { setP(420, 297);  Print();});
        A2.selectedProperty().addListener(
                (observable, oldValue, newValue) -> {setPlot(420,600); ploter.w = 420; ploter.h = 600; PintPloter();});
        A1.selectedProperty().addListener(
                (observable, oldValue, newValue) -> {setPlot(600,840); ploter.w = 600; ploter.h = 840; PintPloter();});
        A0.selectedProperty().addListener(
                (observable, oldValue, newValue) -> {setPlot(840,1200); ploter.w = 840; ploter.h = 1200; PintPloter();});

// работа с классом calculations

        p4.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.color=4;});
        p44.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.color=44;});
        p1.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.color=1;});
        p11.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.color=11;});

        Tirag.textProperty().addListener(
                (observable, oldValue, newValue) -> gethTirag());

        // работа с классом calculations плотность
        p80.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.p=80;});
        p105.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.p=105;});
        p120.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.p=120;});
        p150.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.p=150;});
        p200.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.p=200;});
        p250.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.p=250;});
        p300.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.p=300;});
        ps.selectedProperty().addListener(
                (observable, oldValue, newValue) -> { calculations.p=330;}); }

    // кнопка расчетать инициализируется через SceneBuilder

    // работа над переключателем диллерской цены
    int diller= 0;

    public void Diller(){ Dillers();}

    public void Diller1(){ploter.Dillers();
        PintPloter();
        PintSVP();
        if(ploter.diller==0)
        priseM.setText(String.valueOf(ploter.prise+" р"));
    else priseM.setText(String.valueOf(ploter.prise1+" р")); }

    public int Dillers(){
        if (diller==0)
        return diller=diller+1;
        else return diller=diller-1;
    }

    //присваивает значения длинны и высоты из класса FormatPaper
    public FormatPaper getP() {
        return new FormatPaper(getNumber(width), getNumber(height));
    }


    //присваивание значений переменным высоты и ширины листа в классе FormatPaper.
    public FormatPaper FormatPaper() {
        FormatPaper cc = null;

        if (a4.isSelected()) cc = new FormatPaper(200, 287);
        else if (a3.isSelected())cc = new FormatPaper(410, 287);
        else if (SRA3.isSelected())cc = new FormatPaper(310, 440);
        else if (X325.isSelected())cc = new FormatPaper(315, 460);
        else if (X330.isSelected())cc = new FormatPaper(320, 475);
        return cc;
    }

	//количество изделий на листе
	public int kol(FormatPaper from, FormatPaper to){
        try {
            int x1=to.width/from.width;
			int x2=to.height/from.height;

			int y1=to.width/from.height;
			int y2=to.height/from.width;

			int x=x1*x2;
			int y=y1*y2;

			return (x<y) ? y : x;}
			catch(Exception e){return 0;}
	}

    //автозаполнение текстового поля (тираж)
	public void Printtirag(){
        int count = kol(getP(), FormatPaper());
        if(count >0 && getNumber(goods) >0)
        {int x = getNumber(goods)/count;
    Tirag.setText(String.valueOf(x));}
        else return;
    }

    //автозаполнение текстового поля (количество на листе)
    public void Print() {
	    int count = kol(getP(), FormatPaper());
        print.setText(String.valueOf(count));
        Printtirag();
    }

    //метод кнопки (расчет) выводит на экран цены
    public void click(javafx.event.ActionEvent actionEvent) {
if (diller==0)
{printPrise.setText(String.valueOf(calculations.p80())+" p");
        printList.setText(String.valueOf(calculations.summaList)+" p");}

else {printPrise.setText(String.valueOf(calculations.p90())+" p");
        printList.setText(String.valueOf(calculations.summaList)+" p");}
    }
// методы кнопок переключения страниц в программе (цифра\плотер)
    public void vigin(javafx.event.ActionEvent actionEvent){cifra.setVisible(false);}
    public void viginV(javafx.event.ActionEvent actionEvent){cifra.setVisible(true);}

    //работа над классом плотер)

    //инициализация полей в классе  W и h в классе Ploter
    public void setPloter() {
        ploter.w=getNumber(widthP);
        PintSVP();
    }
    public void setPloter1() {
        ploter.h=getNumber(heightP);
        PintSVP();
    }
    public void PloterQuantity(){
    ploter.quantity=getNumber(quantity);};

    // вывод цены печати плот.
    public  void PintPloter(){

        PrisePloterPrint.setText(String.valueOf(ploter.prisePrint())+" p");

        PPrint.setText(String.format("%.3f",ploter.SPrint())); };

    // основной метод вывода полей плотеры
    public  void PintSVP(){
        ploter.Otrez();

        Ssvp.setText(String.format("%.3f",ploter.sss())); // округление doobl до тысячных

        priseSVP.setText(String.valueOf(ploter.PriseSVP())+" р");


        PriseOb.setText(String.valueOf(ploter.PriseOb())+" р");



        ploter.izdOtrez=0;
        ploter.izdOtrez2=0;

    }
    }

